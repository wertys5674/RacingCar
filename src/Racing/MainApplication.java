package Racing;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name;
        List<Integer> list = new ArrayList<>();

        System.out.print("레이싱에 참여시킬 자동차 이름을 입력하세요 >> ");
        name = scanner.nextLine().split(",");
        //중복, 이름 5자 이하 등등 예외 발생.
        System.out.print("몇번의 시도를 통한 경주를 할지 입력하세요 >> ");
        int trial = scanner.nextInt();

        Car[] car = new Car[name.length];
        for(int i =0; i<name.length;i++) {
            car[i] =new Car();
            car[i].name = name[i];
            list.add(car[i].getResult(trial));
        }

        System.out.println("=================");
        System.out.println("우승한 차량은 ");
        list.sort(Comparator.reverseOrder());

        for(int j=0;j<name.length;j++){
            System.out.println(car[j].name + " : " + car[j].result);
        } //각자의 차들의 결과값 출력.

        for(int j=0;j<name.length;j++){
//            System.out.println(car[j].name + " : " + car[j].result);
            if(list.get(0)==car[j].result){
                System.out.print(car[j] + " ");
            }
        }
        System.out.println("입니다!");

    }
}
