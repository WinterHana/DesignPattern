package strategy;


public class NotUseStrategy {
    public static void main(String[] args) {
        return;
    }
}

// 전략 패턴을 사용하지 않은 예시
/**
 * 평범한 상속 패턴으로 이 코드에서는 괜찮지만, 만약 공격 기능을 부모 클래스인 Aris에 넣을 때,
 * 공격을 하지 못하는 힐러에 대해 불필요한 코드 낭비가 발생할 수 있다.
 * 또한 각 클래스의 attack이 바뀔 때마다 일일이 찾아서 따로 바꿔야하는 불편함이 있다.
 */

/*
abstract class Aris {
    void move() {
        System.out.println("앞으로 이동합니다!");
    }

    abstract void attack();
    abstract void printInfo();
}

class Warrior extends Aris {
    @Override
    void attack() {
        System.out.println("칼로 공격합니다!");
    }

    @Override
    void printInfo() {
        System.out.println("전사 아리스입니다!");
    }
}

class Wizard extends Aris {
    @Override
    void attack() {
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
    void attack() {
        // 공격을 못해서 공백 처리해야함.
    }

    @Override
    void printInfo() {
        System.out.println("힐러 아리스입니다!");
    }
}

class Assassin extends Aris {
    @Override
    void attack() {
        System.out.println("표창으로 공격합니다!");
    }

    @Override
    void printInfo() {
        System.out.println("도적 아리스입니다!");
    }
}
*/