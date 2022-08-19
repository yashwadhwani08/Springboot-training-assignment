package com.barclays.Business.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.Business.Application.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
