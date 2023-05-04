package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "hoidongkhoaluan")
public class Hoidongkhoaluan implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hoiDongKhoaLuan", nullable = false, referencedColumnName = "hoiDongId")
    private Hoidong hoiDongKhoaLuan;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "khoaLuan", nullable = false, referencedColumnName = "khoaLuanId")
    private Khoaluan khoaLuan;

}