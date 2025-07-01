package managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import managment.entity.Client;
import managment.repo.ClientRepository;
import managment.requestModel.ClientRequest;

@Service
public class ClientService {
    @Autowired private ClientRepository repo;

    public List<Client> getAll() { return repo.findAll(); }
    public Client save(ClientRequest request) {
        Client c = new Client();
        c.setName(request.getName());
        c.setDesignation(request.getDesignation());
        c.setDescription(request.getDescription());
        c.setImageUrl(request.getImageUrl());
        return repo.save(c);
    }
}
