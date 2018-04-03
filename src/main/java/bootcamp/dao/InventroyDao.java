package bootcamp.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import bootcamp.model.Equipment;

@Component
public class InventroyDao {
 @Autowired
 private JdbcTemplate jdbcTemplate;
 
 private final String SQL = "SELECT personid, lastname, firstname, address, city FROM public.branden where personid = 1";
 public Equipment getEquipmentById() {
 List<Equipment> p = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Equipment.class));
 return p.get(0);
 }
}
