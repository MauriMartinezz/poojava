import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        //showMenu();
        /*Doctor myDoctor = new Doctor("Marcos", "Cardiologo");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        patient.setPhoneNumber("12356732");
        System.out.println(patient.getPhoneNumber());
        patient.setName("Alejandro");
        System.out.println(patient);*/
        System.out.println(Day.FRIDAY.getSpanish());
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
