package main;
import org.bson.*;
import index.Indexer;
import index.Words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Main {

	public static void main(String [] args){

			Indexer ind = new Indexer("/home/febroshka/Documents/RechercheInfo/CORPUS");
			//ind.buildIndex();
			MongoClient mongoClient;
			try {
				mongoClient = new MongoClient("localhost",27017);
			
			DB db = mongoClient.getDB("inverseIndexDB");
			DBCollection table = db.getCollection("mot");	
			
			Set<String> tables = db.getCollectionNames();
			
			for( String col : tables){
				System.out.println(col);
			}
			
			
			
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			


		
	}
}
