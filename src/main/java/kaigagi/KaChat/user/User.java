package kaigagi.KaChat.user;

import jakarta.persistence.*;
import kaigagi.KaChat.constances.Role;
import kaigagi.KaChat.constances.Status;
import lombok.*;

@Setter
@Getter
@Builder
@Entity(name = "User")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private long id;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "email",
            nullable = false,
            unique = true,
            columnDefinition = "TEXT"
    )
    private String email;

    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String password;

    @Column(
            name = "role",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private Role role;

    @Column(
            name = "status",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private Status status;
}
