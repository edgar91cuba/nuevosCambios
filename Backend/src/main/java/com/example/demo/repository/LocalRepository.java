/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alfonso
 */
public interface LocalRepository extends JpaRepository<Local,Long>{
    
    
}
