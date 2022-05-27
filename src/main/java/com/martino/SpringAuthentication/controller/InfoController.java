package com.martino.SpringAuthentication.controller;


import com.martino.SpringAuthentication.domain.Info;
import com.martino.SpringAuthentication.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/info")
public class InfoController {

    @Autowired
    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Info> getInfoById(@PathVariable("id")Long id){
        Info info=infoService.findInfoById(id);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Info> updateInfo(@RequestBody Info info){
        Info updateInfo=infoService.updateInfo(info);
        return new ResponseEntity<>(updateInfo, HttpStatus.OK);
    }
}
