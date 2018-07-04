package com.example.demo.service.imp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Demo;
import com.example.demo.repository.mapper.DemoMapper;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImp implements DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	@Override
//	public List<Demo> selectAll() {
//		// TODO 自动生成的方法存根
//		return demoMapper.selectAll();
//	}
	public List<Map<String, Object>> selectAll() {
	// TODO 自动生成的方法存根
	return demoMapper.selectAll();
}

	@Override
	public Demo selectById(Long id) {
		// TODO 自动生成的方法存根
		return demoMapper.selectById(id);
	}

	@Transactional
	@Override
	public boolean addArea(Demo demo) {
		if(demo.getAreaName() != null &&  !"".equals(demo.getAreaName())) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			demo.setCreateTime(sdf.format(new Date()));
			demo.setLastEditTime(sdf.format(new Date()));
			try {
				int num = demoMapper.insert(demo);
				if(num > 0) {
					return true;
				}else {
					throw new RuntimeException("插入区域信息失败");
				}
			}catch(Exception e) {
				throw new RuntimeException("插入区域信息失败" + e.getMessage());
			}
			
		}else {
			throw new RuntimeException("区域名字不能为空");
		}
		
	}

	@Override
	@Transactional
	public boolean updateArea(Demo demo) {
		if(demo.getAreaId() > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			demo.setLastEditTime(sdf.format(new Date()));
			int num = demoMapper.update(demo);
			try {
				if(num > 0) {
					return true;
				}else {
					throw new RuntimeException("修改区域信息失败");
				}
			}catch(Exception e) {
				throw new RuntimeException("修改区域信息失败" + e.getMessage());
			}
			
		}else {
			throw new RuntimeException("区域信息不能为空");
		}
	}

	@Override
	@Transactional
	public boolean deleteAreaById(Long id) {
		if(id > 0) {
			int num = demoMapper.deleteById(id);
			try {
				if(num > 0) {
					return true;
				}else {
					throw new RuntimeException("删除区域信息失败");
				}
			}catch(Exception e) {
				throw new RuntimeException("删除区域信息失败" + e.getMessage());
			}
			
		}else {
			throw new RuntimeException("区域信息不能为空");
		}
	}

}
