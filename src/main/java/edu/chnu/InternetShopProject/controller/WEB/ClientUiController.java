package edu.chnu.InternetShopProject.controller.WEB;

import edu.chnu.InternetShopProject.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/clients")
public class ClientUiController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("clients", clientService.getAll());
        return "clients";
    }
}
