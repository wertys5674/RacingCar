package Testing;

import java.util.Scanner;

public class View {
    static Scanner scanner = new Scanner(System.in);


    static int getNumofLot() {
        System.out.print("몇장의 로또를 구매할지 정하세요 >> ");
        return scanner.nextInt();
    }

    static String autoManual() {
        System.out.println("Auto : 1");
        System.out.println("Manual : 2");
        int AorM = Integer.parseInt(scanner.next());
        if (AorM == 1)
            return "Auto";
        if (AorM == 2)
            return "Manual";
        else
            return "Error";
    }

    static int inputNum(){
        return Integer.parseInt(scanner.next());
    }
}
