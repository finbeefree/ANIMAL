public class Rabbit extends Herbivore {
    public Rabbit(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }


    public void eat() {
        System.out.print("Кролик по имени " + getName());
        super.eat();
    }


    public void sleep() {
        System.out.print("Кролик по имени " + getName());
        super.sleep();
    }


    public void move() {
        System.out.print("Кролик по имени " + getName());
        super.move();
    }


    public void voice() {
        System.out.print("Кролик по имени " + getName());
        super.voice();
    }
}