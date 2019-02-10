package com.noomask.liyuan.dict.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.noomask.liyuan.dict.mapper.DictMapper;
import com.noomask.liyuan.dict.pojo.Dict;
import com.noomask.liyuan.dict.service.DictService;

@Service
public class DictServiceImpl implements DictService {

	@Resource
	private DictMapper dictMapper;
	
	@Override
	public List<Dict> findAll() {
		return dictMapper.selectAll();
	}

	@Override
	public void save(Dict dict) {
		dictMapper.insert(dict);
	}

	@Override
	public void update(Dict dict) {
		dictMapper.updateById(dict);
	}

	@Override
	public void remove(int id) {
		dictMapper.deleteById(id);
	}

}
