import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Party!")){

            String[] arr = input.split("\\s+");

            String command = arr[0];
            String option = arr[1];
            String key = arr[2];

            if (command.equals("Remove")){

                removeSomething(names, option, key);

            } else if (command.equals("Double")) {

                doubleSomething(names, option, key);

            }


            input = scanner.nextLine();
        }

        if (names.isEmpty()){

            System.out.println("Nobody is going to the party!");

        }else {
            names = names.stream().sorted().collect(Collectors.toList());
            System.out.print((String.join(", ", names)));
            System.out.print(" are going to the party!");
        }


    }

    private static void doubleSomething(List<String> list, String option, String keys) {

        String name;
        boolean isTrue = true;

        switch (option){

            case "StartsWith" :

                for (int j = 0; j < list.size(); j++) {

                    String names = list.get(j);
                    int keyLength = keys.length();

                    if (keyLength <= names.length()) {
                        for (int i = 0; i < keyLength; i++) {

                            if (names.charAt(i) != keys.charAt(i)) {
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) {
                            list.add(list.indexOf(names), names);
                            j++;
                        }
                        isTrue = true;
                    }
                }

                break;

            case "EndsWith" :

                for (int j = 0; j < list.size(); j++) {

                    String names = list.get(j);
                    int keyLength = keys.length();
                    int namesLength = names.length() - 1;

                    if (keyLength <= names.length()) {

                        for (int i = keyLength - 1; i >= 0; i--) {


                            if (names.charAt(namesLength) != keys.charAt(i)) {
                                isTrue = false;
                                break;
                            }
                            namesLength--;
                        }
                        if (isTrue) {
                            list.add(list.indexOf(names), names);
                            j++;
                        }
                        isTrue = true;
                    }

                }

                break;

            case "Length" :
                int length = Integer.parseInt(keys);

                for (int i = 0; i < list.size(); i++) {

                    name = list.get(i);

                    if (name.length() == length){

                        list.add(i, name);
                        i++;
                    }

                }

                break;
        }





    }

    private static void removeSomething (List<String> list, String option, String keys){

        boolean isTrue = true;

        switch (option){

            case "StartsWith" :


                for (int j = 0; j < list.size(); j++) {

                    String name = list.get(j);
                    int keyLength = keys.length();
                    if (keyLength <= name.length()) {
                        for (int i = 0; i < keyLength; i++) {

                            if (name.charAt(i) != keys.charAt(i)) {
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) {
                            list.remove(name);
                            j--;
                        }
                        isTrue = true;
                    }
                }
                break;

            case "EndsWith" :

                for (int j = 0; j < list.size(); j++) {

                    String name = list.get(j);
                    int keyLength = keys.length();
                    int namesLength = name.length() - 1;

                    if (keyLength <= name.length()) {
                        for (int i = keyLength - 1; i >= 0; i--) {

                            if (name.charAt(namesLength) != keys.charAt(i)) {
                                isTrue = false;
                                break;
                            }
                            namesLength--;
                        }
                        if (isTrue) {
                            list.remove(name);
                            j--;
                        }
                        isTrue = true;
                    }
                }
                break;

            case "Length" :
                int length = Integer.parseInt(keys);
                list.removeIf(s -> s.length() == length);
                break;
        }
    }
}
