package com.jana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jana60.model.Degrees;

@Repository
public interface DegreeRepository extends CrudRepository<Degrees, Integer> {

}
