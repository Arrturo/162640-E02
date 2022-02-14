package Z2;

import java.util.ArrayList;

public class zadanie2 {
    public static <E, T extends Iterable<E>> void wypiszCoDrugi(T args){
        ArrayList<E> wynik = new ArrayList<>();

        var iterator = args.iterator();
        int count = 0;

        wynik.add(iterator.next());

        while(iterator.hasNext()){
            count += 1;
            E it = iterator.next();
            if(count == 2){
                wynik.add(it);
                count = 0;
            }
        }
        System.out.println(wynik);
    }
}