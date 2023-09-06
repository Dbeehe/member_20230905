package com.icia.member.controller;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
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
    public String memberLogin(@ModelAttribute MemberDTO memberDTO, HttpSession session, Model model){
        boolean loginResult = memberService.login(memberDTO);
        // 로그인 성공시 사용자의 이메일을 세션에 저장
        session.setAttribute("loginEmail",memberDTO.getMemberEmail());
        // 모델에 이메일 저장
        model.addAttribute("email",memberDTO.getMemberEmail());
        if(loginResult){
            return "index";
        }else {
            return "memberLogin";
        }
    }

    @GetMapping("/members")
    public String members(Model model){
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberlist",memberDTOList);
        return "memberList";
    }

    @GetMapping("/logout")
    public  String logout(HttpSession session){
        //해당 파라미터만 없앨 경우
        session.removeAttribute("loginEmail");
        //세션 전체를 없을경우
        //session.invalidate();
        return "redirect:/";
    }

}























