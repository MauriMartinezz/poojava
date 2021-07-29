package model;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
//    public static ArrayList<Doctor> doctorsAvailableAppoinments = new ArrayList<>();
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    static String speciality;

    public Doctor(String nombre, String email) {
        super(nombre, speciality);
    }

    public static String getSpeciality() {
        return speciality;
    }

    public static void setSpeciality(String speciality) {
        Doctor.speciality = speciality;
    }



    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }
    @Override
    public void showData(){
        System.out.println(getClass().getSimpleName());
        System.out.println("\nNombre: " + this.getName());
        System.out.println("\nEspecialidad: " + this.getSpeciality());
    };

    @Override
    public String toString() {
        return "model.Doctor: " + super.toString() + "\nSpeciality " + speciality;
    }



    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
                //Format recibe un Date y devulve un string
                //Parse recibe un string y devuelve un date
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

    }
}