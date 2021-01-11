
package com.meshal.main.security_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       
        
        UserBuilder users = User.withDefaultPasswordEncoder();
        
        auth.inMemoryAuthentication()
                .withUser(users.username("meshal").password("1234512345").roles("manger"))
                .withUser(users.username("ahmad").password("12345").roles("doctor"))
                .withUser(users.username("khaled").password("1212").roles("student"));
                
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests().anyRequest().authenticated()
               .and()
               .formLogin().loginPage("/show-login")
               .loginProcessingUrl("/processForm")
               .permitAll()
               .and()
               .logout().permitAll();
    }
    
    
    
    
    
    
    
}
