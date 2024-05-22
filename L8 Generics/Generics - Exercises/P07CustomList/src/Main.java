import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CustomList<String> list = new CustomList<>();

        while (!input.equals("END")){

            String[] arr = input.split(" ");
            String command = arr[0];

            if (command.equals("Add")){
                list.add(arr[1]);
            }else if (command.equals("Remove")){
                list.remove(Integer.parseInt(arr[1]));
            }else if (command.equals("Contains")){
                System.out.println(list.contains(arr[1]));
            }else if (command.equals("Swap")){
                list.swap(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            }else if (command.equals("Greater")){
                System.out.println(list.countGreaterThan(arr[1]));
            }else if (command.equals("Max")){
                System.out.println(list.getMax());
            }else if (command.equals("Min")){
                System.out.println(list.getMin());
            }else {
                list.forEach(System.out::println);
            }




            input = scanner.nextLine();
        }


    }
}