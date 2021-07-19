public class Patient {

    public String name, email, address, phoneNumber, birthday, blood;
    public double height, weight;
    public int id;

    public Patient(String name, String email){
        this.name = name;
        this.email = email;
        id++;
    }
}
