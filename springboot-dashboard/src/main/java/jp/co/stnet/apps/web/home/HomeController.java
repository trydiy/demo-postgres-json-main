package jp.co.stnet.apps.web.home;

import com.fasterxml.jackson.core.JsonProcessingException;
import jp.co.stnet.apps.domain.service.userdetails.IotUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    HttpSession session;

    /**
     * トップページを返します.
     *
     * @return
     */
    @GetMapping("/")
    public String index(Model model) {
        HomeForm form = new HomeForm();

        // Principalからログインユーザの情報を取得
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // userid, role の取得
        IotUserDetails users = (IotUserDetails) auth.getPrincipal();
        String userId = users.getUserId();
        String appId = users.getAppId();

        Collection<? extends GrantedAuthority> authorities = users.getAuthorities();
        Set<String> roles = authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toSet());

        // (1ロール／ユーザの設定で利用)
        String role = "ROLE_USER";
        for(Iterator<String> itr = roles.iterator(); itr.hasNext();) {
            role = itr.next();
            logger.info("ROLE : {}", role);
        }

        session.setAttribute("appId", appId);
        session.setAttribute("userId", userId);
        session.setAttribute("role", role);

        //form.setUserName(userName);
        model.addAttribute("form", form);
        return "home/index";
    }

}


