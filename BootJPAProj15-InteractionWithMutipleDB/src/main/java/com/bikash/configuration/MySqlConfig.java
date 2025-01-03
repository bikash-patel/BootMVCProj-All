package com.bikash.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySqlConfig {
	
	@ConfigurationProperties(prefix = "oracle.datasource")
	@Bean
	public DataSource mySqlData()
	{
		return DataSourceBuilder.create().build();
	}
}
