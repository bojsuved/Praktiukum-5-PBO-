public class Spider extends Animal implements Pet{
    private String name;

    public Spider() {
        super(8);
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
        System.out.println(this.name);
    }

    @Override
    public void eat() {
        System.out.println("Sedang makan serangga.");
    }
}