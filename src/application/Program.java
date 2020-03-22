package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entitites.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			Reservation reservation = new Reservation();

			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in data (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());

			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println("------------------------------------------");
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in data (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

		}
		catch(ParseException e) {
			System.out.println("formato de data inválido.");
		}
		catch(DomainException e) {
			
			System.out.println("error in reservation: " + e.getMessage());
		}
		catch(RuntimeException e) {
			
			System.out.println("erro inexperado.");
		}
		
		sc.close();
	}

}
