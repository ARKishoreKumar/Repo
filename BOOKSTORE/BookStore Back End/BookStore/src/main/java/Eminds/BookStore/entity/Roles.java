package Eminds.BookStore.entity;

import javax.persistence.*;

@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rolesId")
    private Long rolesId;

    public Roles(String userName, String emailId, String password, Long mobile, String userType) {
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.mobile = mobile;
        this.userType = userType;
    }

    public Roles(Long rolesId, String userName, String emailId, String password, Long mobile, String userType) {
        this.rolesId = rolesId;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.mobile = mobile;
        this.userType = userType;
    }

    @Column(name = "userName")
    private String userName;



    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }

    public Roles() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    @Column(name = "emailId")
    private String emailId;

    public Long getRolesId() {
        return rolesId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    @Column(name = "password")
    private String password;

    @Column(name = "mobile")
    private Long mobile;

    @Column(name = "userType")
    private String userType;
}
