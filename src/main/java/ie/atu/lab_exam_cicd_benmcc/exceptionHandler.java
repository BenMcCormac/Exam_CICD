package ie.atu.lab_exam_cicd_benmcc;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class exceptionHandler
{

    @ExceptionHandler
    public List<errorDetails> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<errorDetails> errors = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            String status = error.getField();
            String message = error.getDefaultMessage();
            errorDetails ErrorDetails = new errorDetails(status,message);
            errors.add(ErrorDetails);
        });
        return errors;
    }
}
