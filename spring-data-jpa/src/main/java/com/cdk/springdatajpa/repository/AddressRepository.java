package com.cdk.springdatajpa.repository;

import com.cdk.springdatajpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
