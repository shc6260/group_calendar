package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.Day;

public interface DayRepository extends JpaRepository<Day, Long> {
}
