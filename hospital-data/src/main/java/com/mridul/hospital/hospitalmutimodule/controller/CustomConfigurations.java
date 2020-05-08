//package com.mridul.hospital.hospitalmutimodule.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = {"com.mridul.hospital.hospitalmutimodule"},
//        entityManagerFactoryRef = "dbEntityManager",
//        transactionManagerRef = "dbTransactionManager")
//public class CustomConfigurations {
//
//    @Value("${db.jdbcURL}")
//    private String jdbcURL;
//
//    @Value("${db.user}")
//    private String user;
//
//    @Value("${db.password}")
//    private String password;
//
//    @Value("${db.driverClassName}")
//    private String driverClass;
//
//
//
//    //    @Bean
////    public DataSource dataSource() {
////        MysqlDataSource dataSource=new MysqlDataSource();
////        //dataSource.setDriverClassName(Driver.class.getName());
////        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
////        dataSource.setUser(System.getProperty("root"));
////        dataSource.setPassword(System.getProperty("rat"));
////        //dataSource.setInitialSize(2);
////        //dataSource.setMaxActive(5);
////        return dataSource;
////    }
//    @Bean
//    @Primary
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName(driverClass);
//        dataSourceBuilder.url(jdbcURL);
//        dataSourceBuilder.username(user);
//        dataSourceBuilder.password(password);
//        return dataSourceBuilder.build();
//    }
//
//    @Bean
//    @Primary
//    public PlatformTransactionManager dbTransactionManager()
//    {
//        JpaTransactionManager transactionManager
//                = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(
//                dbEntityManager().getObject());
//        return new DataSourceTransactionManager(getDataSource()); // (2)
//    }
//
//    @Bean
//    @Primary
//    public LocalContainerEntityManagerFactoryBean dbEntityManager() {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(getDataSource());
//        em.setPackagesToScan(new String[]{"com.mridul.hospital.hospitalmutimodule.*"});
//        em.setPersistenceUnitName("dbEntityManager");
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        em.setJpaVendorAdapter(vendorAdapter);
//
//        HashMap<String, Object> properties = new HashMap<>();
//
//        properties.put("hibernate.dialect",("org.hibernate.dialect.MySQL5Dialect"));
//        properties.put("hibernate.show-sql",("true"));
//        em.setJpaPropertyMap(properties);
//        return em;
//    }
//}
