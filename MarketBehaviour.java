/**
 * Интерфейс MarketBehaviour определяет методы, связанные с добавлением и удалением людей из очереди, а также обновлением состояния магазина.
 */
interface MarketBehaviour {
    void addPerson(String person);
    String serveNextPerson();
    void update();
}