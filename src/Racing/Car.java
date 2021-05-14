package Racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    String name;
    int result = 0;
    int[] resultArr;

    public int getResult(int num) {
        for (int i = 0; i < num; i++) {
            int goStop = (int) (Math.random() * 10);
            if (goStop >= 4) {
                result++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    // a b c d 각각 3 4 2 4
}
