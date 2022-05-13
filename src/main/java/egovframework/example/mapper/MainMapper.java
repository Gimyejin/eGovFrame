package egovframework.example.mapper;

import java.util.ArrayList;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
@Mapper("mainTestMapper")
public interface MainMapper {

	public ArrayList getList();

	public void insert(String id);

}
