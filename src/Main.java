import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
/*
        double blusao = 20.89;
        double camisa = 29.99;
        double shortJeans = 35.25;

    double b = (int) blusao;
    double c = (int) camisa;
    double sJ = (int) shortJeans;

        System.out.println(b);
        System.out.println();
        System.out.println("Preço: R$" + b + " R$" + c + " R$" + sJ);
        */
        double larissa = 9.6;
        double larissa2 = 7.5;
        double larissa3 = 5.0;

        double media = (larissa + larissa2 + larissa3) / 3;
        DecimalFormat formatadorEmDecimal = new DecimalFormat("#0.0");

        String mediaFormatada = formatadorEmDecimal.format(media);

        System.out.println(mediaFormatada);
    }
}