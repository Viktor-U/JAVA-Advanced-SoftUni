import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input[] = scanner.nextLine().split(" ");
        ListyIterator listyIterator = new ListyIterator();

        if (input[0].equals("Create") && input.length > 1){
            for (int i = 1; i < input.length; i++) {

                listyIterator.Create(input[i]);

            }
        }else {
            System.out.println("Invalid Operation!");
            return;
        }

        String command = scanner.nextLine();
        while (!command.equals("END")){

            switch (command){
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNExt());
                    break;
                case "Print":
                    listyIterator.Print();
                    break;
                default:
                    System.out.println("Invalid Operation!");
                    break;
            }


            command = scanner.nextLine();
        }



    }
}