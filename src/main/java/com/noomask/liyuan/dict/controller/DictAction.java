package com.noomask.liyuan.dict.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.noomask.liyuan.common.dto.DTOs;
import com.noomask.liyuan.common.dto.JsonDto;
import com.noomask.liyuan.dict.pojo.Dict;
import com.noomask.liyuan.dict.service.DictService;

@Controller
@RequestMapping("/dict")
public class DictAction {

	@Resource
	private DictService dictService;
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public JsonDto getAll() {
		List<Dict> list = dictService.findAll();
		return DTOs.getJson("获取字典列表成功", list);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public JsonDto add(@RequestBody Dict dict) {
		dictService.save(dict);
		return DTOs.getJson("新增字典成功");
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public JsonDto update(@RequestBody Dict dict) {
		dictService.update(dict);
		return DTOs.getJson("修改字典成功");
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public JsonDto remove(@PathVariable int id) {
		dictService.remove(id);
		return DTOs.getJson("删除字典成功");
	}
	
}
