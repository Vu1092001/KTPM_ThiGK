package com.example.chubedan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chubedan.entity.ChuBeDan;
import com.example.chubedan.respository.ChuBeDanResponsiroty;

@Service
public class ChuBeDanImplService {
	@Autowired
	ChuBeDanResponsiroty beDanResponsiroty;

	public List<ChuBeDan> findAll() {
		return beDanResponsiroty.findAll();
	}

	public void deleteById(String id) {
		beDanResponsiroty.deleteById(id);
	}
	public void createChuBeDan (ChuBeDan chuBeDan) {
		beDanResponsiroty.save(chuBeDan);
	}
}
