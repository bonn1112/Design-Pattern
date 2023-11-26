package AppliedHamburger;

public class SimpleHamburgerFactory {
    public Hamburger createHamburger(String type){
        Hamburger burger = null;
        //We add types
        if ("cheese".equals(type)) {
            burger = new CheeseBurger();
        } else if ("greek".equals(type)) {
            burger = new GreekBurger();
        } else if ("meatLover".equals(type)) {
            burger = new MeatLover();
        } else if ("veggie".equals(type)) {
            burger = new VeggieBurger();
        } else if ("bunLess".equals(type)) {
            burger = new BunLessBurger();
        }

        return burger;


    }
}
