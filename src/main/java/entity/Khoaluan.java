package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
@Table(name = "khoaluan")
public class Khoaluan implements Serializable {
    @Id
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