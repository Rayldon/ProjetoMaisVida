package br.com.projetomaisvida.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projetomaisvida.dao.MedicoDao;
import br.com.projetomaisvida.entity.Medico;  

@Controller
@RequestMapping("/medico")
public class MedicoController {

	@RequestMapping(value = "/listarMedicos", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Medico> listarMedicos() {
		return new MedicoDao().findMedicos();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody Map<String,Object> salvar(@RequestBody Medico medico) {
		
		new MedicoDao().save(medico);
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("msg", "Salvo com sucesso");
		return m;
	}
}
