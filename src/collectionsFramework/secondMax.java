package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class secondMax {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,6,5,4,5,6,756,654,3454,6545};
        System.out.println("Basic array");
        System.out.println(Arrays.toString(arr));
        ArrayList arrayList = new ArrayList<>(Arrays.asList((arr)));
        System.out.println("ArrayList now");
        System.out.println(arrayList);
        System.out.println("Size " + arrayList.size());

        //ArrayList arrayList1 = new TreeSet<>(arrayList);
        System.out.println("Remove duplicates");
        //System.out.println(hash);
        //System.out.println("Size " + hash.size());




    }
}
