package bootcamp.controler;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.model.Equipment;
import bootcamp.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@RequestMapping ("/equipment")
	public Equipment getEquipment() {
		Equipment equipment = inventoryService.getEquipment();
		return equipment;
	}
}
