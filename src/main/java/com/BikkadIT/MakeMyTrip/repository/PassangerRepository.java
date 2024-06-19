package com.BikkadIT.MakeMyTrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.MakeMyTrip.model.Passanger;



@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

}
