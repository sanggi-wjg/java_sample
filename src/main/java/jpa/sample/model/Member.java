package jpa.sample.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // JPA 관리 객체
@Table(name = "member", uniqueConstraints = {@UniqueConstraint(name = "UQ_member_username", columnNames = {"username"})})
public class Member {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(length = 50, nullable = false, updatable = false)
    private String username;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    private String city;
    private String street;
    private String zipcode;

    //     옛 버전에는 이렇게
//     @Temporal(TemporalType.TIMESTAMP)
//     private Date createdAt;
//     @Temporal(TemporalType.TIMESTAMP)
//    private Date updatedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    @Lob
//    @Basic(fetch = FetchType.LAZY)
//    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}