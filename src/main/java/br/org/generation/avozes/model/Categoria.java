package br.org.generation.avozes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank
@Size(min = 5, max = 255)
private String tipoConselho;

@ManyToOne 
@JsonIgnoreProperties("categoria") 
private Categoria categoria;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getTipoConselho() {
    return tipoConselho;
}

public void setTipoConselho(String tipoConselho) {
    this.tipoConselho = tipoConselho;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}


}
