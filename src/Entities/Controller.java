package Entities;

import java.io.InputStream;
import java.util.LinkedList;

import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.RDFVisitor;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.vocabulary.VCARD;

public class Controller {


	public Controller() {

	}

	public LinkedList sitiosCercanos(Integer latitud, Integer longitud) {
		return null;
	}

	public void readingRDF(){
		// create an empty model
		Model model = ModelFactory.createDefaultModel();

		// read the RDF/XML file
		model.read("resources/Museos-updated.ttl", "TTL");

		// write it to standard out
		model.write(System.out,"TTL");

		// List all the resources with the properties "geo:lat and geo:long"
		String queryString = 
				"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#> \n" +
				"PREFIX schema: <http://schema.org/> " +
				"SELECT ?Latitude ?Longitude ?postalCode "+
				"WHERE {" + 
				"?x geo:lat ?Latitude .\n"+
				"?x geo:long ?Longitude . \n"+
				"?x schema:postalCode ?postalCode.} ";
		Query query = QueryFactory.create(queryString);
		QueryExecution qexec = QueryExecutionFactory.create(query, model) ;
		ResultSet results = qexec.execSelect() ;

		while (results.hasNext())
		{
			QuerySolution binding = results.nextSolution();
			Literal latitud = binding.getLiteral("Latitude");
			Literal longitud = binding.getLiteral("Longitude");
			Literal postalCode = binding.getLiteral("postalCode");
			System.out.println("Latitud: "+latitud);
			System.out.println("Longitud: "+longitud);
			System.out.println("CodPostal: "+postalCode);
		}

		//IDEA: Extraer los campos e ir creando los objetos -> despues trabajar con objetos		
		//		StmtIterator iterador = model.listStatements();
		//		while(iterador.hasNext()){
		//			System.out.println(iterador.next());
		//		}
	}

	public static void main(String[] args){

		Controller nuevo = new Controller();
		nuevo.readingRDF();

	}

}