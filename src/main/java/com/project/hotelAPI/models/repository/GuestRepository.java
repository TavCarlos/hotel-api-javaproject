package com.project.hotelAPI.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.hotelAPI.models.entities.Guest;

public interface GuestRepository extends CrudRepository<Guest, String>, PagingAndSortingRepository<Guest, String>{

	public Iterable<Guest> findByNameContainingIgnoreCase(String name);
	public Iterable<Guest> findByCpf(String cpf);
}
