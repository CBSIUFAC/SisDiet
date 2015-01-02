package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alimentos implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAlimento;
	@Column(nullable=false)
	private String NomeAlimento;
	@Column
	private double QuantAlimento;
	@Column
	private double caloria;
	
	public Integer getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(Integer idAlimento) {
		this.idAlimento = idAlimento;
	}

	public String getNomeAlimento() {
		return NomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		NomeAlimento = nomeAlimento;
	}

	public double getCaloria() {
		return caloria;
	}

	public void setCaloria(double caloria) {
		this.caloria = caloria;
	}


	
}
