package Unit;

public class Archer  implements fightable{
    private String name;
    private int power;

    public Archer() {
        this("archer",100);
    }

    public Archer(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String attack() {
        return null;
    }
    public String attack(int power) {
        return power + "로 공격";
    }

    @Override
    public String defense() {
        return null;
    }
}
