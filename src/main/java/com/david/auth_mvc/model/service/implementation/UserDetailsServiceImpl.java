package com.david.auth_mvc.model.service.implementation;

import java.util.List;

import com.david.auth_mvc.common.utils.constants.messages.CredentialMessages;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.david.auth_mvc.model.domain.entity.Credential;
import com.david.auth_mvc.model.repository.CredentialRepository;
import org.springframework.security.core.userdetails.User;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    private final CredentialRepository credentialRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Credential credential = this.findUser(username);
            List<SimpleGrantedAuthority> autorityList = List.of(
                            new SimpleGrantedAuthority("ROLE_USER")
                    );
          
          return new User(
                  credential.getEmail(),
                  credential.getPassword(),
                  autorityList
            );
    }


    private Credential findUser(String email) throws UsernameNotFoundException {
        Credential credential = this.credentialRepository.getCredentialByEmail(email);
        if (credential == null) {
            throw new UsernameNotFoundException(CredentialMessages.USER_NOT_REGISTERED);
        }
        return credential;
    }
    
}
