package com.jforce.tr.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="musteri")
public class Musteri {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getSacrengi() {
		return sacrengi;
	}

	public void setSacrengi(String sacrengi) {
		this.sacrengi = sacrengi;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public float getMaas() {
		return maas;
	}

	public void setMaas(float maas) {
		this.maas = maas;
	}

	public Date getDogumtarih() {
		return dogumtarih;
	}

	public void setDogumtarih(Date dogumtarih) {
		this.dogumtarih = dogumtarih;
	}

	public Date getOlusturulmatarih() {
		return olusturulmatarih;
	}

	public void setOlusturulmatarih(Date olusturulmatarih) {
		this.olusturulmatarih = olusturulmatarih;
	}

	@Column(name="isim")
	private String isim;
	
	@Column(name="soyisim")
	private String soyisim;
	
	@Column(name="sacrengi")
	private String sacrengi;
	
	@Column(name="yas")
	private int yas;
	
	@Column(name="telno")
	private String telno;
	
	@Column(name="maas")
	private float maas;
	
	@Column(name="dogumtarih")
	private Date dogumtarih;
	
	@Column(name="olusturulmatarih")
	private Date olusturulmatarih;
	
}
