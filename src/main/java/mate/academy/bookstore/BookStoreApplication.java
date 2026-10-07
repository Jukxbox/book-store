package mate.academy.bookstore;

import mate.academy.bookstore.model.Book;
import mate.academy.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BookStoreApplication {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book twilight = new  Book();
            twilight.setTitle("Twilight");
            twilight.setDescription("Book about vampires");
            twilight.setIsbn("978-0-316-16017-9");
            twilight.setCoverImage("Edward and Bella");
            twilight.setPrice(BigDecimal.valueOf(500));

            bookService.save(twilight);

            System.out.println(bookService.getAll());
        };
    }
}
