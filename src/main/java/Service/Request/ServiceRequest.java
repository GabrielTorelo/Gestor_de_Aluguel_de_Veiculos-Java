package Service.Request;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ServiceRequest {

    private static final String URLBASE = "http://localhost:5000/";
    private String responseBody;
    private static ServiceRequest instance;
    private final CloseableHttpClient clientHTTP;

    private ServiceRequest() {
        this.responseBody = "";
        this.clientHTTP = HttpClients.createDefault();
    }

    public static ServiceRequest getInstance() {
        if (instance == null) {
            instance = new ServiceRequest();
        }

        return instance;
    }

    public String doRequestGET(String path) {
        try {
            HttpGet httpGet = new HttpGet(ServiceRequest.URLBASE + path);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();

                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Status inesperado! Status: " + status + " | Resposta: " + response);
                }
            };

            responseBody = this.clientHTTP.execute(httpGet, responseHandler);
        } catch (IOException exception) {
            Logger.getLogger(ServiceRequest.class.getName()).log(Level.SEVERE, null, exception);
        }

        return responseBody;
    }

    public String doRequestPOST(String path, String body) throws UnsupportedEncodingException {
        StringEntity params = new StringEntity(
                body,
                ContentType.APPLICATION_JSON);

        try {
            HttpPost httpPost = new HttpPost(ServiceRequest.URLBASE + path);
            httpPost.setEntity(params);

            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();

                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    responseBody = EntityUtils.toString(response.getEntity());
                    throw new ClientProtocolException("Status inesperado! Status: " + status + " | " + EntityUtils.toString(response.getEntity()));
                }
            };

            responseBody = this.clientHTTP.execute(httpPost, responseHandler);
        } catch (IOException exception) {
            return responseBody;
        }

        return responseBody;
    }

    public String doRequestDELETE(String path) {
        try {
            HttpDelete httpDelete = new HttpDelete(ServiceRequest.URLBASE + path);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();

                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Status inesperado! Status: " + status + " | Resposta: " + response);
                }
            };

            this.clientHTTP.execute(httpDelete, responseHandler);
        } catch (IOException exception) {
            Logger.getLogger(ServiceRequest.class.getName()).log(Level.SEVERE, null, exception);
        }

        return "Excluido com sucesso!";
    }
}
