package com.BikkadIT.MakeMyTrip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.MakeMyTrip.model.Passanger;
import com.BikkadIT.MakeMyTrip.model.Ticket;
import com.BikkadIT.MakeMyTrip.repository.PassangerRepository;
import com.BikkadIT.MakeMyTrip.repository.TicketRepository;


@Service
public class PassangerServiceImpl implements PassangerServiceI {

	@Autowired
	private PassangerRepository passangerRepository;
	
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket SaveData(Passanger psng) {
		Passanger save = passangerRepository.save(psng);
		
		//int fid = save .getFid();
		
		// Ticket ticket = ticketRepository.findById(fid).get();
		 
		 String url = "http://localhost:8888/SaveData";

		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
				.uri(url)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromValue(psng))
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		
		return ticket;
		
		
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Ticket> postForEntity = rt.postForEntity(url, psng, Ticket.class);
//		Ticket ticket1 = postForEntity.getBody();
//		return ticket1;
	
	}
		 
	}
