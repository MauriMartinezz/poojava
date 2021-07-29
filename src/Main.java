import model.Patient;
import model.Doctor;
import model.User;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
    showMenu();
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
