package jp.co.stnet.apps.domain.service.userdetails;

import jp.co.stnet.apps.domain.model.Authorities;
import jp.co.stnet.apps.domain.model.Users;
import jp.co.stnet.apps.domain.repository.AuthoritiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class IotUserDetails implements UserDetails {

    private static final long serialVersionUID = 1L;

    private static final List<? extends GrantedAuthority> DEFAULT_AUTHORITIES = AuthorityUtils
            .createAuthorityList("ROLE_USER");
    private final Users users;
    private final Authorities authorities;
    @Autowired
    AuthoritiesRepository authoritiesRepository;

    public IotUserDetails(Users users, Authorities authorities) {
        this.users = users;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList(authorities.getAuthority());
        //return DEFAULT_AUTHORITIES;
    }

    @Override
    public String getPassword() {
        return this.users.getPassword();
    }

    @Override
    public String getUsername() {
        return this.users.getUsername();
    }

    public String getUserId() {
        return this.users.getUserId();
    }

    public String getAppId() {
        return this.users.getAppId();
    }

    public Users getUsers() {
        return users;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

