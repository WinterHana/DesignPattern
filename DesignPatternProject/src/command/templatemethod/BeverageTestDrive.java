package command.templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("1. 홍차");
        tea.prepareRecipe();

        System.out.println("2. 커피");
        coffee.prepareRecipe();
    }
}
