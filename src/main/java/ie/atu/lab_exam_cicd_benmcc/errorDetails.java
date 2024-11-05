package ie.atu.lab_exam_cicd_benmcc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class errorDetails
{
    private String status;
    private String message;
}
