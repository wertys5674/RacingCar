package Racing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

    static Scanner scanner = new Scanner(System.in);

    public static String[] getNames(){
        System.out.print("레이싱에 참여시킬 자동차 이름을 입력하세요 >> ");
        return scanner.nextLine().split(",");
    }

    public static int getTrialNums(){
        System.out.print("몇번의 시도를 통한 경주를 할지 입력하세요 >> ");
        return scanner.nextInt();
    }
}
