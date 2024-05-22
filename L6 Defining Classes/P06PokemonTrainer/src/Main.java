import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("Tournament")){
            String[] arr = input.split("\\s+");

            String trainerName = arr[0];
            String pokemonName = arr[1];
            String pokemonElement= arr[2];
            int pokemonHealth= Integer.parseInt(arr[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (trainers.containsKey(trainerName)){

                trainers.get(trainerName).getCollectionOfPokemon().add(pokemon);

            }else {

                Trainer trainer = new Trainer(trainerName, 0);
                trainer.getCollectionOfPokemon().add(pokemon);
                trainers.put(trainerName, trainer);
            }


            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")){

            String element = input;

            for (var entry : trainers.entrySet()) {

                boolean isHaveElement = false;

                for (Pokemon pokemon : entry.getValue().getCollectionOfPokemon()) {

                    if (pokemon.getElement().equals(element)){

                        entry.getValue().setNumberOfBadges(entry.getValue().getNumberOfBadges() + 1);
                        isHaveElement = true;
                        break;

                    }

                }
                if (!isHaveElement){

                    boolean isToRemove = false;
                    Pokemon pokemonToRemove = new Pokemon();

                    for (Pokemon pokemon : entry.getValue().getCollectionOfPokemon()) {

                        pokemon.setHealth(pokemon.getHealth() - 10);

                        if (pokemon.getHealth() <= 0) {

                            isToRemove = true;
                            pokemonToRemove = pokemon;

                        }

                    }
                    if (isToRemove){
                        entry.getValue().getCollectionOfPokemon().remove(pokemonToRemove);
                    }



                }

            }





            input = scanner.nextLine();
        }


        List<Trainer> finalList = new ArrayList<>(trainers.values());

        finalList = finalList.stream().sorted((a, b) -> Integer.compare(b.getNumberOfBadges(), a.getNumberOfBadges())).collect(Collectors.toList());
        finalList.forEach(System.out::println);

    }
}