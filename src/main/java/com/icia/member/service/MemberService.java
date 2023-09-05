package com.icia.member.service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    public boolean save(MemberDTO memberDTO) {
        int result = memberRepository.save(memberDTO);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO loginep(String memberEmail, String memberPassword) {
        return memberRepository.loginep(memberEmail,memberPassword);
    }

    public List<MemberDTO> findAll() {
        return memberRepository.findAll();
    }
}
