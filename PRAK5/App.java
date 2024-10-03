public class App {
    public static void main(String[] args) {

        Spider spider = new Spider();
        spider.setName("Johny");
        System.out.println("Nama spidernya adalah: " + spider.getName());

        spider.eat();        

        Dog dog = new Dog();
        dog.setName("Haikal");
        System.out.println("Nama anjingnya adalah: " + dog.getName());

        dog.play();
        dog.eat();
        dog.walk();

        Cat cat = new Cat();
        cat.setName("Erlana");
        System.out.println("Nama kucingnya adalah: " + cat.getName());

        cat.play();
        cat.eat();
        cat.walk();
    }
}