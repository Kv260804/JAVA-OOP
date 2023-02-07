public class Program {
    public static void main(String[] args) {
        Owner hum = new Owner("Алексей", 41, "мужчина", "Никитич");
        Owner hum1 = new Owner("Марина", 40, "женщина", "Дымок");
        Cat cat = new Cat("Никитич", 2, "Алексей");
        Dog dog = new Dog("Дымок", 2, "Марина");
        hum.speak();
        cat.speak();
        hum1.speak();
        dog.speak();
    }
}
