package com.spring.demo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    @NotEmpty(message = "category is need to be filled.")
    private String categoryName;

    @ManyToOne
    private User createdBy;
    @Temporal( TemporalType.DATE )
    private Date createDate;
    @Temporal( TemporalType.DATE )
    private Date lastUpdateDate;


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
}
