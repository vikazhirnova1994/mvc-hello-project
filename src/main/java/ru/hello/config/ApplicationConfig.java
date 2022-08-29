package ru.hello.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Victoria Zhirnova
 * @project mvc-hello-project
 */

@Configuration
@EnableWebMvc
@ComponentScan(value = "ru.hello")
public class ApplicationConfig {

}