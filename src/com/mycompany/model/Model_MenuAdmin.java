
package com.mycompany.model;

import java.io.File;
import java.net.MalformedURLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_MenuAdmin {
    String icon;
    String name;
    MenuType Type;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return Type;
    }

    public void setType(MenuType Type) {
        this.Type = Type;
    }

    public Model_MenuAdmin(String icon, String name, MenuType Type) {
        this.icon = icon;
        this.name = name;
        this.Type = Type;
    }

    public Model_MenuAdmin() {
    }
    
    public Icon toIcon() {
        String absolutePath = "D:\\Project Java\\MovieTicketBookingManagement\\src\\com\\mycompany\\icon\\" + icon + ".png";
        File file = new File(absolutePath);

        try {
            return new ImageIcon(file.toURI().toURL());
        } catch (MalformedURLException e) {
            return null;
        }
    }
    public static enum MenuType{
        TITLE, MENU, EMPTY
    }
}
