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

        while (!market.isEmpty()) {
            market.update(); // Обработка заказов
            if (market.size() != 0) {
                System.out.println("Размер очереди после обслуживания: " + market.size() + "\n******");
            }

        }

        System.out.println("Все клиенты обработаны. Очередь пуста.");


    }
}