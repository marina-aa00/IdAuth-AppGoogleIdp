package uc3m.es.idauth.googleidp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoogleIdpController {
   
    @GetMapping("/")
    public String inicio() {
        return "login.html";
    }
    
    @GetMapping("/authenticated")
    public String user(Model model,
                        @AuthenticationPrincipal OidcUser oidcUser) {
        model.addAttribute("userName", oidcUser.getFullName());
        model.addAttribute("email", oidcUser.getEmail());
        return "auth/authenticated.html";
    }

}
