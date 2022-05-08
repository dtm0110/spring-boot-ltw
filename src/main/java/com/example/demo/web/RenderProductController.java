package com.example.demo.web;

import com.example.demo.data.IProductRepository;
import com.example.demo.data.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/products")
//@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class RenderProductController {

	@Autowired
    private IProductRepository iProductRepository;

    @ModelAttribute
    public void addProductToModel(Model model) {
        List<Product> products = (List<Product>) iProductRepository.findAll();
        model.addAttribute("products", products);
    }

    @GetMapping("")
    public String renderProduct() {
        return "listProducts";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @GetMapping("/edit")
    public String editProduct(@RequestParam("code") String code, Model model) {
        Optional<Product> productX = iProductRepository.findById(code);
        productX.ifPresent(product -> model.addAttribute("product", product));
        return "editProduct";
    }

    @GetMapping("/preDelete")
    public String preDeleteProduct(@RequestParam("code") String code, Model model) {
        Optional<Product> productX = iProductRepository.findById(code);
        productX.ifPresent(product -> model.addAttribute("product", product));
        return "confirm";
    }

    @PostMapping( "delete")
    public String deleteProduct(@RequestParam("code") String code, RedirectAttributes model) {
        iProductRepository.deleteById(code);
        model.addFlashAttribute("success", "Xóa thành công!");
        return "redirect:/products";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(@Valid Product product, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "addProduct";
        } else {
            iProductRepository.save(product);
            return "redirect:/products";
        }
    }
}
