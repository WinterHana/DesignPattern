package strategy;

import java.util.ArrayList;
import java.util.List;

public class UseStrategy {
    public static void main(String[] args) {
        List<Aris> arises = new ArrayList<>();
        Aris warriorAris = new Warrior();
        Aris wizardAris = new Wizard();
        Aris healerAris = new Healer();
        Aris assassinAris = new Assassin();

        arises.add(warriorAris); arises.add(wizardAris); arises.add(healerAris); arises.add(assassinAris);

        for (Aris aris : arises) {
            aris.printInfo();
            aris.attack();
        }
    }
}

interface AttackBehavior {
    void attack();
}

class NotAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("저는 공격을 못합니다...");
    }
}

class UseSwordAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("칼로 공격합니다!");
    }
}

class UseMagicAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("마법으로 공격합니다!");
    }
}

class UseThrowingStarAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("표창으로 공격합니다!");
    }
}

abstract class Aris {
    AttackBehavior attackBehavior;

    public Aris() {}

    public void attack() {
        attackBehavior.attack();
    }

    void move() {
        System.out.println("앞으로 이동합니다!");
    }
    abstract void printInfo();
}

class Warrior extends Aris {
    public Warrior() {
        attackBehavior = new UseSwordAttack();
    }

    @Override
    void printInfo() {
        System.out.println("전사 아리스입니다!");
    }
}

class Wizard extends Aris {
    public Wizard() {
        attackBehavior = new UseMagicAttack();
    }

    @Override
    void printInfo() {
        System.out.println("마법사 아리스입니다!");
    }
}

// 힐러는 공격을 못한다.
class Healer extends Aris {
    public Healer() {
        attackBehavior = new NotAttack();
    }

    @Override
    void printInfo() {
        System.out.println("힐러 아리스입니다!");
    }
}

class Assassin extends Aris {
    public Assassin() {
        attackBehavior = new UseThrowingStarAttack();
    }

    @Override
    void printInfo() {
        System.out.println("도적 아리스입니다!");
    }
}
