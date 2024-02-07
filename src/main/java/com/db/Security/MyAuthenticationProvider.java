package com.db.Security;

import java.util.Arrays;

import org.apache.coyote.BadRequestException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName=authentication.getName();
		String password=authentication.getCredentials().toString();
		if("dnbhosale".equals(userName) && "dnbhosale".equals(password)) return new  UsernamePasswordAuthenticationToken(userName, password,Arrays.asList());
		else throw new BadCredentialsException("INVALID USER PAssword");
		 
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
