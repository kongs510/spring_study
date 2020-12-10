package com.bit.sts08;

import static org.junit.Assert.assertSame;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class ContextTest {
	Logger log=LoggerFactory.getLogger(ContextTest.class);
	@Inject
	JdbcTemplate jdbcTemplate;

	@Test
	public void testJDBC() throws SQLException {
		assertSame(12,jdbcTemplate.queryForList("select * from dept03").size());
		jdbcTemplate.update("insert into dept03(dname,loc) values ('test','test')");
		assertSame(12,jdbcTemplate.queryForList("select * from dept03").size());
	}
}









