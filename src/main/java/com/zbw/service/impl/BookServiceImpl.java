package com.zbw.service.impl;

import com.zbw.domain.Book;
import com.zbw.domain.BorrowingBooks;
import com.zbw.domain.BorrowingBooksExample;
import com.zbw.domain.Vo.BookVo;
import com.zbw.mapper.BookMapper;
import com.zbw.mapper.BorrowingBooksMapper;
import com.zbw.service.IBookService;
import com.zbw.utils.page.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Resource
    private BookMapper bookMapper;
    @Resource
    private BorrowingBooksMapper borrowingBooksMapper;

    @Override
    public List<BookVo> selectBooksByBookPartInfo(String partInfo) {

        List<BookVo> bookVos = new LinkedList<>();

        List<Book> books = bookMapper.selectBooksByPartInfo("%" + partInfo + "%");

        // 如果没有查到数据,则返回bookVos
        if (null == books) {
            return bookVos;
        }

        for (Book b : books) {
            BookVo bookVo = new BookVo();
            bookVo.setBookId(b.getBookId());
            bookVo.setBookName(b.getBookName());
            bookVo.setBookAuthor(b.getBookAuthor());
            bookVo.setBookPublish(b.getBookPublish());
            BorrowingBooksExample borrowingBooksExample = new BorrowingBooksExample();
            BorrowingBooksExample.Criteria criteria1 = borrowingBooksExample.createCriteria();
            criteria1.andBookIdEqualTo(b.getBookId());
            List<BorrowingBooks> borrowingBooks = borrowingBooksMapper.selectByExample(borrowingBooksExample);

            if (borrowingBooks == null || borrowingBooks.size() < 1) {
                bookVo.setIsExist("可借");
            } else {
                bookVo.setIsExist("不可借");
            }
            bookVos.add(bookVo);
        }
        return bookVos;
    }


    @Override
    public Page<BookVo> findBooksByCategoryId(int categoryId, int pageNum) {
        List<Book> books = bookMapper.selectByCategoryId(categoryId, (pageNum - 1) * 10, 10);
        List<BookVo> bookVos = new LinkedList<>();
        Page<BookVo> page = new Page<>();
        if (null == books) {
            page.setPageNum(1);
            page.setPageCount(1);
            return page;
        }
        for (Book b : books) {
            BookVo bookVo = new BookVo();
            bookVo.setBookId(b.getBookId());
            bookVo.setBookName(b.getBookName());
            bookVo.setBookAuthor(b.getBookAuthor());
            bookVo.setBookPublish(b.getBookPublish());
            BorrowingBooksExample borrowingBooksExample = new BorrowingBooksExample();
            BorrowingBooksExample.Criteria criteria1 = borrowingBooksExample.createCriteria();
            criteria1.andBookIdEqualTo(b.getBookId());
            List<BorrowingBooks> borrowingBooks = borrowingBooksMapper.selectByExample(borrowingBooksExample);
            if (borrowingBooks == null || borrowingBooks.size() < 1) {
                bookVo.setIsExist("可借");
            } else {
                bookVo.setIsExist("不可借");
            }
            bookVos.add(bookVo);
        }
        page.setList(bookVos);
        page.setPageNum(pageNum);
        page.setPageSize(10);
        int bookCount = bookMapper.selectBookCountByCategoryId(categoryId);
        int pageCount = 0;
        pageCount = bookCount / 10;
        if (bookCount % 10 != 0) {
            pageCount++;
        }
        page.setPageCount(pageCount);
        if (bookCount == 0) {
            page.setPageCount(1);
        }
        return page;

    }
}
