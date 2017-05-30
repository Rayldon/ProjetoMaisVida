package br.com.projetomaisvida.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.DBObject;

import br.com.projetomaisvida.converter.MedicoConverter;
import br.com.projetomaisvida.entity.Medico;

public class MedicoDao extends EntityDao<Medico>{

	public MedicoDao() {
		super(Medico.class);
	}

	public void save(Medico Medico) {
        Map<String, Object> mapMedico = new MedicoConverter().converterToMap(Medico);
        save(mapMedico);
    }

    public void update(Medico oldMedico, Medico newMedico) {
        Map<String, Object> query = new MedicoConverter().converterToMap(oldMedico);
        Map<String, Object> map = new MedicoConverter().converterToMap(newMedico);

        update(query, map);
    }

    public void delete(Medico Medico) {
        Map<String, Object> map = new MedicoConverter().converterToMap(Medico);
        delete(map);
    }

    public Medico findMedico(Map<String, Object> mapKeyValue) {
        DBObject dbObject = findOne(mapKeyValue);
        Medico Medico = new MedicoConverter().converterToMedico(dbObject);

        return Medico;
    }

    public List<Medico> findMedicos() {
        List<DBObject> dbObject = findAll();
        List<Medico> Medicos = new ArrayList<Medico>();

        for (DBObject dbo : dbObject) {
            Medico Medico = new MedicoConverter().converterToMedico(dbo);
            Medicos.add(Medico);
        }

        return Medicos;
    }

    public List<Medico> findMedicos(Map<String, Object> mapKeyValue) {
        List<DBObject> dbObject = findKeyValue(mapKeyValue);
        List<Medico> Medicos = new ArrayList<Medico>();

        for (DBObject dbo : dbObject) {
            Medico Medico = new MedicoConverter().converterToMedico(dbo);
            Medicos.add(Medico);
        }

        return Medicos;
    }
}