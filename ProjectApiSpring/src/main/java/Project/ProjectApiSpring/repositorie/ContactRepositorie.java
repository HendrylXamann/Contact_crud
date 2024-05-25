package Project.ProjectApiSpring.repositorie;

import Project.ProjectApiSpring.model.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepositorie extends JpaRepository<ContactEntity, Long> {

}
