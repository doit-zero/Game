package Unit;

import java.util.Random;



public class Brave extends Unit {


    public Brave() {
        super();
    }
    public Brave(String name) {

    }

    // 용사 복제 마법 - 생성자를 이용한 인스턴스 복사
    public Brave(Brave brave){
    }
    public Archer makeArcher(){
        return new Archer();
    }
}
