package org.techer.track.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "TRACK_USER")
public class User {

//    CREATE SEQUENCE TestSequence
//    START WITH 1
//    INCREMENT BY 1
//    MINVALUE 1
//    MAXVALUE 200000
//    CYCLE;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "track_id_generator")
    @SequenceGenerator(name = "track_id_generator" , sequenceName = "track_id_sequence" ,allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "EMAIL" ,nullable = false , length = 200)
    private String email;
    @Column(name = "PHONE_NUMBER" , length = 200)
    private BigInteger phoneNumber;
    @Column(name = "COURSE" , nullable = false)
    private String course;
    @Column(name = "DOJ" , nullable = false)
    private LocalDateTime dateOfJoining;

    public User(Integer id, String name, String email, BigInteger phoneNumber, String course, LocalDateTime dateOfJoining) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.dateOfJoining = dateOfJoining;
    }

    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDateTime getDateOfJoining() {
        return dateOfJoining;
    }
    @PrePersist
    public void setDateOfJoining() {
        this.dateOfJoining = LocalDateTime.now();
    }
}
