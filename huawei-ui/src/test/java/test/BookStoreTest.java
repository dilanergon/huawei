package test;

import base.BaseTest;
import org.testng.annotations.Test;
import page.BookStorePage;

public class BookStoreTest extends BaseTest {

    /**
     * Happy path test
     * This test checks if added book is in the collection
     * Steps to reproduce:
     * 1. Open url "https://demoqa.com/profile"
     * 2. Go to "https://demoqa.com/books"
     * 3. Add book to collection
     * 4. Go to profile
     * 5. Assert that book is in the collection section
     *Expected results: book is added to collection
     * 6. Navigate to "https://demoqa.com/books"
     * 7. Add 1 book to collection
     * 8. Navigate to profile
     * 9. Delete added book
     * 10. Assert that book is not in the collection
     *
     * Expected results: book is deleted from the collection
     */

    @Test(priority = 1)
    public void addBookToCollection() throws Exception {
        succesLogin();
        new BookStorePage(driver)
                .addBookToCollection()
                .deleteBook();
    }
}



