package jp.co.stnet.apps.web.home;

import com.fasterxml.jackson.core.JsonProcessingException;
import jp.co.stnet.apps.domain.service.userdetails.IotUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

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
        //String userName = auth.getName();

        IotUserDetails users = (IotUserDetails) auth.getPrincipal();
        String userId = users.getUserId();
        session.setAttribute("userId", userId);

        //form.setUserName(userName);
        model.addAttribute("form", form);
        return "home/index";
    }

}


