package Unit;

public class Archer {
    public String name;
    public int power;

    public Archer() {
        this("archer",100);
    }

    public Archer(String name, int power) {
        this.name = name;
        this.power = power;
    }
}
