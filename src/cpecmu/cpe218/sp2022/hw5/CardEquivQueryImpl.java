package cpecmu.cpe218.sp2022.hw5;

public class CardEquivQueryImpl implements CardEquivQuery {

    protected int[] cardType;
    protected int queryCount = 0;

    public CardEquivQueryImpl(int[] cardType) {
        this.cardType = cardType;
    }

    @Override
    public int size() {
        return cardType.length;
    }

    @Override
    public boolean areEquivalent(int c1, int c2) {
        queryCount++;
        return cardType[c1] == cardType[c2];
    }

    @Override
    public int queryCount() {
        return queryCount;
    }
}
