package jp.co.stnet.apps.web.home;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * トップページを返します.
     *
     * @return
     */
    @GetMapping("/")
    public String index(Model model) throws JsonProcessingException {
        HomeForm form = new HomeForm();
        // Principalからログインユーザの情報を取得
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //String userName = auth.getName();
        //form.setUserName(userName);
        model.addAttribute("form", form);
        return "home/index";
    }

}


