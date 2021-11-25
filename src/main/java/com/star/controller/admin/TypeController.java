package com.star.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.star.entity.Type;
import com.star.service.TypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class TypeController {
    @Autowired
    private TypeService typeService;

    //    分页查询分类列表
    @GetMapping("/types")
    public String list(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        String order = "id desc";
        PageHelper.startPage(pageNum, 10, order);
        List<Type> list = typeService.getAllType();
        PageInfo<Type> pageInfo = new PageInfo<Type>(list);
        model.addAttribute("pageInfo", pageInfo);
        return "admin/types";
    }

    //    返回新增分类页面
    @GetMapping("types/input")
    public String input(Model model) {
        model.addAttribute("type", new Type());
        return "admin/types-input";
    }

    //    新增分类
    @PostMapping("/types")
    public String post(@Valid Type type, RedirectAttributes redirectAttributes) {
        Type existedType = typeService.getTypeByName(type.getName());
        if (existedType != null) {
            redirectAttributes.addFlashAttribute("message", "不能添加重复分类");
            return "redirect:/admin/types/input";
        }
        int affected = typeService.saveType(type);
        if (affected > 0) {
            redirectAttributes.addFlashAttribute("message", "添加成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "添加失败");
        }
        return "redirect:/admin/types";

    }

    //    跳转修改分类页面
    @GetMapping("types/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("type", typeService.getTypeById(id));
        return "admin/types-input";
    }

    //    编辑修改分类
    @PostMapping("types/{id}")
    public String edit(@Valid Type type, RedirectAttributes redirectAttributes) {
        Type existedType = typeService.getTypeByName(type.getName());
        if (existedType != null) {
            redirectAttributes.addFlashAttribute("message", "该分类已经存在请勿重复添加");
            return "redirect:/admin/types/input";
        }
        int affected = typeService.updateType(type);
        if (affected > 0) {
            redirectAttributes.addFlashAttribute("message", "type修改成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "type修改失败");
        }
        return "redirect:/admin/types";

    }

    //    删除分类
    @GetMapping("types/{id}/delete")
    public String delete(@PathVariable long id, RedirectAttributes redirectAttributes) {
        int affected = typeService.deleteTypeById(id);
        if (affected > 0) {
            redirectAttributes.addFlashAttribute("message", "type删除成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "type删除失败");
        }
        return "redirect:/admin/types";
    }
}
