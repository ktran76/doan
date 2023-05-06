package dto;


import entity.Khoaluan;
import entity.User;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HoiDongResponseDTO {
    private String hoiDongId;
    private User giangVien;
    private Khoaluan khoaLuan;
}
