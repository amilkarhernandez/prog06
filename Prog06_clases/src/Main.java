import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> listCars = new ArrayList<>();

        listCars.add(new Car(1L, "Chevrolet", "2026","Blanco" ));

        for(Car c : listCars){
            System.out.println(c.getId() + " " + c.getBrand() + " " + c.getColor());
        }
    }

}