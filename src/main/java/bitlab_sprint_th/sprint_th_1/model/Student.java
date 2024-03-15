package bitlab_sprint_th.sprint_th_1.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer exam;
    private String mark;
}
