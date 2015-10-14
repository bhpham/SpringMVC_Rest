package net.mv.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Record implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqRecordIDKey")
	@SequenceGenerator(name = "seqRecordIDKey", sequenceName = "SEQ_RECORDID_KEY", allocationSize = 1)
	private int id;
	
	private Person person;
	
	private Stock stock;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}


	public Stock getStock() {
		return stock;
	}


	public void setStock(Stock stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Record [id=" + id + ", person=" + person + ", stock=" + stock
				+ "]";
	}
	
	
	
}
