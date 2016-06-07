package com.vinay.demo.vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;


/**
 * @author Vinay
 *
 */
/*@SpringBootApplication
@EntityScan(basePackages = {"com.vinay.demo.vendor"})
@EnableJpaRepositories(basePackages = {"com.vinay.demo.vendor"})
@EnableTransactionManagement
@ComponentScan("com.vinay.demo.vendor, com.vinay.demo.common")*/
@Configuration
public class VendorApp {
	 public static void main(String[] args) {
	        SpringApplication.run(VendorApp.class, args);
	    }
}
