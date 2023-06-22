package session6.solvearrayissue;

import java.util.Arrays;

public class TrainingIntArrayList implements TrainingIntList {

    private int size;

    private int[] data;

    public TrainingIntArrayList() {
        this(10);
    }

    public TrainingIntArrayList(int initialArraySize) {
        data = new int[initialArraySize];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int number) {
        if (size == data.length) {
            expandArray();
        }
        data[size++] = number;
    }

    private void expandArray() {
        System.out.println("TrainingIntArrayList.expandArray");
        data = Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public void remove(int index) {

        for (int i = index; i < size; i++) {
            if (i + 1 < data.length
            )
                data[i] = data[i + 1];
        }
        size--;

    }

    @Override
    public int getNumberAtIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();//[ 1 2 3 ]

        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i < size - 1)
                stringBuilder.append(",");
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
