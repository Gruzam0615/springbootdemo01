package com.springbootdemo.demo.testtable01;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTable01Repository extends JpaRepository<TestTable01, BigInteger> {
    
}
