package dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserUpdateDTO {
    private String username;
    private String password;
    private String confirm;
    private String email;
    private String phoneNumber;
    private String fullname;

}
