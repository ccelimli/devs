package javaRepository.devs.dataAccess.abstracts;

import javaRepository.devs.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
