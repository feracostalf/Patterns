package comportamiento.iterator;

public class CardIterator implements Iterator{

    private Card[] cards;
    private int position;

    public CardIterator(Card[] cards) {
        this.cards = cards;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.position >= cards.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public Object currentItem() {
        return cards[position];
    }
}
