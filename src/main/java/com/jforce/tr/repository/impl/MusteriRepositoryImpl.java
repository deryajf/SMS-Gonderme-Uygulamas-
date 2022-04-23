package com.jforce.tr.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jforce.tr.modal.Musteri;
import com.jforce.tr.repository.MusteriRepository;

@Repository
public class MusteriRepositoryImpl implements MusteriRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Musteri> getMusteriList() {
		List<Musteri> musteriListesi=null;
		try {
			musteriListesi=em.createQuery("from Musteri", Musteri.class).getResultList();
		} catch (Exception e) {
			System.out.println("Hata Oluştu!!!"+ e.getMessage());
		}
		return musteriListesi;
	}

}
