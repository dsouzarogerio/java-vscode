package br.com.tw.springvscode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/saudacao/{nome}", method = RequestMethod.GET)
    public String saudacao(@PathVariable String nome, Model model){
        model.addAttribute("nome", nome);

        return "saudacao";
    }
}
