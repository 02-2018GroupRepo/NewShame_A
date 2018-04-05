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
	
	public int setEquipment(Equipment equipment){
		return iDao.setEquipment(equipment);
	}

	public int updateEquipment(String updateLocation, int equipId) {
		return iDao.updateEquipment(updateLocation, equipId);
		
	}

	public int deleteEquipment(int id) {
		return iDao.deleteEquipment(id);
	}
	

}
