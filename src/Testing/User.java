package Testing;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Integer> userPick = new ArrayList<>();
    List<Lotto> userLottos = new ArrayList<>();
    int count = 0;

    public User(int count) {
        this.count = count;
    }
}
