package subclasses;

public class IndexedInteger implements Comparable<IndexedInteger> {

    private int value;
    private int index;
    private int quotient;

    public IndexedInteger(int value, int index) {
        this.value = value;
        this.index = index;
        this.quotient = 0;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    public int getQuotient() {
        return quotient;
    }

    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }

    @Override
    public int compareTo(IndexedInteger other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "subclasses.IndexedInteger{" +
                "value=" + value +
                ", index=" + index +
                ", quotient=" + quotient +
                '}';
    }
}
