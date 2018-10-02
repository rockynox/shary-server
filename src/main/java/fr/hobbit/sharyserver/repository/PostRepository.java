package fr.hobbit.sharyserver.repository;

import fr.hobbit.sharyserver.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PostRepository extends JpaRepository<Post, Long> {
}
