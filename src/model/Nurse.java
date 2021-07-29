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
        System.out.println("Enfermera\n");
        System.out.println("Hopsital: HA\n");
        System.out.println("Sector: Cardiologia / Pediatria \n");

    }
}
