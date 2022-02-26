package com.cares.p1;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyBatisTest extends InitTestCase {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void dataSourceTest() throws Exception {
		assertNotNull(dataSource);
		assertNotNull(dataSource.getConnection());	
		assertNotNull(sqlSession);
	}

}
