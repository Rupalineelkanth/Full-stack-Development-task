package managment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import managment.entity.NewsletterSubscriber;

public interface NewsletterRepository extends JpaRepository<NewsletterSubscriber, Integer> {}