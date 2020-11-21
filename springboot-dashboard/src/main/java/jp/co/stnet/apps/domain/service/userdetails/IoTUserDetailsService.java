package jp.co.stnet.apps.domain.service.userdetails;

import jp.co.stnet.apps.domain.model.Users;
import jp.co.stnet.apps.domain.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IoTUserDetailsService implements UserDetailsService {

    private static final Logger logger =
            LoggerFactory.getLogger(IoTUserDetailsService.class);

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Users> usersList = usersRepository.selectAll();
        logger.info("users rec size: {}", usersList.size());
        Users users = usersRepository.selectByPrimaryKey(username);
        if (users == null) {
            throw new UsernameNotFoundException(username + " is not found.");
        }
        return new IotUserDetails(users);
    }
}
