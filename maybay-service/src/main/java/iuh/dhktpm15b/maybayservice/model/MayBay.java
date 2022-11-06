package iuh.dhktpm15b.maybayservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "may_bay")
public class MayBay implements Serializable {
    private static final long serialVersionUID = 7156526077883281623L;
    @Id
    @Column(name = "maybay_id")
    private int maybayId;

    @Column(name = "ten_maybay")
    private String tenMaybay;

    @Column(name = "tam_bay")
    private int tamBay;

    @Column(name = "da_bay")
    private int daBay;


}
