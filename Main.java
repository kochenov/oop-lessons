public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("Игорь");
        market.addPerson("Вася");
        market.addPerson("Катя");
        market.addPerson("Ирина");
        market.addPerson("Валентина");
        market.addPerson("Егор");

        System.out.println("Размер очереди: " + market.size());

        for (String person : market) {
            market.update();
            System.out.println("Размер очереди после обслуживания: " + market.size() + "\n");
        }

        System.out.println("Все клиенты обработаны. Очередь пуста.");
    }
}