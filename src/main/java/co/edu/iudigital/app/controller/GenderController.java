package co.edu.iudigital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.iudigital.app.service.iface.GenderService;
import co.edu.iudigital.app.model.entity.Gender;



@Controller 
@RestController
@RequestMapping("/gender")
@CrossOrigin("*")
public class GenderController {
	
	// inyeccion de dependencias desde el service
	@Autowired
	private GenderService genderService;
	
	@GetMapping
	public List<Gender> getAll(){
		return genderService.getAll();
	}

}
