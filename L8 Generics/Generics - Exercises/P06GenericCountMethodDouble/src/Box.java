import java.util.List;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{

    private T data;

    public Box(T data){
        this.data = data;
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.data.compareTo(o.data);
    }

    public static <T extends Comparable<T>> int counterGreaterElements (List<T> data, T element){
        int counter = 0;

        for (T e : data) {

            int res = e.compareTo(element);
            if (res > 0){
                counter++;
            }

        }

        return counter;
    }
}
