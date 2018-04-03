package bootcamp.controler;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

	@Autowired
	JdbcTemplate jdbctemplate;

	@GetMapping ("/test")
	public String getStuff() {
		
		Object stuff = jdbctemplate.queryForRowSet("select * from equipment");
		
		return stuff.toString();
		
	}
	
}
