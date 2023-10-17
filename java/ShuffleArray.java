package java;
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with values 1, 2, 3, 4, 5, 6, 7
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(arrayList);

        // Convert the ArrayList back to an array
        Integer[] shuffledArray = arrayList.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array:");
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
