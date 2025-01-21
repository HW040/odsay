package green.odsay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class OdsayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdsayApplication.class, args);
    }

}
