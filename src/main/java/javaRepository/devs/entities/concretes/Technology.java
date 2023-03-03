package javaRepository.devs.entities.concretes;

import jakarta.persistence.*;

@Table(name = "technologies")
@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String Name;
    @ManyToOne(targetEntity = Language.class)
    @JoinColumn(name = "LanguageId")
    private Language language;

    public Technology() {
    }

    public Technology(int id, String name, Language language) {
        this.id = id;
        Name = name;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
