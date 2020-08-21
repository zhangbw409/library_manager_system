package com.zbw.controller;

import com.zbw.domain.Vo.BorrowingBooksVo;
import com.zbw.service.IBorrowingBooksRecordService;
import com.zbw.utils.page.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class BorrowingController {

    @Resource
    private IBorrowingBooksRecordService borrowingBooksRecordService;

    /**
     * 返回所有用户借书记录页面
     *
     * @return
     */
    @RequestMapping("/allBorrowBooksRecordPage")
    public String allBorrowingBooksRecordPage(Model model, @RequestParam("pageNum") int pageNum) {
        Page<BorrowingBooksVo> page = borrowingBooksRecordService.selectAllByPage(pageNum);
        model.addAttribute("page", page);
        return "admin/allBorrowingBooksRecord";
    }
}
