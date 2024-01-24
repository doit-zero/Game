import Unit.Archer;
import Unit.Brave;
import Unit.Enemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("game 시작");
        Scanner scanner = new Scanner(System.in);

        System.out.println("용사 생성 이름을 입력하세요: ");
        String heroName = scanner.nextLine();

        System.out.println("용사의 이름은 : "+heroName);
        Brave brave = new Brave(heroName);



        System.out.println("용사가 마법으로 궁수를 만들어낸다!");
        Archer archer = brave.makeArcher();
        System.out.println("궁수의 힘 = " + archer.getPower());


        System.out.println("용사자 자신을 복제하는 마법을 쓰다!");
        Brave brave1 = new Brave(brave);

        System.out.println("적 등장");
        Enemy enemy = new Enemy("ff",123,123,12312);

        System.out.println(enemy.attack());

    }
}