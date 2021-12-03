package com.star.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.star.entity.Friend;
import com.star.service.FriendService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class FriendController {
    @Autowired
    FriendService friendService;

    //    查询所有友链
    @GetMapping("/friendlinks")
    public String friend(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Friend> friends = friendService.queryAllFriend();
        PageInfo<Friend> pageInfo = new PageInfo<>(friends);
        model.addAttribute("pageInfo", pageInfo);
        return "admin/friendlinks";
    }

    //    跳转友链新增页面
    @GetMapping("/friendlinks/input")
    public String friend(Model model) {
        model.addAttribute("friendlink", new Friend());
        return "admin/friendlinks-input";
    }

    //    友链新增
    @PostMapping("/friendlinks")
    public String post(@Valid Friend friend, BindingResult bindingResult, RedirectAttributes attributes) {
        Friend existerFriend = friendService.queryFriendByName(friend.getBlogname());
        if (existerFriend != null) {
            attributes.addFlashAttribute("message", "该博客名称已经存在，请勿重复添加");
            return "redirect:/admin/friendlinks/input";
        }
        if (bindingResult.hasErrors()) {
            return "admin/friendlinks-input";
        }
        Integer affected = friendService.saveFriend(friend);
        if (affected > 0) {
            attributes.addFlashAttribute("message", "添加友链成功");

        } else {
            attributes.addFlashAttribute("message", "添加友链失败");
        }
        return "redirect:/admin/friendlinks";
    }

}
