

package org.model;
public class Books {
    private int id;
    private int isbn;
    private String bookName;
    // ----Constructor---
    public Books() {

}

public void setId(int id) {
    this.id = id;
}

public int getIsbn() {
    return isbn;
}

public void setIsbn(int isbn) {
    this.isbn = isbn;
}

public String getBookName() {
    return bookName;
}

public void setBookName(String bookName) {
    this.bookName = bookName;
}
}
