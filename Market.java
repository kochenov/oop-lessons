import java.util.LinkedList;
import java.util.Queue;

/**
 * Класс Market реализует методы из интерфейсов QueueBehaviour и MarketBehaviour.
 * Он имитирует работу очереди в магазине и обновление состояния магазина.
 */
public class Market implements QueueBehaviour, MarketBehaviour {

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
        // Реализация обновления состояния магазина
        // ...
    }}