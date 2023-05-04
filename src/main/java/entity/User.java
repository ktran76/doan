package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "userId", nullable = false, length = 45)
    private String userId;

    @Size(max = 45)
    @NotNull
    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Size(max = 100)
    @NotNull
    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

    @Size(max = 45)
    @Column(name = "phoneNumber", length = 45)
    private String phoneNumber;

    @Size(max = 45)
    @NotNull
    @Column(name = "role", nullable = false, length = 45)
    private String role;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Size(max = 100)
    @Column(name = "fullname", length = 100)
    private String fullname;

    @Size(max = 100)
    @Column(name = "avatar", length = 100)
    private String avatar;

    @NotNull
    @Column(name = "active", nullable = false)
    private Boolean active = false;

}