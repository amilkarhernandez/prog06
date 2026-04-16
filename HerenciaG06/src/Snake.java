public class Snake extends Cat{

    private Long sizeSnake;

    public Snake(Long id, String breed, String gender, String typeFood, double weight, Long sizeSnake) {
        super(id, breed, gender, typeFood, weight);
        this.sizeSnake = sizeSnake;
    }

    public Long getSizeSnake() {
        return sizeSnake;
    }

    public void setSizeSnake(Long sizeSnake) {
        this.sizeSnake = sizeSnake;
    }

    public void sendDog(){
    }
}
