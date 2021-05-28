package Testing;

import java.util.ArrayList;
import java.util.List;

public class LottoFactory {
    public static int bonusNum;

    List<Integer> lottoFactory() {
        List<Integer> list = new ArrayList<>();
        while (list.size() < Lotto.SIZE_OF_LOTTO) {
            list.add(pickNumber(list));
        }
        return list;
    }   // 랜덤 난수 Set 에 집어넣기.

    int pickBonus(List<Integer> list) {
        return list.get((int) (Math.random() * 6));
    }

    int pickNumber(List<Integer> list) {
        int randNum = (int) (Math.random() * 45 + 1);
        while (list.contains(randNum)) {
            randNum = (int) (Math.random() * 45 + 1);
        }
        return randNum;
    }

    List<Integer> pickManual() {
        List<Integer> manualPick = new ArrayList<>();
        while(manualPick.size()<Lotto.SIZE_OF_LOTTO){
            if(manualPick.contains(View.inputNum()))
                continue;
            else
                manualPick.add(View.inputNum());
        }
        return manualPick;
    }
}
