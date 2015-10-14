package net.mv.test;

import net.mv.domain.Person;
import net.mv.domain.Record;
import net.mv.domain.Stock;
import net.mv.service.RecordService;


public class Driver {

	public static void main(String[] args) {
		
		Person john = new Person("John", 2000, "buy");
		Person kevin = new Person("Kevin", 3000, "sell");
		
		Stock zinga = new Stock(1, "Zinga", 200);
		Stock googl = new Stock(2, "Googl", 400);
		
		RecordService rs = new RecordService();
		Record record = new Record();
		record = rs.getRecord(john, zinga);
		System.out.println(record);
		System.out.println("SAVE TO DB Successfully");
		
	}
}

