package net.mv.restproject.service;

import java.util.Set;

import org.springframework.stereotype.Component;

import net.mv.restproject.dao.RecordDao;
import net.mv.restproject.pojos.Person;
import net.mv.restproject.pojos.Record;
import net.mv.restproject.pojos.Stock;



//@Path("record")
@Component
public class RecordService {

//	@Path("create")
//	@Produces(MediaType.APPLICATION_XML)
//	@GET
	public Record getRecord(Person person, Stock stock) {
		
		Record record = new Record();
		record.setPerson(person);
		record.setStock(stock);
		
		return record;
		
	}
	
//	@Path("save")
//	@Produces(MediaType.APPLICATION_XML)
//	@POST
	public void saveRecord(Record record) {
		RecordDao stockDao = new RecordDao();
		stockDao.addRecord(record);
	}


}
