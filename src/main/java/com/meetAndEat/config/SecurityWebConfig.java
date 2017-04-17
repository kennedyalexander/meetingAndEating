package com.meetAndEat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {

	  auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
			"select u_username, u_password, u_active from USERS where u_username=?")
		.authoritiesByUsernameQuery(
			"select r_username, r_role from USER_ROLES where r_username=?");
	}

//	   @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	  	  http.authorizeRequests()
//			.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
//			.and()
//			  .formLogin().loginPage("/login").failureUrl("/login?error")
//			  .usernameParameter("username").passwordParameter("password")
//			.and()
//			  .logout().logoutSuccessUrl("/login?logout")
//			.and()
//			  .exceptionHandling().accessDeniedPage("/403")
//			.and()
//			  .csrf();
//	    }
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**");
        web.ignoring().antMatchers("/css/**");
		web.ignoring().antMatchers("/api/**");
    }
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {					
		http.csrf().disable();
        http
        .authorizeRequests()
            .antMatchers("/", "/home").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
        .logout()
            .permitAll();
	}
}
