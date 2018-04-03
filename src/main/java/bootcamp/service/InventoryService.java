package bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.InventoryDao;
import bootcamp.model.Equipment;

@Component
public class InventoryService {

	@Autowired
	private InventoryDao iDao;
	
	public Equipment getEquipment() {
		return iDao.getEquipmentById();
		
	}
	
}
