package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQueries({
        @NamedQuery(name = "Khoaluan.findAll", query = "SELECT khoaluan FROM Khoaluan khoaluan"),
        @NamedQuery(name = "Khoaluan.findById", query = "SELECT khoaluan FROM Khoaluan khoaluan WHERE khoaluan.id = :id"),
        @NamedQuery(name = "Khoaluan.findByKhoaLuanId", query = "SELECT khoaluan FROM Khoaluan khoaluan WHERE khoaluan.khoaLuanId = :khoaLuanId"),
})
@Table(name = "khoaluan")
public class Khoaluan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "khoaLuanId", nullable = false, length = 45)
    private String khoaLuanId;

    @Size(max = 45)
    @NotNull
    @Column(name = "tenKhoaLuan", nullable = false, length = 45)
    private String tenKhoaLuan;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Lob
    @Column(name = "file")
    private String file;

}