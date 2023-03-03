package javaRepository.devs.dataAccess.abstracts;

import javaRepository.devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LanguageRepository extends JpaRepository<Language,Integer> {
}
