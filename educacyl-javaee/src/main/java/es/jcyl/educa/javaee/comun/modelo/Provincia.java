package es.jcyl.educa.javaee.comun.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CURS_PROVINCIAS")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Provincia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "C_PROV_ID")
	private Integer id;

	@Column(name = "D_PROV")
	private String nombre;

	@Column(name = "D_ABREV")
	private String abreviatura;

	public Provincia() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

}
