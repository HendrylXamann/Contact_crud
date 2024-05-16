package Project.ProjectApiSpring.controller;
import Project.ProjectApiSpring.model.Contact;
import Project.ProjectApiSpring.repositorie.ContactRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired //injeção de dependência
    private ContactRepositorie repositorie;
    @GetMapping
    public List<Contact> toList(){
        return repositorie.findAll();

    }
    @PostMapping
    public Contact add(@RequestBody Contact contact){
        return repositorie.save(contact);
    }
}
