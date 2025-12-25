package dw.api.model;

import dw.api.enums.EAreaAttributeCategory;
import dw.api.enums.EAreaAttributePrompt;
import dw.api.enums.EAreaAttributeSubcategory;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="area_attribute")
@Data
public class AreaAttributeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="area_attribute_id")
    private Long id;
    private EAreaAttributePrompt prompt;

    @Column(name="metadata", columnDefinition = "JSON")
    private String metadata;


    private Long promptReferenceId;

    public EAreaAttributeCategory getCategory(){
        return prompt.getSubcategory().getCategory();
    }

    public EAreaAttributeSubcategory getSubcategory(){
        return prompt.getSubcategory();
    }
}
