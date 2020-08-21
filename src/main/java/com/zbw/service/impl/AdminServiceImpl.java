package com.zbw.service.impl;

import com.zbw.domain.*;
import com.zbw.mapper.AdminMapper;
import com.zbw.mapper.BookCategoryMapper;
import com.zbw.mapper.BookMapper;
import com.zbw.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private BookMapper bookMapper;

    @Resource
    private BookCategoryMapper bookCategoryMapper;

    @Override
    public boolean adminIsExist(String name) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin = adminMapper.selectByExample(adminExample);
        if (null == admin)
            return false;
        if (admin.size() < 1) {
            return false;
        }
        return true;
    }

    @Override
    public Admin adminLogin(String name, String password) {

        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin = adminMapper.selectByExample(adminExample);

        if (null == admin) {
            return null;
        }
        
        for (Admin a : admin) {
            if (a.getAdminPwd().equals(password)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean addBook(Book book) {
        int n = bookMapper.insert(book);
        if (n > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<BookCategory> getBookCategories() {
        BookCategoryExample bookCategoryExample = new BookCategoryExample();
        return bookCategoryMapper.selectByExample(bookCategoryExample);
    }

    @Override
    public boolean addBookCategory(BookCategory bookCategory) {
        int n = bookCategoryMapper.insert(bookCategory);
        if (n > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateAdmin(Admin admin, HttpServletRequest request) {
        //获取session对象中admin对象
        Admin sessionAdmin = (Admin) request.getSession().getAttribute("admin");
        admin.setAdminId(sessionAdmin.getAdminId());
        int n = adminMapper.updateByPrimaryKey(admin);

        if (n > 0) {
            //修改成功，更新session对象
            Admin newAdmin = adminMapper.selectByPrimaryKey(admin.getAdminId());
            request.getSession().setAttribute("admin", newAdmin);
            return true;
        }

        return false;
    }
}
