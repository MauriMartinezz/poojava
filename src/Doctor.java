import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id;
    private String name;
    private String email;
    private String speciality;

    private int id_availableAppointment;
    private String time;
    private Date date;

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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public int getId() {
            return id;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setId(int id) {
            this.id = id;
        }

    }
}
