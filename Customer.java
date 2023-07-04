/**
 * Класс Customer представляет покупателя в магазине.
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя покупателя.
     *
     * @return имя покупателя
     */
    public String getName() {
        return name;
    }
}