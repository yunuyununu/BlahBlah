package com.example.blahblah.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.blahblah.domain.CompanyDTO;
import com.example.blahblah.service.CompanyService;

@Repository
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<CompanyDTO> list() {
		return sqlSession.selectList("company.list");
	}
}
