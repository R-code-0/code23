import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 2);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(r.nextInt(0, 2));
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i : array) {
            linkedList.add(r.nextInt(0, 2));
        }
        System.out.println("Array:      " + Arrays.toString(array));
        System.out.println("Sorted:     " + Arrays.toString(sort(array)) + '\n');
        System.out.println("ArrayList:  " + arrayList);
        System.out.println("Sorted:     " + sort(arrayList) + '\n');
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Sorted:     " + sort(linkedList));
    }

    static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    static ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }

    static LinkedList<Integer> sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        return linkedList;
    }
}