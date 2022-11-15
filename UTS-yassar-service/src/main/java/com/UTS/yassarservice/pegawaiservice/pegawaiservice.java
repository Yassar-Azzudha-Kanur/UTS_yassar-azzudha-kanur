/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.UTS.yassarservice.pegawaiservice;

import com.UTS.yassarservice.pegawai.pegawai;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface pegawaiservice {
    public pegawai getpegawai(String nip);

    public List<pegawai> getAllpegawai();

    public void addpegawai(pegawai pegawai);

    public pegawai updatepegawai(pegawai pegawai);

    public pegawai deletepegawai(String nip);

   
}
