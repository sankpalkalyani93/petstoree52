package com.petstore.PetStore1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceLogic implements PetService{

	@Autowired
	private PetReository petReository;
	
	@Override
	public void savePet(Pet pet) {
		this.petReository.save(pet);		
	}

	@Override
	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return this.petReository.findAll();
	}

	@Override
	public Pet getPetById(Long id) {
		// TODO Auto-generated method stub
		return this.petReository.findById(id).orElse(null);
	}
	
	@Override
	public void deletePetById(Long id) {
		// TODO Auto-generated method stub
		this.petReository.deleteById(id);
	}
}
