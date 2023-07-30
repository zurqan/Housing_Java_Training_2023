package basic.session7;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface TrainingList<T> {

    public void add(T element);

    public int getSize();

    public void removeByIndex(int index);

    public T getElementByIndex(int index);

    public TrainingList<T> filter(Predicate<T> check);

    public <U> TrainingList<U> map(Function<T,U> mapper);

    public void forEach(Consumer<T> consumer);
}
