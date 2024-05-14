package Project.ProjectApiSpring.repositorie;

import Project.ProjectApiSpring.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepositorie extends JpaRepository<Contact, Long> {

}
