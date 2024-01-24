package Unit;

public class Enemy extends Unit implements fightable{

    public Enemy(String name, int power, int hp, int defense) {
        super(name, power, hp, defense);
    }

    @Override
    public String attack() {
        return "공격";
    }

    @Override
    public String defense() {
        return null;
    }
}
