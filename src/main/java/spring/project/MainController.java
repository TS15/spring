package spring.project;
import java.util.concurrent.atomic.AtomicLong;

import spring.project.domain.actor;
import spring.project.mapper.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final actorMapper actormapper;
    
    @GetMapping("/")
    public String home(ModelMap modelMap) {
    	return "index";

    }
    @GetMapping("/contact.html")
    public String contact(ModelMap modelMap) {
    	return "contact";

    }
    @GetMapping("/contact_eng.html")
    public String contacteng(ModelMap modelMap) {
    	return "contact_eng";

    }
    @GetMapping("/index.html")
    public String index(ModelMap modelMap) {
    	return "index";

    }
    @GetMapping("/index_eng.html")
    public String indexeng(ModelMap modelMap) {
    	return "index_eng";

    }
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/actor")
    public actor actor(@RequestParam(value="id", defaultValue = "1") String id) {
    	return this.actormapper.findById(id);
    }
    public MainController(actorMapper actormapper) {
    	this.actormapper = actormapper;
    }

    
    
}	
