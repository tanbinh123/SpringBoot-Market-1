package com.example.market.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.market.entity.UserEntity;
import com.example.market.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	private static final String USER_NOT_FOUND_MESSAGE = "The user has not been found.";

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepository.findFirstByEmail(username);
		UserBuilder userBuilder = null;

		if (user == null) {
			throw new UsernameNotFoundException(USER_NOT_FOUND_MESSAGE);
		}

		userBuilder = User.withUsername(username);
		userBuilder.disabled(false);
		userBuilder.password(user.getPassword());
		userBuilder.authorities(new SimpleGrantedAuthority("ROLE_USER"));

		return userBuilder.build();
	}

}
