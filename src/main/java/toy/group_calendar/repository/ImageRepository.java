package toy.group_calendar.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import toy.group_calendar.domain.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
