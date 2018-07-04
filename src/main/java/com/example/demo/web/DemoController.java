package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Demo;
import com.example.demo.service.imp.DemoServiceImp;

@RestController
@RequestMapping("/demo") 
public class DemoController {
	
	@Autowired
	private DemoServiceImp demoServiceImp;

	/**
	 * 查询列表中的所有数据
	 * @return
	 */
	@GetMapping("/listarea")
	public Map<String, Object> getAllArea() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list =  demoServiceImp.selectAll();
		map.put("areaList", list);
		return map;
	}
	
	/**
	 * 根据主键id查询数据
	 * @param id
	 * @return
	 */
	@GetMapping("/listareabyId")
	public Map<String, Object> getAreaById(@RequestParam Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Demo list =  demoServiceImp.selectById(id);
		map.put("areaList", list);
		return map;
	}
	
	/**
	 * 新增
	 * @param demo
	 * @return
	 */
	@PostMapping("/addareadata")
	public Map<String, Object> addArea(@RequestBody Demo demo) {
		Map<String, Object> mapModel = new HashMap<String, Object>();
		mapModel.put("status", demoServiceImp.addArea(demo));
		return mapModel;
	}
	
	@PostMapping("/updatearea")
	public Map<String, Object> updateArea(@RequestBody Demo demo){
		Map<String, Object> mapModel = new HashMap<String, Object>();
		mapModel.put("status", demoServiceImp.updateArea(demo));
		return mapModel;
	}
	
	/**
	 * 根据主键id 删除数据
	 * @param id
	 * @return
	 */
	@GetMapping("/deletareabyId")
	public Map<String, Object> delete(@RequestParam Long id) {
		Map<String, Object> mapModel = new HashMap<String, Object>();
		mapModel.put("status", demoServiceImp.deleteAreaById(id));
		return mapModel;
	}
}
