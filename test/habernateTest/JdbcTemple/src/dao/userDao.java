package dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class userDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void add(){
		jdbcTemplate.update("insert into user(id,name,age) value(?,?,?)",1,"吊毛俊",38);
	}
}
