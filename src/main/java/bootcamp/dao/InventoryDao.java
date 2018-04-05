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
	private final String SqlDelete = "Delete From equipment where equipmentId = ";

	public int setEquipment(Equipment equipment) {
		return jdbcTemplate.update(SqlInsert, 
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


	public int updateEquipment(String updateLocation, int equipId) {
		return jdbcTemplate.update(SqlUpdate, updateLocation, equipId);
		
	}


	public int deleteEquipment(int id) {
		return jdbcTemplate.update(SqlDelete + id);
		
	}
}
