package com.noomask.liyuan.dict.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.noomask.liyuan.dict.pojo.Dict;

public interface DictMapper {

	@Select("SELECT * FROM t_test")
	List<Dict> selectAll();
	
	@Insert("INSERT INTO t_test (id,name,add_date) VALUES (#{id},#{name},now())")
	@Options(useGeneratedKeys=true, keyColumn="id", keyProperty="id")
	void insert(Dict dict);
	
	void updateById(Dict dict);
	
	@Delete("DELETE FROM t_test WHERE id = #{id}")
	void deleteById(@Param("id")int id);
	
}
