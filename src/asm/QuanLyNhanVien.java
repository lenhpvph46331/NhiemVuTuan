/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
        listNhanVien.add(new NhanVien("NV01", "Nguyễn Hữu Nghĩa", "23", "nghianhph46340@gmail.com", 9999999.87878));
        listNhanVien.add(new NhanVien("NV02", "Hoàng Thọ Chính", "18", "chinh12345@gmail.com", 922999.87878));
        listNhanVien.add(new NhanVien("NV03", "Phạm Thị Quỳnh Thu", "21", "Thubbngusngoc@gmail.com", 978999.87878));
        listNhanVien.add(new NhanVien("NV04", "Phùn Văn Lềnh", "20", "lenhpvph46331@gmail.com", 6799999.87878));
    }

    
    
    
}
