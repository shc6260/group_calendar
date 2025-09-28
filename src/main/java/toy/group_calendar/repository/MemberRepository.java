package toy.group_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toy.group_calendar.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
