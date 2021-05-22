package com.fal;

import com.fal.entity.MyNavi;
import com.fal.mapper.NaviMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyNaviApplicationTests {

	@Autowired
	private NaviMapper naviMapper;

	@Test
	public void select(){
		List<MyNavi> list = naviMapper.selectList(null);
		Assert.assertEquals(1,list.size());
		list.forEach(System.out::println);
	}
}
