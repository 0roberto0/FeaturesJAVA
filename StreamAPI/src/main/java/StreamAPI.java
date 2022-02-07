import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,3,6,5,8,9,1,4,7,8,2);

        //Java 4
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }

        //Java 5 FOR EACH "LIMITAÇÃO não consegue alterar a lista enquanto percorre"
        for (Integer integer : lista) {
            System.out.println(integer);
        }

        //Java 8 - COM STREAM e lambda
        // Stream é um fluxo de dados / Aonde cada um desses dados é um elemento da lista que percorre o stream
        lista.stream().forEach(e -> System.out.println(e));


    }
}
