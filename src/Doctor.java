public class Doctor {
    static int id;
    String name;
    String speciality;

    Doctor(String nombre, String speciality){
        this.name = nombre;
        this.speciality = speciality;
        id++;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor ID: " + id);
    }
}
