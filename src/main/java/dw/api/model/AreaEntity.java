package dw.api.model;

import dw.api.enums.EAreaDressing;
import dw.api.enums.EAreaRarity;
import dw.api.enums.EAreaType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "area")
@Data
public class AreaEntity {

    @Id
    @Column(name = "area_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="rarity")
    @Enumerated(EnumType.STRING)
    private EAreaRarity rarity;

    @Column(name="area_type")
    @Enumerated(EnumType.STRING)
    private EAreaType type;

    @Column(name="area_dressing")
    @Enumerated(EnumType.STRING)
    private EAreaDressing dressing;


    private List<AreaAttributeEntity> attributes;

}
