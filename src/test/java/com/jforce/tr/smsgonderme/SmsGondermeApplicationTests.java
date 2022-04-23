package com.jforce.tr.smsgonderme;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jforce.tr.modal.Musteri;
import com.jforce.tr.repository.MusteriRepository;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT,classes = SmsGondermeApplication.class)
class SmsGondermeApplicationTests {
	
	@Autowired
	private MusteriRepository musteriRepositoryImpl;
	
	
	@Test
	public void musterileriGetir() {
		
		List<Musteri>musteriList=musteriRepositoryImpl.getMusteriList();
		System.out.println("Müşteri Sayısı:"+musteriList.size());
		
	}
	
	
	
	
}
