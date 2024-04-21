package com.ranim.supermarches;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ranim.supermarches.entities.Supermarche;
import com.ranim.supermarches.service.SupermarcheService;

@SpringBootApplication
public class SupermarcheProjApplication implements CommandLineRunner{
	
	@Autowired
	SupermarcheService supermarcheService ;

	public static void main(String[] args) {
		SpringApplication.run(SupermarcheProjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		supermarcheService.saveSupermarche(new Supermarche("Monoprix Express nabeul", 26000.0, new Date()));
		supermarcheService.saveSupermarche(new Supermarche("carrefour Bizerte", 68000.0, new Date()));
		supermarcheService.saveSupermarche(new Supermarche("mg express ", 19000.0, new Date()));
				
	}

}
