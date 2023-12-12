package TwentiethHW;

import lombok.Getter;

@Getter
public class MinElements implements Runnable{
    private int[] array;
    int min = Integer.MAX_VALUE;

    public MinElements(int[] array) {
        this.array = array;
    }


    @Override
    public void run() {
        for (int i : array){
            if (i < min){
                min = i;
            }
        }
    }
}
