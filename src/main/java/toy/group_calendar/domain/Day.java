package toy.group_calendar.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "days")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Day {

    @Id
    @GeneratedValue
    @Column(name = "day_id")
    private Long id;

    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calendar_id")
    private Calendar calendar;

    private String name;

    @OneToMany(mappedBy = "day")
    private List<MemorialDay> memorialDayItems = new ArrayList<>();

    @OneToMany(mappedBy = "day")
    private List<Schedule> scheduleItems = new ArrayList<>();

    @OneToMany(mappedBy = "day")
    private List<Board> boardItems = new ArrayList<>();
}
