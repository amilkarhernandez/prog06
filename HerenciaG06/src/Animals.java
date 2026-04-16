public class Animals {

    private Long id;
    private String breed;
    private String gender;

    public Animals(Long id, String breed, String gender) {
        this.id = id;
        this.breed = breed;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showMessage(){
        System.out.println("Hola Mundo");
    }

    private String sendData(){
        return "Hola Data";
    }
}
