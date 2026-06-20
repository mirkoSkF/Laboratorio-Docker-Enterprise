package corso.docker.demoRestful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import corso.docker.demoRestful.model.Utente;
import corso.docker.demoRestful.repository.UtenteRepository;

@RestController
@RequestMapping("/api/utenti")
@CrossOrigin("*")
public class GestoreRichieste {
	
	@Autowired
	UtenteRepository ur;
	
	@PostMapping("/registrazione")
	public String registrazione(@RequestBody Utente utente) {
		ur.save(utente);
		return "Dati ricevuti in post!";
	}
	
	@GetMapping("/leggi")
	public List<Utente> leggi() {
		return ur.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String rimozione(@PathVariable Long id) {
		ur.deleteById(id);
		return "Rimozione avvenuta con successo!";
	}
	
	@PostMapping
	public String ricezione(@RequestBody Utente utente) {
		String nome = utente.getNome();
		String cognome = utente.getCognome();
		System.out.println(nome+" "+cognome);
		return "Dati ricevuti in post!";
	}
	
	@GetMapping
	public String ricezione2(@RequestParam String nome, String cognome) {
		System.out.println(nome+" "+cognome);
		return "Dati ricevuti in post!";
	}
	
	@GetMapping("/saluto")
	public String saluto() {
		return "Ciao! Controller raggiunto!";
	}
	
	@PutMapping
	public String modifica() {
		return "Dati ricevuti in Put";
	}
	
	@DeleteMapping
	public String rimozione() {
		return "Dati ricevuti in Delete!";
	}
	

}
