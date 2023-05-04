package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "hoidonggiangvien")
public class Hoidonggiangvien implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hoiDongGiangVien", nullable = false, referencedColumnName = "hoiDongId")
    private Hoidong hoiDongGiangVien;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "giangVien", nullable = false, referencedColumnName = "userId")
    private User giangVien;

}