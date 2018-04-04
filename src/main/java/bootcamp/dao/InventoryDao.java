package bootcamp.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import bootcamp.model.Equipment;

@Component
public class InventoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String SqlInsert = "insert into equipment values(?,?,?,?,?)";
	private final String SqlSelect = "select * from equipment;";
	private final String SqlUpdate = "Update equipment set location =? where equipmentid = ?";

	public void setEquipment(Equipment equipment) {
		jdbcTemplate.update(SqlInsert, 
							equipment.getSkuNumber(),
							equipment.getEquipmentId(), 
							equipment.getPrice(), 
							equipment.getLocation(),
							equipment.getEquipmentType());
    }

	
	public List<Equipment> getAllEquipment() {
		List<Equipment> p = jdbcTemplate.query(SqlSelect, new BeanPropertyRowMapper<>(Equipment.class));
		return p;
	}


	public void updateEquipment(String updateLocation, int equipId) {
		jdbcTemplate.update(SqlUpdate, updateLocation, equipId);
		
	}
}
