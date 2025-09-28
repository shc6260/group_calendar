package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
