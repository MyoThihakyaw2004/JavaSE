package lambda;

@FunctionalInterface
public interface CustomComparator<T extends Comparable<T>> {
	T compare(T t1, T t2);
}
