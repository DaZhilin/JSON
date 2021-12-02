import lombok.Data;

@Data
public class Hero {

    private String name;

    private int age;

    private String label;

    private String hairColor;

    public Hero(String name, int age, String label, String hairColor) {
        this.name = name;
        this.age = age;
        this.label = label;
        this.hairColor = hairColor;
    }
}
