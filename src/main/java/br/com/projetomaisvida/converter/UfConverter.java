package br.com.projetomaisvida.converter;

import java.util.LinkedHashMap;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.projetomaisvida.entity.Uf;

public class UfConverter{

	public Map<String, Object> converterToMap(Uf uf) {
        Map<String, Object> mapUf = new LinkedHashMap<String, Object>();
        mapUf.put("uf", uf.getUf());
        return mapUf;
    }

    public Uf converterToUf(DBObject dbo) {
        Uf uf = new Uf();
        uf.setId(dbo.get("_id").toString());
        uf.setUf((String) dbo.get("uf"));

        return uf;
    }
}