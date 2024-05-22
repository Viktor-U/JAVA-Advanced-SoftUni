public class Car {

    private String model;
    private Engine engine;
    private String weight = "n/a";
    private String color = "n/a";


    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {

        return String.format("%s:%n%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s%n",
                this.model, engine.getModel(), engine.getPower(), engine.getDisplacement(),
                engine.getEfficiency(), this.weight, this.color);
    }
}
