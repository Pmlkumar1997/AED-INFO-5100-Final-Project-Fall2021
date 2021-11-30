/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resident;

/**
 *
 * @author mohithparvataneni
 */
public class Resident {
    
    private String fName;
    private String lNmae;
    private int age;
    private String sex;
    private String location;
    private String id;
    private String mail;
    private String phone;
    private String userName;
    private String password;


    public Resident(String fName, String lNmae, int age, String sex, String location, String id, String mail, String phone, String userName, String password) {
        this.fName = fName;
        this.lNmae = lNmae;
        this.age = age;
        this.sex = sex;
        this.location = location;
        this.id = id;
        this.mail = mail;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlNmae() {
        return lNmae;
    }

    public void setlNmae(String lNmae) {
        this.lNmae = lNmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
