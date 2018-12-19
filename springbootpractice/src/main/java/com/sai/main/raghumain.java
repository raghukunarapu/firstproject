

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@EnableJpaRepositories(basePackages= {"springbootraghu.springbootpractice.*"})*/
@ComponentScan(basePackages= {"springbootraghu.*"})
/*@EntityScan(basePackages= {"springbootraghu.springbootpractice.*"})*/
@EnableAutoConfiguration
public class maindemo {

	
}
