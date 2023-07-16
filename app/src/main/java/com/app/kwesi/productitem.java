package com.app.kwesi;

import android.graphics.Bitmap;

import java.util.Date;

public class productitem {

    private int id;
    private String title;

    private String contentdescription;
    private double price;
    private int categoryId;
    private Bitmap image;
    private Date createdDate;

    private String productname; {
    }

    public void product(String title, String contentdescription, String productname, double price, int categoryId, Date createdDate) {
        this.title = title;

        this.productname=productname;
        this.contentdescription=contentdescription;
        this.price = price;
        this.categoryId = categoryId;

        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setproductname(String productname) {
        String Productname = productname;
    }

    public String getContentdescriptionc() {
        return contentdescription;
    }

    public void setDescription(String description) {
        this.contentdescription = contentdescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}