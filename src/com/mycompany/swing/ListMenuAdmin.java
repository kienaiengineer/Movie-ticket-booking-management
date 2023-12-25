
package com.mycompany.swing;

import com.mycompany.event.EventMenuSelected;
import com.mycompany.model.Model_MenuAdmin;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;


public class ListMenuAdmin <E extends Object>extends JList<E>{
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    
    private EventMenuSelected event;
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
    }
    
    public ListMenuAdmin() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)){
                    int index = locationToIndex(e.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_MenuAdmin){
                        Model_MenuAdmin menu =(Model_MenuAdmin)o;
                        if (menu.getType() == Model_MenuAdmin.MenuType.MENU){
                            selectedIndex = index;
                            if (event != null){
                                event.selected(index);
                            }
                        }
                    }else{
                        selectedIndex = index;
                    }
                }
                super.mousePressed(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
            }
            
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                if (index   != overIndex){
                    Object o  = model.getElementAt(index);
                    if (o instanceof Model_MenuAdmin){
                        Model_MenuAdmin menu = (Model_MenuAdmin)o;
                        if(menu.getType() == Model_MenuAdmin.MenuType.MENU){
                            overIndex = index;
                        }else{
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
            
        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Model_MenuAdmin data;
                if (value instanceof Model_MenuAdmin){
                    data = (Model_MenuAdmin) value;
                }else{
                    data = new Model_MenuAdmin("", value + "", Model_MenuAdmin.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex==index);
                item.setOver(overIndex == index);
                return item;
            }
            
        };
    }
    public void additem(Model_MenuAdmin data){
        model.addElement(data);
    }
    
    
}
