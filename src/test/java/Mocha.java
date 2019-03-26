public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+",Mocha";
    }

    public double cost() {
        return 0.20+beverage.cost();
    }
}
