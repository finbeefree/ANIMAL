public class Bear extends Omnivorous {
    public Bear(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }


    public void eat() {
        System.out.print("Медведь по имени " + getName());
        super.eat();
    }

    public void move() {
        System.out.print("Медведь по имени " + getName());
        super.move();
    }

    public void sleep() {
        System.out.print("Медведь по имени " + getName());
        super.sleep();
    }


    public void voice() {
        System.out.print("Медведь по имени " + getName());
        super.voice();
    }
}
