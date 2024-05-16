package Project.ProjectApiSpring.model;

import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementador (tupo identity) para o id
    private Long id;
    private String name;

    private String telephone;
    private String email;

    private String urlAvatar;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }
}
