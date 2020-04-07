
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(500);
        arrayList1.add(900);
        // (100, 500, 900];
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(800);
        arrayList1.add(600);
        arrayList1.add(300);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList1.add(400);
        arrayList1.add(700);
        arrayList1.add(200);

        ArrayOrganizer ao = new ArrayOrganizer();
        ArrayList<Integer> sorted;
        sorted = ao.concatAndSort(arrayList1, arrayList2, arrayList3);

        System.out.println(sorted);

    }

}
