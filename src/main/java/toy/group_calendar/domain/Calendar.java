package toy.group_calendar.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Calendar {

    @Id
    @GeneratedValue
    @Column(name = "calendar_id")
    private Long id;

    @OneToMany(mappedBy = "calendar", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Day> dayItems = new ArrayList<>();

    private String name;
}
