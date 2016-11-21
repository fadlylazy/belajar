package com.belajar1.controller;


import com.belajar1.model.Mahasiswa;
import com.belajar1.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by andi on 11/2/2016.
 */
@Controller
public class MahasiswaController {

    private MahasiswaService mahasiswaservice;
@Autowired
    public void setMahasiswaService(MahasiswaService mahasiswaservice) {
        this.mahasiswaservice = mahasiswaservice;
    }

    @RequestMapping("/mahasiswa")

    public String MahasiswaList(Model model){
         model.addAttribute("mahasiswa", mahasiswaservice.listMahasiswa());
        return "mahasiswa";
    }

    @RequestMapping (value = "/mahasiswa/create", method = RequestMethod.GET)
    public String tampilkanform (Model model){
       model.addAttribute("mahasiswa", new Mahasiswa());
        return"formMahasiswa";
    }

    @RequestMapping (value = "/mahasiswa/create", method = RequestMethod.POST)
    public String simpanMahasiswa(Model model, Mahasiswa mahasiswa){
     model.addAttribute("mahasiswa", mahasiswaservice.saveOrUpdate(mahasiswa));
        return "redirect:/mahasiswa";
    }
    @RequestMapping (value = "/mahasiswa/edit/{id}", method = RequestMethod.GET)
    public String editMahasiswa(@PathVariable Integer id, Model model){
        model.addAttribute("mahasiswa", mahasiswaservice.getIdMahasiswa(id));
        return "formMahasiswa";
    }

    @RequestMapping  (value = "/mahasiswa/hapus/{id}")
    public String hapusMahasiswa(@PathVariable Integer id) {
        mahasiswaservice.getIdMahasiswa(id);
        return "redirect:/mahasiswa";
    }


}
