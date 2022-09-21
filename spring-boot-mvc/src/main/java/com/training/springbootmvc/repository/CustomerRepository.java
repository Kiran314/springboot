package com.training.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springbootmvc.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
