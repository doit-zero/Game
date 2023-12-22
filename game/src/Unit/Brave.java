package Unit;

import java.util.Random;

public class Brave {
    private String name;

    private int power;

    public Brave() {
    }
    public Brave(String name) {
        this.name = name;
        Random random = new Random();
        this.power = random.nextInt(900) + 100;
    }

    public static void main(String[] args){
        System.out.println("game 시작");
        System.out.println("용사 생성 이름은 joon");
        Brave brave = new Brave("joon");
        System.out.println("용사의 힘 = " + brave.power);
        System.out.println("용사가 마법으로 궁수를 만들어낸다!");
        Archer archer = new Archer();
        System.out.println("궁수의 힘 = " + archer.power);

    }

    public Archer addArcher(){
        Archer archer = new Archer();
        return archer;
    }
}
