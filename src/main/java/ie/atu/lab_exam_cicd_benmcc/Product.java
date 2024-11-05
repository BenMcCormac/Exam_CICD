package ie.atu.lab_exam_cicd_benmcc;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.DefaultMessageCodesResolver;

import java.text.Format;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @NotBlank(message ="Code can't be blank, Must be in format PROD-XXXX")
    private String pCode;

    @NotBlank(message ="Name can't be blank")
    @Max(value = 100, message = "Must have less than 100 characters")
    private String pName;

    @NotBlank(message ="Category can't be blank, must be Electronics, Apparel or Furniture")
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
