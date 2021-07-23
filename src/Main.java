import model.Patient;
import model.Doctor;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        model.Doctor myDoctor = new Doctor("Marcos", "Cardiologo");
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.getBirthday());
    }
    public enum Day {
        MONDAY("Lunes"),
        TUESDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sábado"),
        SUNDAY("Domingo");

        private String spanish;
        private Day(String s) {
            spanish = s;
        }

        private String getSpanish() {
            return spanish;
        }
    }
}
