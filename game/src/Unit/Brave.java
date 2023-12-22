package Unit;

import java.util.Random;
import java.util.Scanner;

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

    // 용사 복제 마법 - 생성자를 이용한 인스턴스 복사
    public Brave(Brave brave){
        this.name = brave.name;
        this.power = brave.power;
    }

    public static void main(String[] args){
        System.out.println("game 시작");
        Scanner scanner = new Scanner(System.in);

        System.out.println("용사 생성 이름을 입력하세요: ");
        String heroName = scanner.nextLine();

        System.out.println("용사의 이름은 : "+heroName);
        Brave brave = new Brave(heroName);
        System.out.println("용사의 힘 = " + brave.power);

        System.out.println("용사가 마법으로 궁수를 만들어낸다!");
        Archer archer = new Archer();
        System.out.println("궁수의 힘 = " + archer.power);

        System.out.println("용사자 자신을 복제하는 마법을 쓰다!");
        Brave brave1 = new Brave(brave);
        System.out.println("복제된 용사 이름 = " + brave1.name + " 복제된 용사의 힘 = " + brave1.power);

    }

    public Archer addArcher(){
        Archer archer = new Archer();
        return archer;
    }
}
