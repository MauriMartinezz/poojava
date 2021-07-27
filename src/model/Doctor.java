package model;

public class Doctor extends User{
    static String speciality;

    public Doctor(String nombre, String email){
        super(nombre, speciality);
        this.speciality = speciality;
    }

    public static String getSpeciality() {
        return speciality;
    }

    public static void setSpeciality(String speciality) {
        Doctor.speciality = speciality;
    }

    @Override
    public String toString() {
        return "model.Doctor: " + super.toString() + "\nSpeciality " + speciality;
    }
}