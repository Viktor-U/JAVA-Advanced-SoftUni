import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private T data;

    private final List<T> list = new ArrayList<>();

    public Box() {
    }

    public List<T> getList() {
        return list;
    }

    public Box(T data){
        this.data = data;
    }
    public void add(T box){
        this.list.add(box);
    }

    public void swap (int a, int b){

        T newA = list.get(a);
        list.set(a, list.get(b));
        list.set(b, newA);

    }


   @Override
    public String toString(){


         return String.format("%s: ", this.data.getClass().getName());



   }




}
