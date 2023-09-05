package com.icia.member.controller;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;
    @GetMapping("/save")
    public String save(){
        return "memberSave";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        boolean result = memberService.save(memberDTO);
        if (result) {
            System.out.println("학생등록 성공");
            return "memberLogin";
        } else {
            System.out.println("학생등록 실패");
            return "memberSave";
        }
    }

    @GetMapping("/login")
    public String login(){
        return "memberLogin";
    }

    @PostMapping("/login")
    public String memberLogin(@RequestParam("memberEmail") String memberEmail, @RequestParam("memberPassword") String memberPassword, Model model){
        MemberDTO memberDTO = memberService.loginep(memberEmail,memberPassword);

        return "memberMain";
    }

    @GetMapping("/members")
    public String members(Model model){
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberlist",memberDTOList);
        return "memberList";
    }

}























