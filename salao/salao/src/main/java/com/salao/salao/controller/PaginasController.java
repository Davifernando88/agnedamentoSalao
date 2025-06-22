
package com.salao.salao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {
    
     @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/agendamento")
    public String agendamento() {
        return "agendamento";
    }

    @GetMapping("/servicos")
    public String servicos() {
        return "servicos";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }
}
