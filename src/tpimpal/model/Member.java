/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal.model;

import java.util.ArrayList;

/**
 *
 * @author skday
 */
public class Member extends Akun {
    
    private String noMember;
    private ArrayList<Penyewaan> penyewaan;
    private int i=1;
    
    public Member(String nama, String username, String password) {
        super(nama, username, password);
        this.noMember = "MEM-"+i;
        i++;
    }

    public String getNoMember() {
        return noMember;
    }

    public void setNoMember(String noMember) {
        this.noMember = noMember;
    }

    public ArrayList<Penyewaan> getPenyewaan() {
        return penyewaan;
    }

    public void setPenyewaan(ArrayList<Penyewaan> penyewaan) {
        this.penyewaan = penyewaan;
    }
    
}
