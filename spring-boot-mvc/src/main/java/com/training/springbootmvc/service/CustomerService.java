package com.training.springbootmvc.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.springbootmvc.model.Customer;
import com.training.springbootmvc.repository.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService {
	@Autowired
	private CustomerRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Customer> cu = repository.findById(username);
		if (cu.isEmpty()) {
			throw new UsernameNotFoundException("User not found");
		}

		Customer customer = cu.get();

		return new org.springframework.security.core.userdetails.User(customer.getUsername(), customer.getPassword(),
				Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
	}

}
