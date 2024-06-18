public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры горячих напитков
        HotDrink coffee = new HotDrink("Coffee", 300);
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Tea", 200, 80);

        // Создаем экземпляр автомата горячих напитков
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        // Получаем продукты из автомата
        HotDrink coffeeCup = vendingMachine.getProduct("Coffee", 250);
        HotDrinkWithTemperature teaCup = vendingMachine.getProduct("Tea", 200, 80);

        // Выводим результаты
        System.out.println("Received: " + coffeeCup);
        System.out.println("Received: " + teaCup);
    }
}
