import java.util.Stack;

public class Jar<T> {


    private Stack<T> stack = new Stack<>();

    public void add(T element){

        stack.push(element);

    }

    public T remove (){

        return stack.pop();

    }

}
