package br.org.generation.avozes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank
@Size(min = 5, max = 255)
private String tipoConselho;

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


}
