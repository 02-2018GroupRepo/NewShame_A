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
 
 private final String SQL = "SELECT * FROM equipment";
 public Equipment getEquipmentById() {
 List<Equipment> p = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Equipment.class));
 return p.get(0);
 }
}
