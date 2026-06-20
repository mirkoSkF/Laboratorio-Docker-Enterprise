package corso.docker.demoRestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corso.docker.demoRestful.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
