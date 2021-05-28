package Racing;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {

        String[] name = View.getNames(); // View.getNames는 너가 확실해
        int trial = View.getTrialNums();

        int carSize = name.length;

        List<Integer> results = new ArrayList<>();
        Car[] car = new Car[carSize];
        for (int i = 0; i < carSize; i++) {
            car[i] = new Car(name[i]);
            results.add( car[i].getResult(trial));
        }

        System.out.println("=================");
        System.out.println("우승한 차량은 ");
        results.sort(Comparator.reverseOrder());

        for (int j = 0; j < carSize; j++) {
            System.out.println(car[j].name + " : " + car[j].result);
        } //각자의 차들의 결과값 출력.

        for (int j = 0; j < carSize; j++) {
//            System.out.println(car[j].name + " : " + car[j].result);
            if (results.get(0) == car[j].result) {
                System.out.print(car[j].getName() + " ");
            }
        }
        System.out.println("입니다!");

    }
}
