package Lotto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private List<Lotto> lottos;
    private int lottoCount = 0;
    private final BigDecimal LOTTO_AMT = new BigDecimal(1000);
    private Lotto winLotto;

    public List<Lotto> buyLottos(java.math.BigDecimal buyAmt) {
        this.lottoCount = buyAmt.divide(LOTTO_AMT).intValue();
        this.lottos = new ArrayList<Lotto>();
        for (int i = 0; i < lottoCount; i++) {
            lottos.add(Lotto.createAutoLotto());
        }
        return lottos;
    }

    public int getLottoCount() {
        return lottoCount;
    }

    public void setWinLotto(List<Integer> winLottoNumber){
        this.winLotto = new Lotto(winLottoNumber);
    }
}
