package com.example.chubedan.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="chubedan")
public class ChuBeDan implements Serializable {
	@Id
	private String ma;
	private String ten;
	private String tuoi;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public ChuBeDan(String ma, String ten, String tuoi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.tuoi = tuoi;
	}
	public ChuBeDan() {
		super();
	}
	@Override
	public String toString() {
		return "ChuBeDan [ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + "]";
	}
	
}
