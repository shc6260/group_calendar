package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
