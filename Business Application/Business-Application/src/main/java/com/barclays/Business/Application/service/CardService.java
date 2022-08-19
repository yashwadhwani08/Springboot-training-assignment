package com.barclays.Business.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.Business.Application.model.Card;
import com.barclays.Business.Application.repository.BusinessRepository;
import com.barclays.Business.Application.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired 
	CardRepository cardRepository;
	
	@Autowired
	BusinessRepository businessRepository;
	
	public void cardSave(long customer_id, Card card)
	{
		if(businessRepository.findById(customer_id) != null)
		{
			
			card.setCust_id(customer_id);
			cardRepository.save(card);
			
		}
	}
	
	
}
