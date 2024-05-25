package Project.ProjectApiSpring.controller;
import Project.ProjectApiSpring.model.ContactEntity;
import Project.ProjectApiSpring.repositorie.ContactRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired //injeção de dependência
    private ContactRepositorie repositorie;
    @GetMapping
    public List<ContactEntity> toList(){
        return repositorie.findAll();
    }
    @PostMapping
    public ContactEntity addContact(@RequestBody ContactEntity contact){
        System.out.println("Recebido contato: " + contact);
        return repositorie.save(contact);
    }

    @PutMapping("/{id}")
    public ContactEntity updateContact(@RequestBody ContactEntity contact){
        if(contact.getId()>0)
            return repositorie.save(contact);
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        Optional<ContactEntity> contactOptional = repositorie.findById(id);

        if (contactOptional.isPresent()) {
            repositorie.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
