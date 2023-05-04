package edu.chnu.InternetShopProject.controller.WEB;

import edu.chnu.InternetShopProject.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/products")
public class ProductUiController {

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("products", productService.getAll());
        return "products";
    }
}
