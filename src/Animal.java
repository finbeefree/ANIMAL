public class Animal implements Eat {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(" спит");
    }

    public void move() {
        System.out.println(" передвигается");
    }

    public void voice() {
        System.out.println(" издает звуки");
    }

    public void eat() {
        System.out.println(" ест");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}