package TwentiethHW;

import lombok.Getter;

@Getter
class SelectionSort implements Runnable {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        selectionSort();
    }

    private void selectionSort() {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
