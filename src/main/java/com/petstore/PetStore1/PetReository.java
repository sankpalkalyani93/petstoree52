package com.petstore.PetStore1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetReository extends JpaRepository<Pet, Long>{

	
}
