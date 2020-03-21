package model.entitites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getcheckIn() {
		return checkIn;
	}

	public Date getcheckOut() {
		return checkOut;
	}

	public long duration() {

		long diff = this.checkOut.getTime() - this.checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

		// Usando o m�todo 'convert' do atributo 'DAYS' da classe enumerada 'TimeUnity'
		// converte-se o valor da vari�vel 'diff' que est� em milisegundos para um valor
		// em dias.

	}

	public void updateDates(Date checkIn, Date checkOut) {

		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {

		return "Room: " + roomNumber + ", checkin: " + sdf.format(this.checkIn) + ", check-out " + sdf.format(this.checkOut) + ", "
				+ this.duration() + " nights";

	}
}
