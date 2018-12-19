package springbootraghu.springbootpractice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class Raghucoontroller {
	@RequestMapping(value="getvalue",method=RequestMethod.GET)
	public String hai() {
		return "hai raghu";
	
	}

}
