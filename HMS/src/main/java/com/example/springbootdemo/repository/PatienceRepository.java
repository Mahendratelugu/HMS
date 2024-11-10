package com.example.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.entity.Patience;

@Repository
public interface PatienceRepository extends JpaRepository<Patience,Integer> {

}
