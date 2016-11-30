package br.edu.ifsp.tads.dsw.projeto66.config;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
class JPAConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = 
                new LocalContainerEntityManagerFactoryBean();
        
        JpaVendorAdapter jpaVendorAdpter = new HibernateJpaVendorAdapter();
        factoryBean.setJpaVendorAdapter(jpaVendorAdpter);
        
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        dataSource.setUsername("adm");
        dataSource.setPassword("six");
        dataSource.setUrl("jdbc:derby://localhost:1527/db66");
        dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
        
        factoryBean.setDataSource(dataSource);
        
        Properties props = new Properties();
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.hbm2ddl.auto", "update");

        factoryBean.setJpaProperties(props);
        
        factoryBean.setPackagesToScan("br.edu.ifsp.tads.dsw.projeto66.model");
        return factoryBean;
    }
    
    @Bean
    public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
    
}
