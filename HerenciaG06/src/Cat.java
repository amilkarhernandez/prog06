public class Cat extends Animals{
    private String typeFood;
    private double weight;

    public Cat(Long id, String breed, String gender, String typeFood, double weight) {
        super(id, breed, gender);
        this.typeFood = typeFood;
        this.weight = weight;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
