package com.example.demo.repository.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Demo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMapperTest {

	@Autowired
	private DemoMapper demoMapper;
	
	@Test
	public void testSelectAll() {
		List<Map<String, Object>> list = demoMapper.selectAll();
		assertEquals(2, list.size());
	}

	@Test
	@Ignore
	public void testSelectById() {
		fail("尚未实现");
	}

	@Test
	@Ignore
	public void testInsert() {
		fail("尚未实现");
	}

	@Test
	@Ignore
	public void testUpdate() {
		fail("尚未实现");
	}

	@Test
	@Ignore
	public void testDeleteById() {
		fail("尚未实现");
	}

}
