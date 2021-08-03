package jp.co.stnet.apps.domain.service.userdetails;

import jp.co.stnet.apps.domain.model.Authorities;
import jp.co.stnet.apps.domain.model.Users;
import jp.co.stnet.apps.domain.repository.AuthoritiesRepository;
import jp.co.stnet.apps.domain.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class IoTUserDetailsService implements UserDetailsService {

    private static final Logger logger =
            LoggerFactory.getLogger(IoTUserDetailsService.class);

    private final UsersRepository usersRepository;

    private final AuthoritiesRepository authoritiesRepository;

    /**
     * Constructor.
     *
     * @param usersRepository
     * @param authoritiesRepository
     */
    @Autowired
    public IoTUserDetailsService(UsersRepository usersRepository, AuthoritiesRepository authoritiesRepository) {
        this.usersRepository = usersRepository;
        this.authoritiesRepository = authoritiesRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = usersRepository.selectByPrimaryKey(username);
        if (users == null) {
            throw new UsernameNotFoundException(username + " is not found.");
        }

        Authorities authorities = authoritiesRepository.selectByPrimaryKey(users.getUsername());
        return new IotUserDetails(users, authorities, authoritiesRepository);
    }
}
