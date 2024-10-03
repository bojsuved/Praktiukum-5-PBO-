abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Sedang berjalan kaki.");
    }

    public void eat() {
        System.out.println("makan daging");
    }
}