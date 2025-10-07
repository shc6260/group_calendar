package toy.groupCalendar.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class MemberCreateDto {

    private String LoginId;
    private String password;
    private String name;
}
