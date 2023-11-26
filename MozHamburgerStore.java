package AppliedHamburger;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if ("cheese".equals(type)) {
            return new MozambicanCheeseBurger();
        }else if ("Veggie".equals(type)) {
            return new MozambicanVeggieBurger();

        }else  return null;

    }
}
