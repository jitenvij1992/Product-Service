package com.epam.productservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.epam.productservice.dao")
public class ApplicationConfiguration {
}
