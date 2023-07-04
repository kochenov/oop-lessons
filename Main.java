public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("Игорь");
        market.addPerson("Вася");
        market.addPerson("Катя");

        System.out.println("Размер очереди: " + market.size()); // Ожидаемый вывод: Queue size: 3

        String nextPerson = market.serveNextPerson();
        System.out.println("Обслужен следующий человек: " + nextPerson); // Ожидаемый вывод: Next person served: John

        System.out.println("Размер очереди после обслуживания: " + market.size()); // Ожидаемый вывод: Queue size after serving: 2

    }
}