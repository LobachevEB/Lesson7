public class Lesson7 {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < 13;i++) {
            Cat cat = new Cat("Cat" + i, 10);
            cat.eat(plate);
            plate.info();
            cat.info();
        }
    }
}
