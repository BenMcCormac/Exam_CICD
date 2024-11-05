package ie.atu.lab_exam_cicd_benmcc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    private String pCode;
    private String pName;
    private String category;
    private String amount;
    private int price;

    private String time;
}
