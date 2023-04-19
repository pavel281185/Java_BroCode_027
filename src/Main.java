public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Pavel", 37, 93.5);
        Human human2 = new Human("Tony", 100, 154.6);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();
    }
}