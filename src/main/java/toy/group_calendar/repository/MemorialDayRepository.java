package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.MemorialDay;

public interface MemorialDayRepository extends JpaRepository<MemorialDay, Long> {
}
