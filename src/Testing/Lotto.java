package Testing;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public static final int SIZE_OF_LOTTO = 6;
    int bonus;
    List<Integer> lottoList = new ArrayList<>();
    int[] priceArr = {0};

    void checking(List<Integer> mylist) {
        switch (sameCount(mylist)) {
            case 0:
                System.out.println("탈락, 0개");
                break;
            case 1:
                System.out.println("탈락, 1개");
                break;
            case 2:
                System.out.println("탈락, 2개");
                break;
            case 3:
                System.out.println("5등, 3개");
                break;
            case 4:
                System.out.println("4등, 4개");
                break;
            case 5:
                if (isSecond(mylist))
                    System.out.println("2등, 보너스 번호 일치, 5개");
                else
                    System.out.println("3등, 보너스 번호 불일치, 5개");
                break;
            case 6:
                System.out.println("1등,6개");
                break;
            default:
                break;
        }
    }

    int sameCount(List<Integer> mylist) {
        int count = 0;
        for (int i = 0; i < SIZE_OF_LOTTO; i++) {
            if (lottoList.contains(mylist.get(i)))
                count++;
        }
        return count;
    }

    boolean isSecond(List<Integer> mylist) {
        return mylist.contains(this.bonus);
    }
}