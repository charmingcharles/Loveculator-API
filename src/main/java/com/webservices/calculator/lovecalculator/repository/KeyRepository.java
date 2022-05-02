package com.webservices.calculator.lovecalculator.repository;

import com.webservices.calculator.lovecalculator.model.Key;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface KeyRepository extends JpaRepository<Key, Integer> {

    Key getByKey(String key);

    @Modifying
    @Query("UPDATE Key k SET k.callsLeft = ?2 WHERE k.id = ?1")
    void updateCallsLeft(Integer id, Integer callsLeft);

}
