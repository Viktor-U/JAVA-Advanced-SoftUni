public class Scale<T extends Comparable<T>> {

    private final T left;
    private final T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {

        if (left == right){
            return null;
        }else {
            return (left.compareTo(right) > 0) ? left : right;
        }
    }


}
