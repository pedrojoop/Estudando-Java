public class Main {

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        // ano de lançamento
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);

        // esta no catalogo?
        boolean incluidoNoPlano = true;

        if (incluidoNoPlano == true) {
            System.out.println("Incluido no Plano");
        } else if (incluidoNoPlano == false) {
            System.out.println("Não incluido no Plano");
        }

        // nota no imdb
        double nota = 8.1;

        // media de notas entre imdb e minha
        double media = (8.0 + 7.0) / 2;

        System.out.println("Nota: " + nota);
        System.out.println("Essa é a média de avaliação: " + media);

        // sinopse usando string de quebra de linha
        String sinopse = """
        Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, 
        Pete \"Maverick\" Mitchell está de volta, rompendo os limites como um piloto de testes
        corajoso. No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o fator humano ainda é essencial.
        """;
        System.out.println("Sinopse: " + sinopse);

    }
}