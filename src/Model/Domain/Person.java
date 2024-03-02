package Model.Domain;

/**
 * Абстрактный класс человека со свойствами "имя" и "возраст". Представляет собой структура для дальнейшего наследования.
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * Конструктор класса Person
     * @param name имя человека
     * @param age возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @apiNote Метод получения имени человека.
     * @return имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * @apiNote Метод присвоения имени человеку.
     * @param name имя человека для присвоения.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @apiNote Метод получения возраста человека.
     * @return возраст человека.
     */
    public int getAge() {
        return age;
    }
    /**
     * @apiNote Метод присвоения возраста человеку.
     * @param age возраст человека для присвоения.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @apiNote Метод для вывода в консоль данных о человеке.
     * @return строку с данными о человеке.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

