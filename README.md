# spring-security-new-config
In this Project explain, how to configure spring security with a new configuration (without WebSecurityConfigurerAdapter)
#How to implement Spring Security without using the WebSecurityConfigurerAdapter
Prerequisite
1. You have spring boot application and imported to IntelliJ idea
2. Your laptop already installed PostgreSQL database
3. Your spring boot application already implemented user detail services

#In this tutorial, I will use this scenario
1. show the login form
2. user insert user name and password
3. if username and password are true, show this message ("Hello Spring Security!!!")

#Let's jump right in
1. add spring security dependency
2. create a security class and add @Configuration or @EnableWebSecurity
3. create a bean for the password encoder(i am using BCryptPasswordEncoder)
4. create a bean authentication manager
5. create a bean security filter chain
6. try to run the app

#How to run this appliaction
1. import project into intellij idea
2. create database with name APP_DB (username =user , password =password)
3. Run main class
