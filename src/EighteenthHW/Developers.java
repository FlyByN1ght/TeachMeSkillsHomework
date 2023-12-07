package EighteenthHW;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Developers {
    private int id;
    private String name;

    public Developers(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
