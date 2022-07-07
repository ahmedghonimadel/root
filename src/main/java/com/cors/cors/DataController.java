package com.cors.cors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataController {

    @PostMapping("/new")
    public ResponseEntity<?> presist(@RequestBody Signup signup){
        Response res=new Response();
        res.permissions.add("super_admin");
        res.permissions.add("customer");
        res.setToken("jwt token");
        return ResponseEntity.ok(res);
    }

    @GetMapping("/test")
    public String getData(){
        return "ahmed";
    }
}
