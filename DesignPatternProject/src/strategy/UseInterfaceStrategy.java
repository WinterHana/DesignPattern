package strategy;

public class UseInterfaceStrategy {
    public static void main(String[] args) {
        return;
    }
}

// 인터페이스를 사용하는 방법
/**
 * 여전히 문제점이 있다면
 * 1. 인터페이스는 안의 코드를 구현하지 못하므로 코드 재사용성에 불리함이 있다.
 * 2. 여전히 행동을 바꿀 일이 있다면 코드를 일일이 고쳐야 한다는 불편함이 있다.
 */

/*
interface attackable {
    void attack();
}

abstract class Aris {
    void move() {
        System.out.println("앞으로 이동합니다!");
    }
    abstract void printInfo();
}

class Warrior extends Aris implements attackable {
    @Override
    public void attack() {
        System.out.println("칼로 공격합니다!");
    }

    @Override
    void printInfo() {
        System.out.println("전사 아리스입니다!");
    }
}

class Wizard extends Aris implements attackable {
    @Override
    public void attack() {
        System.out.println("마법으로 공격합니다!");
    }
    
    @Override
    void printInfo() {
        System.out.println("마법사 아리스입니다!");
    }
}

// 힐러는 공격을 못한다.
class Healer extends Aris {
    @Override
    void printInfo() {
        System.out.println("힐러 아리스입니다!");
    }
}

class Assassin extends Aris implements attackable {
    @Override
    public void attack() {
        System.out.println("표창으로 공격합니다!");
    }

    @Override
    void printInfo() {
        System.out.println("도적 아리스입니다!");
    }
}
*/