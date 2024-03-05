package command.adapter;

public class DuckTestDrive {
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("1. 칠면조");
        turkey.gobble();
        turkey.fly();

        System.out.println("2. 오리");
        testDuck(duck);

        System.out.println("3. 칠면조 어댑터");
        testDuck(turkeyAdapter);
    }
}
