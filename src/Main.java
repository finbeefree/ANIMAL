public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit("Шаст", 2, 5, 5);
        rabbit.move();
        rabbit.sleep();
        rabbit.voice();
        rabbit.eat();
        System.out.println();

        Animal gazelle = new Gazelle("Оливия", 10, 30, 60);
        gazelle.move();
        gazelle.sleep();
        gazelle.voice();
        gazelle.eat();
        System.out.println();

        Animal fox = new Fox("Дороти", 15, 30, 70);
        fox.move();
        fox.sleep();
        fox.voice();
        fox.eat();
        System.out.println();

        Animal wolf = new Wolf("Бакс", 20, 30, 70);
        wolf.move();
        wolf.sleep();
        wolf.voice();
        wolf.eat();
        System.out.println();

        Animal bear = new Bear("Богдан", 20, 150, 70);
        bear.move();
        bear.sleep();
        bear.voice();
        bear.eat();
    }
}
