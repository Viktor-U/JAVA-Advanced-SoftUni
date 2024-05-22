import java.util.ArrayList;
import java.util.List;

public class ListyIterator {

    private List<String> list = new ArrayList<>();
    private int index = 0;

    public ListyIterator() {
    }

    public void Create (String string) {
        this.list.add(string);
    }

    public boolean Move (){

       if (list.size() - 1 > index){
           index++;
           return true;
       }else {
           return false;
       }
    }

    public void Print (){
        System.out.println(list.get(index));;
    }
    public boolean HasNExt (){
        return list.size() - 1 > index;
    }

    public void PrintAll (){

        list.forEach(e -> System.out.print(e + " "));
        System.out.println();

    }

}
