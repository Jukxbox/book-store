package mate.academy.bookstore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookRequestDto {
    @NotBlank(message = "Назва книги не може бути порожньою")
    private String title;
    @NotBlank(message = "Автор не може бути порожнім")
    private String author;
    @NotBlank(message = "isbn не може бути порожнім")
    private String isbn;
    @NotNull
    @DecimalMin("0.00")
    private BigDecimal price;
    @NotBlank(message = "опис не може бути порожнім")
    private String description;
    private String coverImage;
}
