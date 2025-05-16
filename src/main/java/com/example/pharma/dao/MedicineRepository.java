package com.example.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pharma.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}
