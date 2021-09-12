package com.whd.users;


//import javax.persistence.*;
//
//@Entity
//@Table(name = "users")
//public class Users {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(nullable = false, length = 150)
//    private String firstName;
//
//    @Column(nullable = false, length = 200)
//    private String lastName;
//
//    @Column(nullable = false, length = 150)
//    private String email;
//
//    @Column(nullable = false, length = 25)
//    private int phone;
//
//    @Column(nullable = false, length = 100)
//    private String username;
//
//    @Column(nullable = false, length = 150)
//    private String password;
//
//    @Column
//    private boolean isAdmin;
//
//
//    //TODO: Empty Constructor
//    public Users() {}
//
//    //TODO: Everything Constructor
//    public Users(long id, String firstName, String lastName, String email, int phone, String username, String password, boolean isAdmin) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.username = username;
//        this.password = password;
//        this.isAdmin = isAdmin;
//    }
//
//    //TODO: Getters And Setters
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getPhone() {
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public boolean isAdmin() {
//        return isAdmin;
//    }
//
//    public void setAdmin(boolean admin) {
//        isAdmin = admin;
//    }
//
//
//    // TODO: To String
//
//
//    @Override
//    public String toString() {
//        return "Users{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", phone=" + phone +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", isAdmin=" + isAdmin +
//                '}';
//    }
//
//    //TODO: No ID Constructor
//    public Users(String firstName, String lastName, String email, int phone, String username, String password, boolean isAdmin) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.username = username;
//        this.password = password;
//        this.isAdmin = isAdmin;
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
