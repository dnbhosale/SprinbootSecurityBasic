package com.db.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {
	
	
	@Bean
	SecurityFilterChain fc(HttpSecurity http)throws Exception{
		http.formLogin();
		 http.authorizeHttpRequests(a->a.anyRequest().authenticated()) //a.requestMatchers("/home")
		 .httpBasic(Customizer.withDefaults());
		 return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// commenting this ,because wehave implement custome authentication provider here- myauthenticationProvide.class
//	@Bean
//	public UserDetailsService userDetailsService() {
//		InMemoryUserDetailsManager userDetailService=new InMemoryUserDetailsManager();
//		UserDetails user=User.withUsername("root").password(passwordEncoder().encode("root")).authorities("read")
//				.build();
//		userDetailService.createUser(user);
//		return userDetailService;
//	}

}
