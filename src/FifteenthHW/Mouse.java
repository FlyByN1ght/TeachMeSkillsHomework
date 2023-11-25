package FifteenthHW;

public class Mouse implements ComputerElements {
    private String name;
    private int buttons;

    public Mouse(String name, int buttons) {
        this.name = name;
        this.buttons = buttons;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getButtons() {
        return buttons;
    }
}