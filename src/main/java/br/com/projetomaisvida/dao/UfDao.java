package br.com.projetomaisvida.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.projetomaisvida.converter.UfConverter;
import br.com.projetomaisvida.entity.Uf;

public class UfDao extends EntityDao<Uf>{

	public UfDao() {
		super(Uf.class);
	}

	public void save(Uf Uf) {
        Map<String, Object> mapUf = new UfConverter().converterToMap(Uf);
        save(mapUf);
    }

    public List<Uf> findUf() {
        List<DBObject> dbObject = findAll();
        if(dbObject.isEmpty()){
			popularTabela();
			dbObject = findAll();
		}
        List<Uf> Ufs = new ArrayList<Uf>();

        for (DBObject dbo : dbObject) {
        	Uf uf = new UfConverter().converterToUf(dbo);
        	Ufs.add(uf);
        }

        return Ufs;
    }
    
    public void popularTabela(){
    	save(new Uf("AC"));
    	save(new Uf("AL"));
    	save(new Uf("AM"));
    	save(new Uf("AP"));
    	save(new Uf("BA"));
    	save(new Uf("CE"));
    	save(new Uf("DF"));
    	save(new Uf("ES"));
    	save(new Uf("GO"));
    	save(new Uf("MA"));
    	save(new Uf("MG"));
    	save(new Uf("MS"));
    	save(new Uf("MT"));
    	save(new Uf("PA"));
    	save(new Uf("PB"));
    	save(new Uf("PE"));
    	save(new Uf("PI"));
    	save(new Uf("PR"));
    	save(new Uf("RJ"));
    	save(new Uf("RN"));
    	save(new Uf("RO"));
    	save(new Uf("RR"));
    	save(new Uf("RS"));
    	save(new Uf("SC"));
    	save(new Uf("SE"));
    	save(new Uf("SP"));
    	save(new Uf("TO"));
    }
}