/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UTS.yassarservice.gaji;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.nip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author LENOVO
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class gaji {
    @nip
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long gajinip;
    private Long pegawainip;
    private Long tunjangan_anak;
    private Long tunjangan_istri;
    private Long getgapok;
    private Long gajibersih;
    private String tanggal;
 
}
