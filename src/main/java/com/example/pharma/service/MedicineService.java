package com.example.pharma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.pharma.dao.MedicineRepository;
import com.example.pharma.model.Medicine;
import java.util.List;

@Service
public class MedicineService {
	
	
	@Autowired 
	private MedicineRepository repository;
	
	
	public Medicine saveMedicine(Medicine medicine) {
		return repository.save(medicine);
	}
	
	
	public List<Medicine> saveAllMedicines(List<Medicine> medicines){
		return repository.saveAll(medicines);
	}
	
	
	public List<Medicine> getAllMedicines(){
		return repository.findAll();
	}
	

	public Medicine getMedicineById(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entry not found"));
	}
	
	public Medicine updateMedicine(Long id, Medicine updatedMedicine) {
		
		Medicine medicine = getMedicineById(id);
		
		medicine.setMedName(updatedMedicine.getMedName());
		
		medicine.setCategory(updatedMedicine.getCategory());
		
		medicine.setQuantity(updatedMedicine.getQuantity());
		
		medicine.setPrice(updatedMedicine.getPrice());
		
		medicine.setExpiryDate(updatedMedicine.getExpiryDate());
		
		medicine.setManufacturer(updatedMedicine.getManufacturer());
		
		
		return repository.save(medicine);
		
		
	}
	
	
	public String deleteMedicine(Long id) {
		
		try {
			repository.deleteById(id);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entry not found to delete");
		}
		
		return "Deleted Medicine with id: " + id ;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
