package command.templatemethod;

public class Tea extends CaffeinBeverage {

    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중...");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중...");
    }
}
