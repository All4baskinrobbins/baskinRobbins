package com.example.baskinrobbins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


//포스트방식 / json타입 데이터를 주고 받는다.
//VO를 사용하는 방식과 <HashMap>을 사용하는 방식이 있는데 VO방식을 사용
//@PostMapping, GetMapping 이있는데, @RequestMapping을 사용하면 둘중 원하는걸 속성으로 선택가능하다.
@Slf4j
@RestController     //데이터만 리턴해줄 때 restController 사용
public class UserController {    
    
    @RequestMapping(value = "/joinAction", method = RequestMethod.POST, consumes = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<UserVO> test(@RequestBody UserVO userVO) throws Exception{
        
        log.info(userVO.toString());
        return ResponseEntity.ok(userVO);
    }

}

