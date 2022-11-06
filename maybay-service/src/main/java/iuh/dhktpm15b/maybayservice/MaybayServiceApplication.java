package iuh.dhktpm15b.maybayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
public class MaybayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaybayServiceApplication.class, args);
	}

}
