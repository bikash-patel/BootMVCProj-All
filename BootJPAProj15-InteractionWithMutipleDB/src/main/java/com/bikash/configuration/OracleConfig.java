package com.bikash.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OracleConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "mysql.datasource")
	public DataSource oracleData()
	{
		return DataSourceBuilder.create().build();
	}
}
