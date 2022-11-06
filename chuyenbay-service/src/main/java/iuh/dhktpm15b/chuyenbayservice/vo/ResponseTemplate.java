package iuh.dhktpm15b.chuyenbayservice.vo;

import iuh.dhktpm15b.chuyenbayservice.model.ChuyenBay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ResponseTemplate {
    private ChuyenBay chuyenBay;
    private MayBay mayBay;
}
