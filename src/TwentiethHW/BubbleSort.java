package TwentiethHW;

import lombok.Getter;

@Getter
class BubbleSort implements Runnable {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        bubbleSort();
    }

    private void bubbleSort() {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
