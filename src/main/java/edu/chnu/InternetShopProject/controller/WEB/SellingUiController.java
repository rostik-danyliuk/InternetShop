package edu.chnu.InternetShopProject.controller.WEB;

import edu.chnu.InternetShopProject.service.interfaces.SellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/sellings")
public class SellingUiController {
    @Autowired
    SellingService sellingService;
    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("sellings", sellingService.getAll());
        return "sellings";
    }
}
