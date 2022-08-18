package com.barclays.Business.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.Business.Application.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {

}
