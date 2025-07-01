package managment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import managment.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {}