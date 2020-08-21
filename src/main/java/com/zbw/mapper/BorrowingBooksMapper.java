package com.zbw.mapper;

import com.zbw.domain.BorrowingBooks;
import com.zbw.domain.BorrowingBooksExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowingBooksMapper {
    long countByExample(BorrowingBooksExample example);

    int deleteByExample(BorrowingBooksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowingBooks record);

    int insertSelective(BorrowingBooks record);

    List<BorrowingBooks> selectByExample(BorrowingBooksExample example);

    BorrowingBooks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowingBooks record, @Param("example") BorrowingBooksExample example);

    int updateByExample(@Param("record") BorrowingBooks record, @Param("example") BorrowingBooksExample example);

    int updateByPrimaryKeySelective(BorrowingBooks record);

    int updateByPrimaryKey(BorrowingBooks record);

    //查询userId用户的所有借书记录
    List<BorrowingBooks> selectAllBorrowRecord(@Param("userId") int userId);

    //查询该userId用户的总借书记录数目
    int selectAllRecordCount(@Param("userId") int userId);

    // 分页查询所有记录
    List<BorrowingBooks> selectAllByPage(@Param("currIndex") int currIndex, @Param("pageSize") int pageSize);

    //查询所有记录总数
    int selectAll();
}