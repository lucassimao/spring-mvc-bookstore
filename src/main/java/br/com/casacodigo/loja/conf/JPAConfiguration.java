package br.com.casacodigo.loja.conf;

import br.com.casacodigo.loja.models.Produto;
import com.mysql.jdbc.Driver;
import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;


@EnableTransactionManagement
public class JPAConfiguration {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
        ds.setDriverClassName(Driver.class.getName());
        factoryBean.setDataSource(ds);

        Properties p = new Properties();
        p.setProperty("hibernate.dialect", MySQL5Dialect.class.getName());
        p.setProperty("hibernate.show_sql", "true");
        p.setProperty("hibernate.hbm2ddl.auto", "update");
        factoryBean.setJpaProperties(p);
        factoryBean.setPackagesToScan(Produto.class.getPackage().getName());

        return factoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory factory){
        return new JpaTransactionManager(factory);
    }
}
