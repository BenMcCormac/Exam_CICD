package ie.atu.lab_exam_cicd_benmcc;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ExceptionHandler
{
    @org.springframework.web.bind.annotation.ExceptionHandler
    public List<errorDetails> handleValidationExceptions(MethodArgumentNotValidException ex)
    {
        List<errorDetails> errors = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEachError
        {
            String status = errors.getField();
            String message = errors.getDefaultMessage();
            errorDetails ErrorDetails = new ErrorDetails(fieldName,errorMessage);
            errors.add(ErrorDetails);
        }
        return errors;
    }
}
