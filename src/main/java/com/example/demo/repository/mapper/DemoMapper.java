package com.example.demo.repository.mapper;

import java.util.List;
import java.util.Map;


import com.example.demo.entity.Demo;

public interface DemoMapper {
	
	/**
	 * 查询所有数据
	 * @return
	 */
//	List<Demo> selectAll();
	List<Map<String, Object>> selectAll();
	
	/**
	 * 根据id查询数据
	 * @param id
	 * @return
	 */
	Demo selectById(Long id);
	
	/**
	 * 新增
	 * @param demo
	 * @return
	 */
	int insert(Demo demo);
	
	/**
	 * 修改
	 * @param demo
	 * @return
	 */
	int update(Demo demo);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int deleteById(Long id);
}
