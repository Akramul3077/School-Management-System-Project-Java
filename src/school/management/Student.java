/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management;

/**
 *
 * @author AKRAMUL
 */
class Student {

    private String id, name, father_name, mother_name, phone, religion, blood, classs, section, session, roll, address, date, gendar;

    public Student(String id, String name, String father_name, String mother_name, String phone, String religion, String blood, String classs, String section, String session, String roll, String address, String date, String gendar) {
        this.id = id;
        this.name = name;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.phone = phone;
        this.religion = religion;
        this.blood = blood;
        this.classs = classs;
        this.section = section;
        this.session = session;
        this.roll = roll;
        this.address = address;
        this.date = date;
        this.gendar = gendar;
    }

    public String getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getfather_name() {
        return father_name;
    }

    public String getmother_name() {
        return mother_name;
    }

    public String getphone() {
        return phone;
    }

    public String getreligion() {
        return religion;
    }

    public String getclasss() {
        return classs;
    }

    public String getblood() {
        return blood;
    }

    public String getsectin() {
        return section;
    }

    public String getsession() {
        return session;
    }

    public String getroll() {
        return roll;
    }

    public String getaddress() {
        return address;
    }

    public String getdate() {
        return date;
    }

    public String getgendar() {
        return gendar;
    }

}
