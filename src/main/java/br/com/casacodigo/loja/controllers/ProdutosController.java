package br.com.casacodigo.loja.controllers;

import br.com.casacodigo.loja.daos.ProdutoDAO;
import br.com.casacodigo.loja.models.Produto;
import br.com.casacodigo.loja.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("produtos")
public class ProdutosController
{

    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView listar(){
        List<Produto> produtoList = produtoDAO.listar();
        ModelAndView modelAndView = new ModelAndView("produtos/lista");
        modelAndView.addObject("produtoList",produtoList);
        return modelAndView;

    }

    @RequestMapping("/form")
    public ModelAndView form(){

        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos",TipoPreco.values());
        return modelAndView ;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String grava(Produto produto){
        System.out.println("produto = " + produto);

        produtoDAO.gravar(produto);
        return "produtos/ok";

    }
}

