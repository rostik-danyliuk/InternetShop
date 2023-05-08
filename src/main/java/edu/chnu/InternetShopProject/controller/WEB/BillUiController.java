package edu.chnu.InternetShopProject.controller.WEB;

import edu.chnu.InternetShopProject.service.interfaces.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/bills")
public class BillUiController {
    @Autowired
    BillService billService;
    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("bills", billService.getAll());
        return "bills";
    }
}
