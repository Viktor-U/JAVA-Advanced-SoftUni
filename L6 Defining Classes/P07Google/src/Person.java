import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents = new ArrayList<>();
    private List<Child> children = new ArrayList<>();
    private List<Pokemon> pokemons = new ArrayList<>();

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.name).append(System.lineSeparator());

        sb.append("Company:").append(System.lineSeparator());
        if (this.company != null) {
            sb.append(this.company).append(System.lineSeparator());
        }

        sb.append("Car:").append(System.lineSeparator());
        if (this.car != null) {
            sb.append(this.car).append(System.lineSeparator());
        }

        sb.append("Pokemon:").append(System.lineSeparator());

        if (!this.pokemons.isEmpty()){

            for (Pokemon pokemon : pokemons) {
                sb.append(pokemon).append(System.lineSeparator());
            }
        }

        sb.append("Parents:").append(System.lineSeparator());
        if (!this.parents.isEmpty()){

            for (Parent parent : parents) {
                sb.append(parent).append(System.lineSeparator());
            }
        }
        sb.append("Children:").append(System.lineSeparator());
        if (!this.children.isEmpty()){

            for (Child child : children) {
                sb.append(child).append(System.lineSeparator());
            }
        }


        return sb.toString();
    }
}
