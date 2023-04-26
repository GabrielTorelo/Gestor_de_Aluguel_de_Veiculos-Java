package Util;

import Exception.DateFormatterNegException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    //Checa se String contém espaços vazios
    public static boolean checarEspacoVazio(String string) {
        Pattern regexEspaco = Pattern.compile("\\s");
        Matcher possuiEspaco = regexEspaco.matcher(string);

        return possuiEspaco.find();
    }

    //Formata String para Real (R$ 00.000,00)
    public static String formataReal(String string) {
        if (string.length() == 4) {
            string = string.substring(0, 1)
                    + "."
                    + string.substring(1, 4);
        } else if (string.length() == 5) {
            string = string.substring(0, 2)
                    + "."
                    + string.substring(2, 5);
        }

        return "R$ " + string + ",00";
    }

    //Converte String para Date
    public static Date stringParaDate(String string) throws DateFormatterNegException {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(string);
        } catch (ParseException ex) {
            throw new DateFormatterNegException();
        }
    }

    //Retorna data atual
    public static Date dataAtual() {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();

            return stringParaDate(dateFormat.format(date));
        } catch (DateFormatterNegException dfne) {
            System.out.println("Erro ao tentar formatar String para Date!");

            return null;
        }
    }

    //Retorna um inteiro com a duração entre a data de hoje e a data passada.
    public static int duracaoEntreDatas(String dataString) {
        try {
            Date dataAtual = dataAtual();
            Date data = stringParaDate(dataString);
            long diferencaDataTime = 0;

            if (dataAtual.getTime() < data.getTime()) {
                diferencaDataTime = data.getTime() - dataAtual.getTime();
            } else if (dataAtual.getTime() == data.getTime()) {
                diferencaDataTime = 86400000;
            }

            return (int) (diferencaDataTime / (1000 * 60 * 60 * 24));
        } catch (DateFormatterNegException dfne) {
            System.out.println("Erro ao tentar formatar String para Date!");
            return 0;
        }
    }
}
