package com.star.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.star.dao.BlogDao;
import com.star.queryVo.FirstPageBlog;
import com.star.queryVo.RecommendBlog;
import com.star.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private BlogDao blogDao;

    //    分页查询博客列表
    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum, RedirectAttributes redirectAttributes) {
        PageHelper.startPage(pageNum, 10);
        List<FirstPageBlog> allFirstPageBlog = blogService.getFirstPageBlog();
        List<RecommendBlog> recommentBlogList = blogService.getRecommendBlog();
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(allFirstPageBlog);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("recommendedBlogs", recommentBlogList);
        return "index";
    }

}
