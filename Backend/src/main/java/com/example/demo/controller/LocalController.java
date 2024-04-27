package com.example.demo.controller;

import com.example.demo.entity.Local;
import com.example.demo.service.LocalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {
 
    @Autowired
    LocalService localService;
    @GetMapping("/findAllLocals")
    public List<Local> findAllLocal(){
        return localService.findAllLocals();
    }
    
    @PostMapping("/saveLocal") 
    public Local saveLocal(@RequestBody Local local){
    return localService.saveLocal(local);
    
}
}
