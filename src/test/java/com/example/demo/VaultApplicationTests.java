package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class VaultApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
		assertThat(environment
				.getRequiredProperty("spring.cloud.vault.enabled", Boolean.class))
				.isFalse();
	}

}
