package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

    @RequestMapping("/bankaccount")
    public String getHomePage() {
        return "bankaccount";
    }
}
