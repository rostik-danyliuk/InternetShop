package edu.chnu.InternetShopProject.controller.WEB;

import edu.chnu.InternetShopProject.service.interfaces.RegularClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/regular-clients")
public class RegularClientUiController {
    @Autowired
    RegularClientService regularClientService;
    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("regular-clients", regularClientService.getAll());
        return "regular-clients";
    }
}
