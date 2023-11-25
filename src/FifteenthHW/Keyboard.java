package FifteenthHW;

public class Keyboard implements ComputerElements {
    private String name;
    private int keys;

    public Keyboard(String name, int keys) {
        this.name = name;
        this.keys = keys;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getKeys() {
        return keys;
    }
}
