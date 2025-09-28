package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
