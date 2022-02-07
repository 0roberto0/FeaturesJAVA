package StreamAPI;

public class Java8 extends Lista {
    public static void main(String[] args) {

        //Java 8 - COM STREAM e lambda
        // Stream é um fluxo de dados / Aonde cada um desses dados é um elemento da lista que percorre o stream
        lista.stream().forEach(e -> System.out.println(e));

        lista.stream()
                // Opereações intermediárias.
                .skip(2)
                .limit(2)
                .distinct() // Utiliza equals and hashcode
                // Operação final
                .forEach(e -> System.out.println(e));

        //Filtro personalizado

        lista.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println("Filtro personalizado: " + e));

        //Transformar os dados // ESSE MAP não tem nada relação com o MAP, chave/VALOR do java

        lista.stream()
                .map(e -> e * 2) // Lista original não é modificada
                .forEach(e -> System.out.println("Transformar os dados / 'MAP' do stream: " + e));

        System.out.println("Lista sem alteração: " + lista);
    }
}
