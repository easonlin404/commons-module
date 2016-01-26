package com.myapp;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

	/**
	 * local 整合測試用，使用embedded DB
	 * 
	 * @return
	 */
	@Bean(destroyMethod = "shutdown")
	public DataSource dataSourceLocal() {
		return new EmbeddedDatabaseBuilder().addScript("classpath:schema.sql").addScript("classpath:test-data.sql")
				.build();
	}

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:h2:tcp://dbserver/~/test");
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUsername("sa");
		dataSource.setPassword("password");
		dataSource.setInitialSize(20);
		dataSource.setMaxActive(30);
		return dataSource;
	}

	
}
