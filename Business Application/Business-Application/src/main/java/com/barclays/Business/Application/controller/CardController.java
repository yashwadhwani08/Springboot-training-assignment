package com.barclays.Business.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.Business.Application.model.Card;
import com.barclays.Business.Application.service.CardService;

@RestController
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@PostMapping("/card/{id}")
	public ResponseEntity<Card> saveCard(@RequestBody Card card, @PathVariable("id") long id)
	{
		cardService.cardSave(id, card);
		return new ResponseEntity<>(card, HttpStatus.CREATED);
				
	}
}
