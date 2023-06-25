package session7;

public interface TrainingList<T> {

    public void add(T element);

    public int getSize();

    public void removeByIndex(int index);

    public T getElementByIndex(int index);
}
