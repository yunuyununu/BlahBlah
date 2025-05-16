package com.example.blahblah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blahblah.domain.CompanyDTO;
import com.example.blahblah.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyService dao;
	
	@RequestMapping("company/list")
	public List<CompanyDTO> list() {
		List<CompanyDTO> list = dao.list();
		System.out.print("list==="+list);
		return list;
	}
}
