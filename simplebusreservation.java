
 import java.util.Scanner;

public class simplebusreservation {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Assume bus has 5 seats
	        boolean[] seats = new boolean[5];  

	        while (true) {
	            System.out.println("\n--- Bus Reservation ---");
	            System.out.println("1. Book Seat");
	            System.out.println("2. Show Seats");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter seat number (1-5): ");
	                    int seatNo = sc.nextInt();

	                    if (seatNo < 1 || seatNo > 5) {
	                        System.out.println("Invalid seat number!");
	                    } else if (seats[seatNo - 1]) {
	                        System.out.println("Seat already booked!");
	                    } else {
	                        seats[seatNo - 1] = true;
	                        System.out.println("Seat " + seatNo + " booked successfully!");
	                    }
	                    break;

	                case 2:
	                    System.out.println("Seat Status:");
	                    for (int i = 0; i < seats.length; i++) {
	                        if (seats[i]) {
	                            System.out.println("Seat " + (i + 1) + ": Booked");
	                        } else {
	                            System.out.println("Seat " + (i + 1) + ": Available");
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting system...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	}