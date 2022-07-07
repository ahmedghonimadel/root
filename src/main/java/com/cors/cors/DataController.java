package com.cors.cors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataController {

    @PostMapping("/new")
    public ResponseEntity<?> presist(@RequestBody Signup signup){
        System.out.println(signup.getEmail());
        ArrayList<String>list=new ArrayList<>();

        Response res=new Response();
        list.add("super_admin");
        list.add("customer");
        res.setPermissions(list);
        res.setToken("jwt token");
        return ResponseEntity.ok(res);
    }

    @GetMapping("/test")
    public String getData(){
        return "ahmed";
    }
}
