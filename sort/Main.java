package sort;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 9;
        array1[1] = 3;
        array1[2] = 7;
        array1[3] = 2;
        array1[4] = 4;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        HeapSort sorting = new HeapSort();
        sorting.sort(array1);

        System.out.println("-------------------------");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}