package egovframework.example.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.mapper.MainMapper;

@Service("mainTestService")
public class MainService {
	@Resource(name="mainTestMapper")
	private MainMapper mapper;
	
	public ArrayList getList() {
		ArrayList list=mapper.getList();
		return list;
		
	}

	public void insert(String id) {
		mapper.insert(id);
		
	}
	
}
