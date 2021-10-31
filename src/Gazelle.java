public class Gazelle extends Herbivore {
    public Gazelle(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }


    public void eat() {
        System.out.print("Газель по имени " + getName());
        super.eat();
    }


    public void sleep() {
        System.out.print("Газель по имени " + getName());
        super.sleep();
    }


    public void move() {
        System.out.print("Газель по имени " + getName());
        super.move();
    }

    public void voice() {
        System.out.print("Газель по имени " + getName());
        super.voice();
    }
}