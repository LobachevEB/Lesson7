import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    private Random rnd;
    private int appetiteDelta;
    private int direction;
    public Cat(String name, int appetite) {
        rnd = new Random();
        direction = rnd.nextInt(2);
        appetiteDelta = rnd.nextInt(4);
        this.name = name;
        if(direction > 0){
            this.appetite = appetite + appetiteDelta;
        }
        else {
            this.appetite = appetite - appetiteDelta;
        }
        isFull = false;
    }
    public void eat(Plate p) {
        if(p.decreaseFood(appetite)){
            isFull = true;
        }
    }
    public void setIsHungry(){
        isFull = false;
    }
    public void info(){
        if(isFull){
            System.out.printf("Cat %s, appetite %d, is fill\n",name,appetite);
        }
        else {
            System.out.printf("Cat %s,appetite %d, is hungry\n",name,appetite);
        }
    }
}
