package la_avenida.la_avenida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan("la_avenida.la_avenida.Modelo")
@EnableJpaRepositories(basePackages = {"la_avenida.la_avenida.Repositorios"})
public class LaAvenidaApplication {
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(final CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowedOrigins("*")
                    .allowedHeaders("*");
            }
        };
    }
	public static void main(final String[] args) {
		SpringApplication.run(LaAvenidaApplication.class, args);
	}

}
