package com.example.android.kt.model;

import java.io.Serializable;
import lombok.Data;

/**
 * tbl_book.sql
 * @author 
 */
@Data
public class TblBook implements Serializable {
    private String bookId;

    private String bookAuthor;

    private String bookBrief;

    private String bookIsbn;

    private String bookName;

    private Long bookPrice;

    private String bookPublishDate;

    private String bookPublisher;

    private String bookTypeId;

    private Integer bookCount;

    private static final long serialVersionUID = 1L;
}