package com.funky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.funky.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}