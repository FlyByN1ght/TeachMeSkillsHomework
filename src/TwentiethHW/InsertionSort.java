package TwentiethHW;

import lombok.Getter;

@Getter
class InsertionSort implements Runnable {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        insertionSort();
    }

    private void insertionSort() {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
