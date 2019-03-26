public class Test1 {
    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDesc()+" $"+beverage.cost());
//
//        Beverage beverage2 = new Espresso();
//        beverage2 = new Mocha(beverage2);
//        System.out.println(beverage2.getDesc()+" $"+beverage2.cost());

        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }
}
