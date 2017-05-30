package br.com.projetomaisvida.converter;

import java.util.LinkedHashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.projetomaisvida.entity.Municipio;

public class MunicipioConverter{

	public Map<String, Object> converterToMap(Municipio municipio) {
        Map<String, Object> mapMunicipio = new LinkedHashMap<String, Object>();
        mapMunicipio.put("municipio", municipio.getMunicipio());
        mapMunicipio.put("uf", municipio.getUf());
        return mapMunicipio;
    }

    public Municipio converterToMunicipio(DBObject dbo) {
        Municipio municipio = new Municipio();
        municipio.setId(dbo.get("_id").toString());
        municipio.setMunicipio((String) dbo.get("municipio"));
        municipio.setUf((String) dbo.get("uf"));
        return municipio;
    }
}