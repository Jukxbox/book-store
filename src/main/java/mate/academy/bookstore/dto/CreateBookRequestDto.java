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
    @NotBlank(message = "The book's title cannot be empty")
    private String title;
    @NotBlank(message = "An author cannot be empty")
    private String author;
    @NotBlank(message = "The isbn cannot be empty")
    private String isbn;
    @NotNull
    @DecimalMin("0.00")
    private BigDecimal price;
    @NotBlank(message = "The description cannot be empty")
    private String description;
    private String coverImage;
}
