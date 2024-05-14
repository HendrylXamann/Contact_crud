package Project.ProjectApiSpring.controller;
import Project.ProjectApiSpring.model.Contact;
import Project.ProjectApiSpring.repositorie.ContactRepositorie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {


    private ContactRepositorie repositorie;
    @GetMapping
    public List<Contact> toList(){
        return repositorie.findAll();

    }
}
