package mvc;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임 : 무리 (+컴포지드)");

        // 오리 전체가 들어가는 flock
        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        // 물오리만 들어가는 flock
        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        // 물오리 무리를 전체 무리에 넣는다.
        flockOfDucks.add(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 : 전체 무리");
        simulate(flockOfDucks);

        System.out.println("\n오리 시뮬레이션 게임 : 물오리 무리");
        simulate(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 (+ 옵저버)");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("오리가 소리 낸 횟수 : " + QuackCounter.getNumberOfQuacks() + "번");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
