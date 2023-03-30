package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bank.entity.Entities;

public interface Repository extends JpaRepository<Entities, Integer>{

}
