package dw.api.dto;

import dw.api.enums.EElement;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
public class TrapMetadataDto {

    private EElement element;

}
