package com.springbootdemo.demo.testtable01;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestTable01 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger indexNumber;
    private String value;

}
