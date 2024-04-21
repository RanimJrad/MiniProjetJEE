package com.ranim.supermarches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.ranim.supermarches.entities.Supermarche;
import com.ranim.supermarches.repos.SupermarcheRepository;

@Service
public class SupermarcheServiceImpl implements SupermarcheService {
	
	@Autowired
	SupermarcheRepository supermarcheRepository;

	@Override
	public Supermarche saveSupermarche(Supermarche s) {
		return supermarcheRepository.save(s);
	}

	@Override
	public Supermarche updateSupermarche(Supermarche s) {
		return supermarcheRepository.save(s);
	}

	@Override
	public void deleteSupermarche(Supermarche s) {
		supermarcheRepository.delete(s);
		
	}

	@Override
	public void deleteSupermarcheById(Long id) {
		supermarcheRepository.deleteById(id);
		
	}

	@Override
	public Supermarche getSupermarche(Long id) {
		return supermarcheRepository.findById(id).get();
	}

	@Override
	public List<Supermarche> getAllSupermarches() {
		return supermarcheRepository.findAll();
	}

	@Override
	public Page<Supermarche> getAllSupermarchesParPage(int page, int size) {
		return supermarcheRepository.findAll(PageRequest.of(page, size));
	}

}
