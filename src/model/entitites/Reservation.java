package model.entitites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {

		if(!checkOut.after(checkIn)) {
			
			throw new DomainException("A data de check-out deve ser posterior a data de check-in");
		}
		
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

		// Usando o método 'convert' do atributo 'DAYS' da classe enumerada 'TimeUnity'
		// converte-se o valor da variável 'diff' que está em milisegundos para um valor
		// em dias.

	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {

		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {

			//throw new IllegalArgumentException("As datas de reserva para atualização devem ser futuras.");
			throw new DomainException("As datas de reserva para atualização devem ser futuras.");
		}

		if (!checkOut.after(checkIn)) {
			//throw new IllegalArgumentException("A data de Check-out deve ser posterior a data de Check-in");
			throw new DomainException("A data de Check-out deve ser posterior a data de Check-in");
		}

		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	@Override
	public String toString() {

		return "Room: " + roomNumber + ", checkin: " + sdf.format(this.checkIn) + ", check-out "
				+ sdf.format(this.checkOut) + ", " + this.duration() + " nights";

	}
}
