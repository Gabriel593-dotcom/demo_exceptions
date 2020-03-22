package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entitites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Reservation reservation = new Reservation();

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in data (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("A data de Check-out deve ser posterior a data de Check-in");
		}
 
		else {
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			// Sem necessidade de colocar o metodo correspondente a impressão, porque é
			// identificado automaticamente.
		}

		System.out.println("------------------------------------------");
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in data (dd/MM/yyyy)");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy)");
		checkOut = sdf.parse(sc.next());
		
		String error = reservation.updateDates(checkIn, checkOut);
		
		if(error != null) {
			
			System.out.println("error in reservation: " + error);
		}
		else {
			
			System.out.println("Reservation: " + reservation);
		}
		sc.close();
	}

}



// SOLUÇÃO MUITO RUIM

/*
 Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Reservation reservation = new Reservation();

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in data (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("A data de Check-out deve ser posterior a data de Check-in");
		}
 
		else {
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation  ou reservaion.toString() );
			// Sem necessidade de colocar o metodo correspondente a impressão, porque é
			// identificado automaticamente.
		}

		System.out.println("------------------------------------------");
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in data (dd/MM/yyyy)");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy)");
		checkOut = sdf.parse(sc.next());

		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {

			System.out.println("As datas de reserva para atualização devem ser futuras.");
		}

		else if (!checkOut.after(checkIn)) {
			System.out.println("A data de Check-out deve ser posterior a data de Check-in");
		}

		else {
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

		}

		sc.close();*/




// RUIM

/*
 Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Reservation reservation = new Reservation();

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in data (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("A data de Check-out deve ser posterior a data de Check-in");
		}
 
		else {
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			// Sem necessidade de colocar o metodo correspondente a impressão, porque é
			// identificado automaticamente.
		}

		System.out.println("------------------------------------------");
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in data (dd/MM/yyyy)");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy)");
		checkOut = sdf.parse(sc.next());
		
		String error = reservation.updateDates(checkIn, checkOut);
		
		if(error != null) {
			
			System.out.println("error in reservation: " + error);
		}
		else {
			
			System.out.println("Reservation: " + reservation);
		}
		sc.close();
 * */
 */