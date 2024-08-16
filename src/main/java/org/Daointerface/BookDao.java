package org.Daointerface;
import java.sql.SQLException;
import java.util.List;

import org.model.Books;
public interface BookDao {

    /** This is the method to be used to list down all the records from the books table.*/
    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;

    /** This method to be used to create a record in the books table. */
    void saveBook(List<Books> BookList);


    boolean deleteBook(int id);

    /** This is the method to be used to update a record into the books table. */
    boolean updateBook(Books book, int id);
}
