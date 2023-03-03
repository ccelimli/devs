package javaRepository.devs.entities.concretes;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name="languages")
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    List<Technology> technologies= new ArrayList<Technology>();

    public Language() {
    }

    public Language(int id, String name, List<Technology> technologies) {
        this.id = id;
        this.name = name;
        this.technologies = technologies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }
}
