package net.mv.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqstockIDKey")
	@SequenceGenerator(name = "seqstockIDKey", sequenceName = "SEQ_STOCKID_KEY", allocationSize = 1)
	private int sId;
	
	@Column
	private String stockInfo;
	
	@Column
	private int price;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Person person;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Record record;
	
	public Stock(){}
	
	public Stock(String stockInfo, int price) {
		super();
		//this.sId = sId;
		this.stockInfo = stockInfo;
		this.price = price;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getStockInfo() {
		return stockInfo;
	}
	public void setStockInfo(String stockInfo) {
		this.stockInfo = stockInfo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Stock [sId=" + sId + ", stockInfo=" + stockInfo + ", price="
				+ price + "]";
	}
	
}
