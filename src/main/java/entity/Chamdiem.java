package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chamdiem")
public class Chamdiem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hoiDongId", nullable = false, referencedColumnName = "hoiDongId")
    private Hoidong hoiDong;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tieuChiId", nullable = false, referencedColumnName = "tieuChiId")
    private Tieuchi tieuChi;

    @Size(max = 45)
    @Column(name = "diem", length = 45)
    private String diem;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "diemKhoaLuan", nullable = false, referencedColumnName = "khoaLuanId")
    private Khoaluan diemKhoaLuan;

}