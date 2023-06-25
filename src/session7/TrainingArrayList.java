package session7;

import java.util.Arrays;

public class TrainingArrayList<T> implements TrainingList<T> {

    private int size = 0;
    Object[] data;

    public TrainingArrayList(int initialSize) {
        data = new Object[initialSize];
    }

    public TrainingArrayList() {
        this(10);
    }


    public static <T> TrainingArrayList<T> of(T... element){
        TrainingArrayList<T> tTrainingArrayList = new TrainingArrayList<>();
        for (T e : element) {
            tTrainingArrayList.add(e);
        }
        return tTrainingArrayList;
    }

    @Override
    public void add(T element) {
        if (size == data.length) {
            expandArray();
        }
        data[size++] = element;
    }

    private void expandArray() {
        data = Arrays.copyOf(data, size * 2);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void removeByIndex(int index) {
        if (index == data.length - 1) {
            size--;
            return;
        }
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public T getElementByIndex(int index) {
        return (T) data[index];
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            if(i==size-1) {
                str.append(data[i]);
            }
            else {
                str.append(data[i]);
                str.append(", ");
            }

        }
        str.append("]");
        return str.toString();
    }
}
