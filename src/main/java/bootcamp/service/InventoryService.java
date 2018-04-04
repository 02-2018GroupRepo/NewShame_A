package bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.InventoryDao;
import bootcamp.model.Equipment;

@Component
public class InventoryService {

	@Autowired
	private InventoryDao iDao;
	
	public List<Equipment> getAllEquipment() {
		return iDao.getAllEquipment();
		
	}
	
	public void setEquipment(Equipment equipment){
		iDao.setEquipment(equipment);
	}

	public void updateEquipment(String updateLocation, int equipId) {
		iDao.updateEquipment(updateLocation, equipId);
		
	}
	

}
