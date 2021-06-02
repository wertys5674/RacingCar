package Testing;

import java.util.Scanner;
import java.util.StringTokenizer;

public class View {
    static Scanner scanner = new Scanner(System.in);


    static int getNumofLot() {
        System.out.print("몇장의 로또를 구매할지 정하세요 >> ");
        return scanner.nextInt();
    }

    static String autoManual() {
        System.out.println("Auto : 1");
        System.out.println("Manual : 2");
        System.out.print(">>");
        int AorM = Integer.parseInt(scanner.next());
        if (AorM == 1)
            return "Auto";
        if (AorM == 2)
            return "Manual";
        else
            return "Error";
    }

    static String inputNum() {
        System.out.println("1~45까지의 6가지의 서로 다른 수를 ,로 구분해 입력해주세요.");
        System.out.print(">>");
        String inputSixNum = scanner.next();

        StringTokenizer strTok = new StringTokenizer(inputSixNum, ",");

        for (int i = 0; i < Lotto.SIZE_OF_LOTTO; i++) {
            int checkNum = Integer.parseInt(strTok.nextToken());
            if (checkNum > 45 || checkNum < 0)
                throw new IllegalArgumentException("입력하신 숫자가 올바르지 않습니다. 1~45사이의 숫자를 입력해주세요.");
        }

        return inputSixNum;
    }
}
