package com.zbw;

import com.zbw.domain.Book;
import com.zbw.domain.Vo.BookVo;
import com.zbw.mapper.BookMapper;
import com.zbw.service.IBookService;
import com.zbw.utils.page.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {

    @Resource
    private BookMapper bookMapper;
    @Resource
    private IBookService bookService;
    @Test
    public void testSelectBookByName(){
        List<BookVo> bookVoList=bookService.selectBooksByBookPartInfo("平凡的世界");
        if(null!=bookVoList){
            for(BookVo bookVo:bookVoList){
                System.out.println(bookVo.getBookName()+" "+bookVo.getIsExist());
            }
        }
    }

    @Test
    public void testSelectByCategoryId(){
        Page<BookVo> page=bookService.findBooksByCategoryId(1,1);
        if(null!=page){
            for(BookVo bookVo:page.getList()){
                System.out.println(bookVo.getBookName()+" "+bookVo.getIsExist());
            }
            System.out.println(page.getPageCount());
        }
    }

    @Test
    public void testSelectByCategoryAndPage(){
        List<Book> books=bookMapper.selectByCategoryId(1,0,2);
        if(null!=books){
            for(Book b:books){
                System.out.println(b.getBookId()+" "+b.getBookName()+" "+b.getBookCategory());
            }
        }
    }

    @Test
    public void testFindAllBookCountByCategoryId(){
        int n=bookMapper.selectBookCountByCategoryId(1);
        System.out.println(n);
    }
}
