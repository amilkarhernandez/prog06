public class Dog extends Animals{

    private String color;
    private String size;

    public Dog(Long id, String breed, String gender, String color, String size) {
        super(id, breed, gender);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void showMessage(){
        System.out.println("Imprimi lo que sea");
    }
}
