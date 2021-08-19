package jtableornek2;

import java.util.ArrayList;

public class Urun {

	
	private int id;
	private String  urunAdi;
	private int fiyat;
	private String  marka;
	
	
	public Urun(int id, String  urunAdi,int fiyat,String  marka){
		
		
		
		this.id = id;
		this.urunAdi = urunAdi;
		this.fiyat = fiyat;
		this.marka = marka;
		
		
	}
	
	public ArrayList<Urun> urunler = new ArrayList<Urun>();
	
	
	public Urun(){
		
		urunler.add(new Urun(1, "ayakkabı", 120, "Nike"));
		urunler.add(new Urun(2, "ayakkabı", 200, "Puma"));
		urunler.add(new Urun(3, "terlik", 90, "Crocs"));
		urunler.add(new Urun(4, "terlik", 20, "Gezer"));
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUrunAdi() {
		return urunAdi;
	}


	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}


	public int getFiyat() {
		return fiyat;
	}


	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}


	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public ArrayList<Urun> getUrunler() {
		return urunler;
	}


	public void setUrunler(ArrayList<Urun> urunler) {
		this.urunler = urunler;
	}
}
