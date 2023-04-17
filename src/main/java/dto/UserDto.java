package dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link entity.User} entity
 */
@Getter
@Setter
@NoArgsConstructor
@Data
public class UserDto implements Serializable {
    private Integer id;
    @Size(max = 45)
    @NotNull
    private String username;
}