import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

/**
 * Класс Market реализует методы из интерфейсов QueueBehaviour и MarketBehaviour.
 * Он имитирует работу очереди в магазине и обновление состояния магазина.
 */
public class Market implements QueueBehaviour, MarketBehaviour, Iterable<String> {

    /**
     * Коллекция, представляющая очередь в магазине.
     */
    private Queue<String> queue;

    public Market() {
        queue = new LinkedList<>();
    }

    /**
     * Добавляет человека в очередь.
     *
     * @param person имя человека
     */
    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    /**
     * Удаляет человека из очереди и возвращает его имя.
     *
     * @return имя человека, удаленного из очереди
     */
    @Override
    public String dequeue() {
        return queue.poll();
    }

    /**
     * Возвращает количество людей в очереди.
     *
     * @return количество людей в очереди
     */
    @Override
    public int size() {
        return queue.size();
    }

    /**
     * Проверяет, пуста ли очередь.
     *
     * @return true, если очередь пуста, иначе false
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Добавляет человека в очередь.
     *
     * @param person имя человека
     */
    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    /**
     * Обслуживает следующего человека в очереди и возвращает его имя.
     *
     * @return имя следующего человека в очереди
     */
    @Override
    public String serveNextPerson() {
        return dequeue();
    }

    /**
     * Обновляет состояние магазина путем принятия и отдачи заказов.
     */
    @Override
    public void update() {
        if (!isEmpty()) {
            // Получаем следующего человека в очереди
            String nextPerson = serveNextPerson();

            // Обрабатываем заказ покупателя
            processOrder(nextPerson);

            System.out.println("Обработан заказ для покупателя: " + nextPerson);
        } else {
            System.out.println("Очередь пуста. Нет заказов для обработки.");
        }
    }

    private void processOrder(String person) {
        // В данном методе можно реализовать логику обработки заказа для покупателя
        // Например, можно сгенерировать случайное время обработки и задержку с помощью Thread.sleep()
        // Для примера, просто выведем информацию о том, что заказ обрабатывается
        System.out.println("Обрабатывается заказ для покупателя: " + person);
        try {
            Thread.sleep(2000); // Задержка в 2 секунды для имитации обработки заказа
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Возвращает итератор для обхода элементов очереди.
     *
     * @return итератор для обхода элементов очереди
     */
    @Override
    public Iterator<String> iterator() {
        Queue<String> queueCopy = new LinkedList<>(queue);
        return queueCopy.iterator();
    }
}