package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
        @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
        @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
        @NamedQuery(name = "User.findByCreatedDate", query = "SELECT u FROM User u WHERE u.createdDate = :createdDate"),
        @NamedQuery(name = "User.findByRole", query = "SELECT u FROM User u WHERE u.role = :role"),
})
@Table(name = "user")
public class User implements Serializable {
    public static final String ROLE_SV = "ROLE_SV";
    public static final String ROLE_GV = "ROLE_GV";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 45)
    @Column(name = "userId", nullable = false, length = 45)
    private String userId;

    @Size(max = 45)
    @NotBlank(message = "Ten dang nhap khong duoc trong!")
    @NotNull
    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Size(max = 100)
    @NotBlank(message = "Ban chua nhap mat khau!")
    @NotNull
    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Size(max = 100)
    @NotBlank(message = "Ban chua nhap lai mat khau!")
    @NotNull
    @Column(name = "confirm", nullable = false, length = 100)
    private String confirm;

    @Size(max = 45)
    @NotBlank(message = "Email khong hop le!")
    @Column(name = "email", length = 45)
    private String email;

    @Size(max = 45)
    @NotBlank(message = "So dien thoai khong hop le!")
    @Column(name = "phoneNumber", length = 45)
    private String phoneNumber;

    @Size(max = 45)
    @Column(name = "role", nullable = false, length = 45)
    private String role;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Size(max = 100)
    @NotBlank(message = "Ten cua ban khong the de trong!")
    @Column(name = "fullname", length = 100)
    private String fullname;

    @Size(max = 100)
    @NotBlank(message = "Avatar khong duoc de trong!")
    @Column(name = "avatar", length = 100)
    private String avatar;

    @NotNull
    @Column(name = "active", nullable = false)
    private Boolean active = false;

}