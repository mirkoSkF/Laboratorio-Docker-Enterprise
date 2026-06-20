package corso.docker.demoRestful.model;

import jakarta.persistence.*;

@Entity
@Table
public class Utente {

	@Id //pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=30, nullable=false)
	private String nome;
	@Column(length=30, nullable=false)
	private String cognome;
	@Column(length=30, nullable=false, unique=true)
	private String cf;

	public Long getId() {
		return id;
	}

	public void setCf(Long id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
}
