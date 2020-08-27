package com.project_work.foodies;

public class Item {
    private String item_name;
    private String item_pic;
    private String item_details;
    private String item_price;
    private String item_variety;

    public Item(String item_name, String item_pic, String item_details, String item_price,String item_variety) {
        this.item_name = item_name;
        this.item_pic = item_pic;
        this.item_details = item_details;
        this.item_price = item_price;
        this.item_variety=item_variety;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_pic() {
        return item_pic;
    }

    public void setItem_pic(String item_pic) {
        this.item_pic = item_pic;
    }

    public String getItem_details() {
        return item_details;
    }

    public void setItem_details(String item_details) {
        this.item_details = item_details;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public String getItem_variety() {
        return item_variety;
    }

    public void setItem_variety(String item_variety) {
        this.item_variety = item_variety;
    }
}

