package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;

        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Go Back");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
        }while(response != 0);
    }
    private static void showAddAvailableAppoinmentsMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a month");

            for (int i = 0; i < 3; i++) {
                int j = i+1;
                System.out.println(j + ". " + UIMenu.MONTHS);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected- 1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time available for date: "+ date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is " + time + "\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while(responseTime == 2);
                UIMenu.doctorLogged.addAvailableAppointment(data, time);
            }else if(response == 0){
                showDoctorMenu();
            }
        }while(response != 0);
    }
}