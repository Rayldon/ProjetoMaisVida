package br.com.projetomaisvida.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projetomaisvida.dao.MunicipioDao;
import br.com.projetomaisvida.entity.Municipio;  

@Controller
@RequestMapping("/municipio")
public class MunicipioController {

	@RequestMapping(value = "/listarMunicipios/{uf}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Municipio> listarMunicipios(@PathVariable("uf") String uf) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("uf", uf);
		return new MunicipioDao().findMunicipios(m);
	}
}
