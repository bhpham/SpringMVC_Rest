package net.mv.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
	
	@OneToOne
	private Person person;
	
	@OneToMany(mappedBy="record", targetEntity=Stock.class)
	private Set<Stock> stocks;

	public Record() {}
	
	
	public Record(Person person, Set<Stock> stocks) {
		super();
		this.person = person;
		this.stocks = stocks;
	}


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
	public Set<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", person=" + person + ", stocks=" + stocks
				+ "]";
	}

	
}
