package com.example.chubedan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chubedan.entity.ChuBeDan;
import com.example.chubedan.service.ChuBeDanImplService;

@RequestMapping("/api")
@RestController
public class Controller {
	@Autowired
	ChuBeDanImplService chuBeDanImplService;
	
	@GetMapping("/list")
	public List<ChuBeDan> findAll(){
		return chuBeDanImplService.findAll();
	}
	
	@PostMapping("/create")
	public void createChuBeDan (@RequestBody ChuBeDan chuBeDan) {
		chuBeDanImplService.createChuBeDan(chuBeDan);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable String id) {
		chuBeDanImplService.deleteById(id);
	}
	
}
