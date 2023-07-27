package com.project.hotelAPI.models.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Room {

	@Id
	@Column(name = "id")
	private int roomNumber;
	
	@OneToMany(mappedBy = "room")
	private List<Reservation> reservation;
	
	public Room(int roomNumber) {
		super();
		this.roomNumber = roomNumber;
	}


	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
}