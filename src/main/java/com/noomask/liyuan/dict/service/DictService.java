package com.noomask.liyuan.dict.service;

import java.util.List;

import com.noomask.liyuan.dict.pojo.Dict;

public interface DictService {

	List<Dict> findAll();
	
	void save(Dict dict);
	
	void update(Dict dict);
	
	void remove(int id);
	
}
