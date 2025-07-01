package managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import managment.entity.NewsletterSubscriber;
import managment.repo.NewsletterRepository;
import managment.requestModel.NewsletterRequest;

import org.springframework.stereotype.Service;

@Service
public class NewsletterService {
    @Autowired
    private NewsletterRepository repo;

    public List<NewsletterSubscriber> getAll() { return repo.findAll(); }
    public NewsletterRepository save(NewsletterRequest request) {
        NewsletterRequest n = new NewsletterRequest();
        n.setEmail(request.getEmail());
        return repo.save(n);
    }
}