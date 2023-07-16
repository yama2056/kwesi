package com.app.kwesi;

public class cateiteam {
    private int id;
    private String Category;

    public cateiteam() {
    }

    public cateiteam(String category) {
        Category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}


