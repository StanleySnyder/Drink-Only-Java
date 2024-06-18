import java.util.HashMap;
import java.util.Map;

public class HotDrinkVendingMachine implements VendingMachine {
    private Map<String, HotDrink> menu;

    public HotDrinkVendingMachine() {
        this.menu = new HashMap<>();
        // Здесь можно инициализировать меню напитков по умолчанию
        // Например:
        menu.put("Coffee", new HotDrink("Coffee", 250));
        menu.put("Tea", new HotDrinkWithTemperature("Tea", 200, 80));
    }

    @Override
    public HotDrink getProduct(String name, int volume) {
        if (menu.containsKey(name)) {
            HotDrink drink = menu.get(name);
            if (drink.getVolume() >= volume) {
                return new HotDrink(name, volume);
            } else {
                System.out.println("Not enough volume available for " + name);
            }
        } else {
            System.out.println(name + " is not available in this vending machine");
        }
        return null;
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        if (menu.containsKey(name)) {
            HotDrink drink = menu.get(name);
            if (drink instanceof HotDrinkWithTemperature) {
                HotDrinkWithTemperature hotDrink = (HotDrinkWithTemperature) drink;
                if (hotDrink.getVolume() >= volume && hotDrink.getTemperature() == temperature) {
                    return new HotDrinkWithTemperature(name, volume, temperature);
                } else {
                    System.out.println("Not enough volume available or wrong temperature for " + name);
                }
            } else {
                System.out.println(name + " does not support temperature specification");
            }
        } else {
            System.out.println(name + " is not available in this vending machine");
        }
        return null;
    }
}
