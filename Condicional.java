public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        String tipoPlano = "Plus";

        if(nota >= 8.0) {
            System.out.println("Filme bem avaliado: " + nota);
        }else {
            System.out.println("Filme mal avaliado: " + nota);
        }

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme Liberado!");
        }else {
            System.out.println("Deve pagar o plano!");
        }
    }
}
