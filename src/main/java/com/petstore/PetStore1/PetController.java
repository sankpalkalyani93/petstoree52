package com.petstore.PetStore1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

	@Autowired
	private PetService petService;
	
	@PostMapping
	public void savePet(@RequestBody Pet p) {
		petService.savePet(p);
	}
	
	@GetMapping
	public List<Pet> getAllPets(){
		return petService.getAllPets();
	}
	
	@GetMapping("/{id}")
	public Pet getPetById(@PathVariable Long id) {
		return petService.getPetById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePetById(@PathVariable Long id) {
		petService.deletePetById(id);
	}
}
