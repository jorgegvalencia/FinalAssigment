package Entities;

import java.io.InputStream;
import java.util.LinkedList;

import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.graph.Node;
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
		model.read("resources/Monumentos-updated.ttl", "TTL");

		// write it to standard out
		model.write(System.out,"TTL");
		
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