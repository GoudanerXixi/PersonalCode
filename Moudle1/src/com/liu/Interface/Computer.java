package com.liu.Interface;

public class Computer {
    private String name;

    public void start()
    {
        System.out.println(name + "开机成功");
    }

    public String getName() {
        return name;
    }

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void install(USB usb)
    {
        usb.insert();
        if(usb instanceof Mouse)
        {


         Mouse m = (Mouse) usb;
         m.click();

        } else if (usb instanceof Keyboard) {



           Keyboard k = (Keyboard) usb;
           k.rap();
        }
        usb.pull();
    }
}
