package StreamAPI;

import java.util.Iterator;

public class Java4 extends Lista {
    public static void main(String[] args) {

        //Java 4
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }
    }
}
