
package br.edu.ifsp.tads.dsw.projeto66.config;

import br.edu.ifsp.tads.dsw.projeto66.config.interceptor.MyInterceptor;
import br.edu.ifsp.tads.dsw.projeto66.controller.HomeController;
import br.edu.ifsp.tads.dsw.projeto66.dao.ClienteDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class, ClienteDAO.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter
{
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor());
    }
}
