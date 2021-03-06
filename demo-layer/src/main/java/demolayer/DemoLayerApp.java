package demolayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = {"com.vinay.demo.*"})
@EnableJpaRepositories(basePackages = {"com.vinay.demo.*"})
@EnableTransactionManagement
@ComponentScan("demolayer, com.vinay.demo.*")
public class DemoLayerApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoLayerApp.class, args);
    	//SpringApplication.run(AccountApp.class, args);
    }
}
