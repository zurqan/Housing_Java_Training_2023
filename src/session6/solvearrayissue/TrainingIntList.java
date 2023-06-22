package session6.solvearrayissue;

public interface TrainingIntList {

    public int size();

    public void add(int number);

    /**
     * Remove item at index identified by index param value
     * @param index
     */
    public void remove(int index);

    public int getNumberAtIndex(int index);
}
