package ru.hello.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Victoria Zhirnova
 * @project mvc-hello-project
 */


public class MySerlvetIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/hello"};
    }
}
