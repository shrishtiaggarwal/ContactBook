package com.spring.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Contact implements Serializable {


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactId;
    private String contactName;
    private String contactEmail;
    private int phoneNumber;
    private String companyName;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name="contactId"),inverseJoinColumns = @JoinColumn(name = "categoryId"))
    private List<Category> category;

    @ManyToOne
    private User createdBy;
    @Temporal( TemporalType.DATE )
    private Date createDate;
    @Temporal( TemporalType.DATE )
    private Date lastUpdateDate;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "{" + "contactId:" + contactId + ", contactName:'" + contactName + '\'' + ", contactEmail:'" + contactEmail + '\'' + ", phoneNumber:" + phoneNumber + ", companyName:'" + companyName + '\'' + ", category:" + category + ", createdBy:" + createdBy + ", createDate:" + createDate + ", lastUpdateDate:" + lastUpdateDate + '}';
    }
}
