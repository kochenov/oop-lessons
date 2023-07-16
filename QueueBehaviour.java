/**
 * Интерфейс QueueBehaviour определяет методы, связанные с работой очереди.
 */
public interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    int size();
    boolean isEmpty();
}