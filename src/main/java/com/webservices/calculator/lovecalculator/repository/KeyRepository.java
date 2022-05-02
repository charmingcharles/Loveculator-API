package com.webservices.calculator.lovecalculator.repository;

import com.webservices.calculator.lovecalculator.model.Key;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface KeyRepository extends JpaRepository<Key, Integer> {

    Key getByKey(String key);

}
