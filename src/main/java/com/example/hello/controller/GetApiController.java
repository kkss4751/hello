package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")//http://localhost:9090/api/get/hello
    //path 속성을 통해
    public String getHello(){
        return "get Hello";
    }


    //예전에쓰던방식
    @RequestMapping(path = "/hi" , method = RequestMethod.GET)
    // RequestMapping 은 get/ post/ put / delete 모든 메소드가 동작하게되는 문제가 있음
    // method를 지정해줘야됨
    public String hi(){
        return "hi";
    }


    //path variable
    // localhost:9090/api/get/path-variable 주소에는 대문자를 안쓴다.
    //localhost:9090/api/get/path-variable/{spring-boot} 계속 변할때는 { name 을 지정해준다 }
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){ //위의 네임과 동일해야함

        System.out.println("PathVariable : " + name);
        return name;
        //path-variable/ 다음으로 오는 문자를 반환한다

    }

    // 쿼리 파라미터
    // 주로 ? 물음표로 시작하고
    //검색을 할때 여러가지 매개변수의 인자를 예기하는데 & 연산자를 기준으로 나뉘고 = 연산자로 키 = 밸류가 있음
    // ex : ?key=value&key2=value2

    //http//localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30


}
