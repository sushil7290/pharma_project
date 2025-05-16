package com.example.pharma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pharma.model.Medicine;
import com.example.pharma.service.MedicineService;

@RestController
@RequestMapping("/pharma")
public class MedicineController {
	
	
	@Autowired
	private MedicineService medicineService;
	
	//POST
	@RequestMapping(value="/addmedicine", method= RequestMethod.POST)
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		return medicineService.saveMedicine(medicine);
	}
	
	//POST
	@RequestMapping(value="/addmedicines", method= RequestMethod.POST)
	public List<Medicine> addMedicine(@RequestBody List<Medicine> medicine) {
		return medicineService.saveAllMedicines(medicine);
	}
	
	//GET
	@RequestMapping(value="/medicines/{id}", method= RequestMethod.GET)
	public Medicine getMedicine(@PathVariable long id) {
		return medicineService.getMedicineById(id);
	}
	
	//GET
	@RequestMapping(value="/medicines", method= RequestMethod.GET)
	public List<Medicine> getAllMedicines() {
		return medicineService.getAllMedicines();
	}
	
	//PUT
	@RequestMapping(value="/medicines/{id}", method= RequestMethod.PUT)
	public Medicine updateMedicine(@PathVariable long id, @RequestBody Medicine medicine) {
		return medicineService.updateMedicine(id, medicine);
	}
	
	
	//DELETE
	@RequestMapping(value="/medicines/{id}", method= RequestMethod.DELETE)
	public String deleteMedicine(@PathVariable long id) {
		return medicineService.deleteMedicine(id);
	}

	
	
}
