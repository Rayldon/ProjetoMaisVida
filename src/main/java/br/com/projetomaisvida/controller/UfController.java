package br.com.projetomaisvida.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projetomaisvida.dao.UfDao;
import br.com.projetomaisvida.entity.Uf;  

@Controller
@RequestMapping("/uf")
public class UfController {

	@RequestMapping(value = "/listarTodas", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Uf> listarTodas() {
		return new UfDao().findUf();
	}
}
