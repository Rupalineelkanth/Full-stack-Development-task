package managment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import managment.entity.ContactForm;

public interface ContactRepository extends JpaRepository<ContactForm, Integer> {}
