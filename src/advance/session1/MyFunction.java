package advance.session1;

@FunctionalInterface
public interface MyFunction<T,R> {

    R apply(T t);
}
