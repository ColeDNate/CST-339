package com.gcu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gcu.data.UserDataService;
import com.gcu.entity.UserEntity;

@Service
public class UserBusinessService implements UserDetailsService{
	UserDataService dataServe;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEnt = dataServe.findByUsername(username);
		if(userEnt != null) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("USER"));
			return new User(((UserDetails) userEnt).getUsername(), ((UserDetails) userEnt).getPassword(), authorities);
		}
		else {
			throw new UsernameNotFoundException("Username not found");
		}
			
		
	}

}
