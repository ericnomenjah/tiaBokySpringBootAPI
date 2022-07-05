package net.javaguides.springboot;

import net.javaguides.springboot.controller.LecteurController;
import net.javaguides.springboot.model.Lecteur;
import net.javaguides.springboot.model.Livre;
import net.javaguides.springboot.repository.LecteurRepository;
import net.javaguides.springboot.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private LecteurRepository lecteurRepository;

	@Autowired
	LivreRepository livreRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Livre livre = new Livre();

		livre.setTitre("Plus Malin Que le Diable");
		livre.setAutheur("Napoleon Hill");
		livre.setEdition("1938");
		livre.setDisponible(true);

		livreRepository.save(livre);

		Lecteur lecteur = new Lecteur();

		lecteur.setNom("hery");
		lecteur.setPrenom("Nomenjanahary");
		lecteur.setAdresse("Antananarivo");
		lecteur.setTel("0342046058");
		lecteur.setNaissance("11/07/1999");
		lecteurRepository.save(lecteur);
*/
	}
}
