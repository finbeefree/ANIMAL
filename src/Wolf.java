public class Wolf extends Predator {
    public Wolf(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }


    public void eat() {
        System.out.print("Волк по имени " + getName());
        super.eat();
    }


    public void move() {
        System.out.print("Волк по имени " + getName());
        super.move();
    }


    public void sleep() {
        System.out.print("Волк по имени " + this.name);
        super.sleep();
    }

    public void voice() {
        System.out.print("Волк по имени " + this.name);
        super.voice();
    }
}
