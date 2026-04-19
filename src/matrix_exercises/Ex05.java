package matrix_exercises;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][][] commitmens = new String[12][31][8];
        boolean running = true;

        while (running) {
            int month = 0, day = 0, time = 0;
            boolean validMonth = false;
            boolean validDay = false;
            boolean validTime = false;

            System.out.println();
            System.out.println("[1] Schedule or change");
            System.out.println("[2] View the schedule");
            System.out.println("[3] Exit");
            System.out.println("Select an option: ");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:

                    while (!validMonth) {
                        System.out.println("Month: ");
                        month = Integer.parseInt(sc.nextLine());

                        if (month > 0 && month <= 12) {
                            validMonth = true;
                        } else {
                            System.out.println("Month invalid, try again.");
                        }
                    }
                    month--;

                    while (!validDay) {
                        System.out.println("Day: ");
                        day = Integer.parseInt(sc.nextLine());

                        if (day > 0 && day <= 31) {
                            validDay = true;
                        } else {
                            System.out.println("Day invalid, try again.");
                        }
                    }
                    day--;

                    while (!validTime) {
                        System.out.println("Time: ");
                        time = Integer.parseInt(sc.nextLine());
                        if (time >= 0 && time < 8) {
                            validTime = true;
                        } else {
                            System.out.println("Time invalid, try again.");
                        }
                    }

                    if (commitmens[month][day][time] != null) {
                        System.out.println("There is already one. Do you want to overwrite it? [y,n]");
                        char resp = sc.next().toLowerCase().charAt(0);

                        if (resp == 'y') {
                            System.out.println("Enter the new appointment: ");
                            sc.nextLine();
                            commitmens[month][day][time] = sc.nextLine();

                        }
                    } else {
                        System.out.println("Enter the appointment: ");
                        commitmens[month][day][time] = sc.nextLine();
                    }
                    break;

                case 2:

                    while (!validMonth) {
                        System.out.println("Month: ");
                        month = Integer.parseInt(sc.nextLine());

                        if (month > 0 && month <= 12) {
                            validMonth = true;
                        } else {
                            System.out.println("Month invalid, try again.");
                        }
                    }
                    month--;

                    while (!validDay) {
                        System.out.println("Day: ");
                        day = Integer.parseInt(sc.nextLine());
                        if (day > 0 && day <= 31) {
                            validDay = true;
                        } else {
                            System.out.println("Day invalid, try again.");
                        }
                    }
                    day--;

                    while (!validTime) {
                        System.out.println("Time: ");
                        time = Integer.parseInt(sc.nextLine());
                        if (time >= 0 && time < 8) {
                            validTime = true;
                        } else {
                            System.out.println("Time invalid, try again.");
                        }
                    }

                    if (commitmens[month][day][time] == null) {
                        System.out.println("No appointment found.");
                    } else {
                        System.out.println("Appointment: " + commitmens[month][day][time]);
                    }

                    break;
                case 3:
                    System.out.println("Exiting... ");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option.");
                    break;
            }

        }
        sc.close();
    }
}
