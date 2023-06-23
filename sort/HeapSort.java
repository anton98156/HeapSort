package sort;

public class HeapSort {

    public void sort(int array[]) {
        
        int len = array.length;

        for (int i = len / 2 - 1; i >= 0; i--)
            heap(array, len, i);

        for (int i = len -  1; i >= 0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }
    }

    private void heap(int array[], int len, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < len && array[left] > array[largest])
            largest = left;

        if (right < len && array[right] > array[largest])
            largest = right;

        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heap(array, len, largest);
            
        }
    }
}