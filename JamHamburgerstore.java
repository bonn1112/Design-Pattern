package AppliedHamburger;

public class JamHamburgerstore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if ("cheese".equals(type)) {
            return new JamaicanCheeseBurger();
        }else if ("veggie".equals(type)) {
            return new JamaicanVeggieBurger();

        }else  return null;
    }
}
