package ie.atu.lab_exam_cicd_benmcc;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @NotBlank(message ="Code can't be blank")
    private String pCode;

    @NotBlank(message ="Name can't be blank")
    private String pName;

    @NotBlank(message ="Category can't be blank")
    private String category;

    @NotNull(message ="Amount cant be null")
    @PositiveOrZero(message ="Price cant be less than 0")
    private int amount;

    @NotNull(message ="Price cant be null")
    @PositiveOrZero(message ="Price cant be less than 0")
    private int price;

    @NotBlank(message ="Timestamp can't be blank")
    private String time;
}
