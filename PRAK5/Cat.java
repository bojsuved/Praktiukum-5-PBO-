public class Cat extends Animal implements Pet{
    private String name;

    public Cat() {
        super(4);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name + " Bermain bola kecil");
    }

    @Override
    public void eat() {
        System.out.println("Makan ikan");
    }
}