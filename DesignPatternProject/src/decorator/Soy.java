package decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == SIZE.TALL) cost += 0.10;
        if(beverage.getSize() == SIZE.GRANDE) cost += 0.15;
        if(beverage.getSize() == SIZE.VENTI) cost += 0.20;
        return cost;
    }
}
