package br.com.projetomaisvida.configuration;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

//Esta classe utiliza o padrão de projeto singleton para impedir a abertura várias conexões
public class ConexaoMongoSingleton {
	private DB db;
	private static ConexaoMongoSingleton uniqInstance;
	
	//Protege a classe de ser instanciada
	private ConexaoMongoSingleton(){
		
	}
	
	//garante sempre uma unica instancia
    public static synchronized ConexaoMongoSingleton getInstance() {
        if (uniqInstance == null) {
            uniqInstance = new ConexaoMongoSingleton();
        }
        return uniqInstance;
    }
	
	public DB getDB() {
        if (db == null){
        	try {
    			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    			db = mongoClient.getDB("ProjetoMaisVida");
    		} catch (UnknownHostException e) {
    			e.printStackTrace();
    		}
        }
        return db;
    }
}
