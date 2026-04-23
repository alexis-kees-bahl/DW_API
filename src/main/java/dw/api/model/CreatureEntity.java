package dw.api.model;

import dw.api.enums.creature.ECreatureCategory;
import dw.api.enums.creature.ECreaturePrompt;
import dw.api.enums.creature.ECreatureSubcategory;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="creature")
public class CreatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ECreaturePrompt prompt;
    private String size;
    private String groupSize;
    private int hitPoints;
    private int armor;
    private String damage;
    private String damageType;
    private String reach;
    private String tags;
    private String alignment;
    private String disposition;
    private String armorType;


    public ECreatureSubcategory getSubcategory(){
        return prompt.getSubcategory();
    }

    public ECreatureCategory getCategory(){
        return prompt.getSubcategory().getCategory();
    }

    /*

    */
}
