package com.zbw.service;

import com.zbw.domain.Vo.BorrowingBooksVo;
import com.zbw.utils.page.Page;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public interface IBorrowingBooksRecordService {

    //分页查询所有用户借书记录 【管理员使用】
    public Page<BorrowingBooksVo> selectAllByPage(int pageNum);


    // 查询用户的所有借书记录 【普通用户使用】
    public ArrayList<BorrowingBooksVo> selectAllBorrowRecord(HttpServletRequest request);

}
