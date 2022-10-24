package recipes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import recipes.domain.Comment;

public interface CommentRepository extends MongoRepository<Comment, String>{
}
