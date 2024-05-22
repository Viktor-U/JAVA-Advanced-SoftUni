import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> collectionOfPokemon = new ArrayList<>();

    public Trainer(String name, int numberOfBadges) {
        this.name = name;
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getCollectionOfPokemon() {
        return collectionOfPokemon;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.numberOfBadges, this.collectionOfPokemon.size());
    }
}
