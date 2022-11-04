package Data_structure.STL.Arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10);

        // add(element)
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // add( index , element )
        al.add(3,100);

        // clear()
        al.clear();
        al.add(10);

        // contains(element)
        System.out.println(al.contains(10));

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // get(index)
        System.out.println( al.get(3));

        // indexOf(element)
        System.out.println( al.indexOf(30));

        // remove(index)
        System.out.println( al.remove(3));
        System.out.println( al.remove("50"));

        // set( index , element )
        al.set(2,1000);

        // size()
        System.out.println( al.size());

        System.out.println(al);


    }
}
