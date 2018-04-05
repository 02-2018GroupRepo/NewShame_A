package bootcamp.controler;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.model.Equipment;
import bootcamp.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@RequestMapping ("/showallequipment")
	public List<Equipment> getEquipment() {
		List<Equipment> equipments = inventoryService.getAllEquipment();
		return equipments;
	}
	
	@RequestMapping(name="/insertequipment", method = RequestMethod.POST)
	public int setEquipment(@RequestBody Equipment equipment){
		
		return inventoryService.setEquipment(equipment);
	}
	
	@RequestMapping ("/updateequipment")
	public int updateEquipment(@RequestParam (value= "location")String updateLocation, @RequestParam (value= "id") int equipId) {
	return inventoryService.updateEquipment(updateLocation, equipId);
	}
	
	@RequestMapping("/deleteequipment")
	public int deleteEquipment(@RequestParam int id) {
		return inventoryService.deleteEquipment(id);
	}
	
}
