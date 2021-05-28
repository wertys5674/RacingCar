package Testing;


public class TestingApp {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        LottoFactory lottoFac = new LottoFactory();

        int count = View.getNumofLot();
        User hkh = new User(count);

        lotto.lottoList = lottoFac.lottoFactory();
        lotto.bonus = lottoFac.pickBonus(lotto.lottoList);


        String AUTO_OR_MANUAL = View.autoManual();

        if (AUTO_OR_MANUAL == "Auto") {
            for (int i = 0; i < hkh.count; i++) {
                hkh.userPick = lottoFac.lottoFactory();
                lotto.checking(hkh.userPick);
            }
        }

        if (AUTO_OR_MANUAL == "Manual") {
            for (int i = 0; i < hkh.count; i++) {
                hkh.userPick = lottoFac.pickManual();
                lotto.checking(hkh.userPick);
            }
        }
        // XXX :: 디미터 법칙
    }
}

