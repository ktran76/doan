package dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhoaLuanResponseDTO {
    private String khoaLuanId;
    private String tenKhoaLuan;
    private String userId;
    private String fullname;

}
