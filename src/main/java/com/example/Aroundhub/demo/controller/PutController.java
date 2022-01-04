package com.example.Aroundhub.demo.controller;

import com.example.Aroundhub.demo.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value="/api/v1/put-api")
public class PutController {
    @PutMapping(value="/default")
    public String putMethod(){return "Hello world";}

    @PutMapping(value="/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb= new StringBuilder();
        postData.entrySet().forEach(map->{
            sb.append(map.getKey()+" : "+map.getValue());
        });
        return sb.toString();
    }

    @PutMapping(value="/member1")
    public String postMemberDto1(@RequestBody MemberDTO memberDto){
        return memberDto.toString();
    }

    @PutMapping(value="/member2")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDto){
        return memberDto;
    }
    @PutMapping(value="/member3")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDto){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }

}
