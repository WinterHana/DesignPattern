package factory;

public class NYPizaaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesPizza();
        }
        return null;
    }
}
