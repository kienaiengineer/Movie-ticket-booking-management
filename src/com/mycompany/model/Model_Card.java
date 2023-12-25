/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import javax.swing.Icon;


public class Model_Card {
    private Icon icon;
    private String title;
    private String values;
    private String decription;

    public Model_Card(Icon icon, String title, String values, String decription) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.decription = decription;
    }

    public Model_Card() {
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
            
    
}
