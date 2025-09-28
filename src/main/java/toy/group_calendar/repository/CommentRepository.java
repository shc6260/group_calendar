package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
