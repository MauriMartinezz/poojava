public class Medic {
    static int id;
    String name;
    String speciality;

   Medic(String nombre){
        name = nombre;
        id++;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor ID: " + id);
    }
}
