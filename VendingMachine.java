public interface VendingMachine {
    HotDrink getProduct(String name, int volume);
    HotDrinkWithTemperature getProduct(String name, int volume, int temperature);
}
