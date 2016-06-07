package com.vinay.demo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;


/**
 * @author Vinay
 *
 */
/*@SpringBootApplication
@EntityScan(basePackages = {"com.vinay.demo"})
@EnableJpaRepositories(basePackages = {"com.vinay.demo"})
@EnableTransactionManagement
@ComponentScan("com.vinay.demo")*/
@Configuration
public class CustomerApp {
	 public static void main(String[] args) {
	        SpringApplication.run(CustomerApp.class, args);
	    }
}
