package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("classpath:MyApp.properties")
@EnableAspectJAutoProxy
public class MyConfig {

    @Bean
    public SchoolLibrary SchoolLibraryBean() {
        return new SchoolLibrary();
    }

    @Bean
    public Book BookBean() {
        return new Book();
    }
}
