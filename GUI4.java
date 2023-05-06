import java.awt.*;
import java.awt.event.*;

class GUI4
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}

class MarvellousFrame
{
    public Frame Fobj;
    public MarvellousFrame(String title)
    {
        Fobj = new Frame(title);
        Fobj.setSize(400,400);
        Fobj.setVisible(true);
    }
}

