package model;

public class Nurse extends User{
    private String speciality;
    public Nurse(String name, String email){
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    @Override
    public void showData(){
        System.out.println(getClass().getSimpleName());
        System.out.println("\nNombre: " + this.getName());
        System.out.println("\nEspecialidad: " + this.getSpeciality());
    }
}
