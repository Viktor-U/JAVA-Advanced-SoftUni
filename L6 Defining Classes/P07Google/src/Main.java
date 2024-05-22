import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] arr = input.split("\\s+");
            String name = arr[0];
            String subClass = arr[1];
            String a = arr[2];
            String b = arr[3];

            Person person;

            if (people.containsKey(name)){

                person = people.get(name);

            }else {

                person = new Person();
                person.setName(name);

            }



            switch (subClass){

                case "company":

                    Company company  = new Company();
                    company.setCompanyName(a);
                    company.setDepartment(b);
                    company.setSalary(Double.parseDouble(arr[4]));

                    person.setCompany(company);

                    break;
                case "pokemon":

                    Pokemon pokemon = new Pokemon();

                    pokemon.setPokemonName(a);
                    pokemon.setPokemonType(b);

                    person.getPokemons().add(pokemon);

                    break;
                case "parents":

                    Parent parent = new Parent();

                    parent.setParentName(a);
                    parent.setParentBirthday(b);

                    person.getParents().add(parent);


                    break;
                case "children":

                    Child child = new Child();

                    child.setChildName(a);
                    child.setChildBirthDay(b);

                    person.getChildren().add(child);

                    break;
                case "car":

                    Car car = new Car();

                    car.setCarModel(a);
                    car.setCarSpeed(b);

                    person.setCar(car);

                    break;



            }

            people.put(name, person);

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        System.out.println(people.get(name));




    }
}