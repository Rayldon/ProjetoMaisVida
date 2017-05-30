package br.com.projetomaisvida.converter;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.projetomaisvida.entity.Medico;

public class MedicoConverter{

	public Map<String, Object> converterToMap(Medico Medico) {
        Map<String, Object> mapMedico = new HashMap<String, Object>();
        mapMedico.put("primeiroNome", Medico.getPrimeiroNome());
        mapMedico.put("ultimoNome", Medico.getUltimoNome());
        mapMedico.put("email", Medico.getEmail());
        mapMedico.put("senha", Medico.getSenha());
        mapMedico.put("status", Medico.getStatus());
        mapMedico.put("uf", Medico.getUf());
        mapMedico.put("municipio", Medico.getMunicipio());
        mapMedico.put("ativo", Medico.isAtivo());
        mapMedico.put("especialidade", Medico.getEspecialidade());
        return mapMedico;
    }

    public Medico converterToMedico(DBObject dbo) {
        Medico Medico = new Medico();
        Medico.setId(dbo.get("_id").toString());
        Medico.setPrimeiroNome((String) dbo.get("primeiroNome"));
        Medico.setUltimoNome((String) dbo.get("ultimoNome"));
        Medico.setEmail((String) dbo.get("email"));
        Medico.setSenha((String) dbo.get("senha"));
        Medico.setStatus((int) dbo.get("status"));
        Medico.setUf((String) dbo.get("uf"));
        Medico.setMunicipio((String) dbo.get("municipio"));
        Medico.setAtivo((boolean) dbo.get("ativo"));
        Medico.setEspecialidade((String) dbo.get("especialidade"));
        return Medico;
    }
}