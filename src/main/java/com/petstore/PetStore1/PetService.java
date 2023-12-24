package com.petstore.PetStore1;

import java.util.List;

public interface PetService {

	void savePet(Pet pet);
	List<Pet> getAllPets();
	Pet getPetById(Long id);
	void deletePetById(Long id);
}
