/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package come.dominos;

/**
 *
 * @author virad
 */
public class Registration {

    private String name;
    private String lName;
    private String email;
    private String confEmail; 
    private String phon;
    private String pass;
    private String confPass;

    public Registration(String name, String lName, String email, String confEmail, String phon, String pass, String confPass) {
        this.name = name;
        this.lName = lName;
        this.email = email;
        this.confEmail = confEmail;
        this.phon = phon;
        this.pass = pass;
        this.confPass = confPass;
    }

    Registration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Registration{" + "name=" + name + ", lName=" + lName + ", email=" + email + ", confEmail=" + confEmail + ", phon=" + phon + ", pass=" + pass + ", confPass=" + confPass + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfEmail() {
        return confEmail;
    }

    public void setConfEmail(String confEmail) {
        this.confEmail = confEmail;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfPass() {
        return confPass;
    }

    public void setConfPass(String confPass) {
        this.confPass = confPass;
    }

    
    

}
