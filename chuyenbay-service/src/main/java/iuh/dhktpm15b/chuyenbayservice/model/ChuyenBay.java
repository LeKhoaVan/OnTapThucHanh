package iuh.dhktpm15b.chuyenbayservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "chuyen_bay")
public class ChuyenBay {
    @Id
    @Column(name = "chuyenbay_id")
    private int chuyenbayId;

    @Column(name = "ga_di")
    private String gaDi;

    @Column(name = "ga_den")
    private String gaden;

    @Column(name = "maybay_id")
    private int maybayId;

    @Override
    public String toString() {
        return "ChuyenBay{" +
                "chuyenbayId=" + chuyenbayId +
                ", gaDi='" + gaDi + '\'' +
                ", gaden='" + gaden + '\'' +
                ", maybayId=" + maybayId +
                '}';
    }
}
