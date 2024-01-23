package by.IT._02_jpa.configuration;


import by.IT._02_jpa.entties.Airplane;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@EnableJpaRepositories(basePackages = "by.IT._02_jpa.reposotories")
public class AppConfig {
    @Bean
    public JpaVendorAdapter vendorAdapter() {
        return new HibernateJpaVendorAdapter();

    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean factory(JpaVendorAdapter vendorAdapter) {
        var container = new LocalContainerEntityManagerFactoryBean();
        container.setJpaVendorAdapter(vendorAdapter);
        container.setPackagesToScan("by.IT._02_jpa.entties");
        return container;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        var transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    @Bean
    public Airplane boeing747() {
        return new Airplane("Boeing-747", 150);



       //////
    }
}









