package Racing;

public class Car {

    private static final int CONDITION_TO_MOVE = 4;

    String name;
    int result = 0;

    public Car(String name) {
        this.name= name;
    }

    public int getResult(int num) {
        for (int i = 0; i < num; i++) {
            int goStop = (int) (Math.random() * 10);
            ableToMove(goStop);
        }
        return result;
    }

    private void ableToMove(int goStop) {
        if (goStop >= CONDITION_TO_MOVE) {
            result++;
        }
    }

    public String getName(){
        return name;
    }

    public Integer result() {
        return result;
    }

    // a b c d 각각 3 4 2 4
}