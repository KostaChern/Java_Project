import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;

import NoutLibrary.Nout;

public class App {
    public static void main(String[] args) throws Exception {

    //    int[] randomArray = OriginNumFinder.Finder.getRandomArray(300, 25);
    //    Set<Integer> randomSet = OriginNumFinder.Finder.arrayToSet(randomArray);
    //    System.out.println("Процент уникальности чисел: "+OriginNumFinder.Finder.percenter(randomArray, randomSet));

// Nout oneNout= new Nout("Honor", "China", 17, "Intel Core i5 12450H 3.3 ", 8, "Intel Iris Xe Graphics", "Sat, April 4, 2021", 155, 2500, false, 455);
//        Nout twoNout= new Nout("Apple MacBook Air 13", "China", 13, "Apple M1", 8, "Apple", "Apple M1"i, 5514, 2100, false, 0);

       SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
       Nout oneNout= new Nout("Honor; ", "China; ", 17, "Intel Core i5 12450H 3.3; ", 8, "Intel Iris Xe Graphics; ", 154, 3100, false, 12345);
       Nout twoNout= new Nout("Apple MacBook Air 13; ", "China; ", 18, "Apple M1; ", 8, "Apple; ", 252, 2900, false, 12456);

       HashSet<Nout> noutSet = new HashSet<Nout>();
       noutSet.add(oneNout);
       noutSet.add(twoNout);

       System.out.println(oneNout);
       System.out.println(twoNout);

       System.out.println(oneNout.equals(twoNout));
       System.out.println(noutSet.contains(twoNout));


    }

   
}
