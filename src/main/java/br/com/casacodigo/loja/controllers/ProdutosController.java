package br.com.casacodigo.loja.controllers;

import br.com.casacodigo.loja.models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutosController {

    @RequestMapping("/produtos/form")
    public String index(){
        return "produtos/form";
    }

    @RequestMapping(value = "/produtos")
    public String grava(Produto produto){
        System.out.println("produto = " + produto);
        return "produtos/ok";

    }
}

