/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UTS.yassarservice.controler;

import com.UTS.yassarservice.pegawai.pegawai;
import com.UTS.yassarservice.pegawaiservice.pegawaiservice;
import java.net.URI;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author LENOVO
 */
public class pegawaicontroler {
    public class UserController {
    private pegawaiservice pegawaiservice;
    
    @GetMapping("/pegawai")
    public List<pegawai> getAllpegawai(){
        return pegawaiservice.getAllpegawai();
    }
       
    @GetMapping("/pegawai")
        public pegawai getpegawai(@PathVariable String nip){
        return pegawaiservice.getpegawai(nip);
    }
    
    public ResponseEntity<Object> addpegawai( pegawai pegawai){
       pegawaiservice.addpegawai(pegawai);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{nip}")
                .buildAndExpand(pegawai.getnip())
                .toUri();
        return ResponseEntity.created(path).build();
    }
    
    @PutMapping("/user")
    public pegawai updateUser(@RequestBody pegawai pegawai){
        return pegawaiservice.updatepegawai(pegawai);
    }
    
    @DeleteMapping("/pegawai/{nip}")
    public pegawai deletepegawai(@PathVariable String nip){
        return pegawaiservice.deletepegawai(nip);
        
        }
    
    }
}
