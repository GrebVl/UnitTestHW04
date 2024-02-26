package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;

    @BeforeEach
    void setUp() {
        this.bookRepository = mock(BookRepository.class);
        this.bookService = new BookService(bookRepository);
    }

    /**
     * У вас есть класс BookService, который использует интерфейс BookRepository
     * для получения информации о книгах из базы данных.
     * Ваша задача написать unit-тесты для BookService,
     * используя Mockito для создания мок-объекта BookRepository.
     */

    @Test
    void testFindBookById(){
        Book book = new Book("12");
        when(bookRepository.findById("12")).thenReturn(book);

        Book result = bookService.findBookById("12");

        assertEquals(book, result);
    }

    @Test
    void testFindAllBooks(){
        Book book = new Book("12", "title", "author");
        bookService.addBook(book);

    }

}