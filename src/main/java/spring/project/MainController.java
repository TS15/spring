package spring.project;
import java.util.concurrent.atomic.AtomicLong;

import spring.project.domain.actor;
import spring.project.mapper.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final actorMapper actormapper;
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