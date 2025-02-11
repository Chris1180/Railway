package eu.home.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.home.demo.domain.Users;
import eu.home.demo.domain.UsersDAO;

@Controller
public class AngularRedirectController {
	
	
	@Autowired
	private UsersDAO usersRepository;
	
    @RequestMapping(value = {"/{path:[^\\.]*}"})
    public String redirect() {
        return "forward:/index.html";
    }
    
    @GetMapping ("/api/users")
    public List<Users> GetUsers() {
    	return usersRepository.findAll();
    }
}
