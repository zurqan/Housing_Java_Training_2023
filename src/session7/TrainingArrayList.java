package session7;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

    public TrainingList<T> filter(Predicate<T> check){
        TrainingArrayList<T> filteredList= new TrainingArrayList<>();
        for (int i = 0; i < size; i++) {
            T elementByIndex = getElementByIndex(i);
            if(check.test(elementByIndex)){
                filteredList.add(elementByIndex);
            }
        }
        return filteredList;
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

    @Override
    public <U> TrainingList<U> map(Function<T, U> mapper) {
        TrainingArrayList<U> mappedArray = new TrainingArrayList<>();
        for (int i = 0; i < size; i++) {
            U uType = mapper.apply(getElementByIndex(i));
            mappedArray.add(uType);
        }

        return mappedArray;
    }

    @Override
    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(getElementByIndex(i));
        }
    }
}
