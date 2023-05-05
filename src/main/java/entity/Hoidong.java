package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = "Hoidong.findAll", query = "SELECT hd FROM Hoidong hd"),
        @NamedQuery(name = "Hoidong.findById", query = "SELECT hd FROM Hoidong hd WHERE hd.id = :id"),
})
@Table(name = "hoidong")
public class Hoidong implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @NotBlank(message = "Ma hoi dong khong the trong!")
    @Column(name = "hoiDongId", nullable = false, length = 45)
    private String hoiDongId;

}