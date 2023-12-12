package TwentiethHW;

import lombok.Getter;

@Getter
public class MaxElements implements Runnable{
    private int[] array;
    int max = Integer.MIN_VALUE;
    public MaxElements(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i : array){
            if (i > max){
                max = i;
            }
        }
    }
}
