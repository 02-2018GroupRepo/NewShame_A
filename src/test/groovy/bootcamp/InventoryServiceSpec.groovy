package bootcamp

import bootcamp.dao.InventoryDao
import bootcamp.model.Equipment
import bootcamp.service.InventoryService
import spock.lang.Specification

class InventoryServiceSpec extends Specification{
	def "return all of the equipment in the data base"(){
	given: "an Inventory Service"
	InventoryService inventoryService = new InventoryService();
	List<Equipment> equipmentList = new ArrayList<Equipment>();
	equipmentList.add(new Equipment(100,1, 50.00, 'Atlanta', 'Chainsaw'))
	equipmentList.add(new Equipment(200,3, 60.00, 'Atlanta', 'Compactor'))
	equipmentList.add(new Equipment(300,4, 40.00, 'Atlanta', 'Insulator'))
	equipmentList.add(new Equipment(300,5, 40.00, 'Sandy Spring', 'Insulator'))
	and: "a dao"
	InventoryDao dao = Stub(InventoryDao.class);
	dao.getAllEquipment() >> equipmentList;
	inventoryService.iDao = dao;
	
	when: "getAllEquipments is called"
	List<Equipment> equipment= inventoryService.getAllEquipment();
	
	then: "return a list of equipment"
	equipment.get(0).getPrice()==50.00;
	}
	
}
