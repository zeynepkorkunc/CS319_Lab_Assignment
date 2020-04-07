
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

        Player tom = new Player("Tom");
        Player john = new Player("John");
        Player james = new Player("James");
        Player henry = new Player("Henry");

        Die die = new Die();
        
        for(int i = 0; i < 5; i++){
            int point = die.rollDie();
            tom.addScore(point); 
        }
        for(int i = 0; i < 5; i++){
            int point = die.rollDie();
            john.addScore(point); 
        }
        for(int i = 0; i < 5; i++){
            int point = die.rollDie();
            james.addScore(point); 
        }
        for(int i = 0; i < 5; i++){
            int point = die.rollDie();
            henry.addScore(point); 
        }

        System.out.println("Tom has " + tom.getScore() + " points." );
        System.out.println("John has " + john.getScore() + " points." );
        System.out.println("James has " + james.getScore() + " points." );
        System.out.println("Henry has " + henry.getScore() + " points." );
    }

}
