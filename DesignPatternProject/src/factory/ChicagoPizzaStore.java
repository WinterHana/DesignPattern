package factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
