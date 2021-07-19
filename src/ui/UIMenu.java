package ui;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static void showMenu(){
        System.out.println("Welcome to my appointments");
        System.out.println("Select an option");
        int res = 0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Log out");

            Scanner sc = new Scanner(System.in);
            res = Integer.valueOf(sc.nextLine());

            switch (res){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    res = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thanks for your visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        }while(res != 0);

    }
    public static void showPatientMenu(){
        int res = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Go back");
        Scanner sc = new Scanner(System.in);
        res = Integer.valueOf(sc.nextLine());
            switch (res){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 1; i < 4; i++){
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        }while(res != 0);
    }

}
