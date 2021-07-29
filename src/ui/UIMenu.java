package ui;

import model.Doctor;
import model.Patient;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
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
                    authUser(1);
                    res = 0;
                    break;
                case 2:
                    authUser(2);
                    res = 0;
//                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thanks for your visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        }while(res != 0);


    }
    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Rocio Jimenez", "rocio@gmail.com"));
        doctors.add(new Doctor("Karen Mendoza", "karen@gmail.com"));
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Roberto", "robert@gmail.com"));
        patients.add(new Patient("Juan", "juan@gmail.com"));
        patients.add(new Patient("jose", "jose@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType ==1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        doctorLogged = d;
                    }
                }
            }

            if(userType ==2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        patientLogged = p;
                    }
                }
            }
        }while(!emailCorrect);
    }
    public static void showPatientMenu(){
        int res = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Go back");
        Scanner sc = new Scanner(System.in);
        res = Integer.valueOf(sc.nextLine());
            switch (res){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 1; i < 4; i++){
                        System.out.println(i + ". " + MONTHS[i-1]);
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
