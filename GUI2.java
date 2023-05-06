import java.awt.*;

class MarvellousFrame
{
    public Frame Fobj;
    public MarvellousFrame(String title[])
    {
        Fobj = new Frame(title);
        Fobj.setSize(400,400);
        Fobj.setVisible(true);
        Fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener implements addWindowListener
{
    public void windowsDeactivated(windowevent obj)
    {

    }
    
    public void windowsDeiconified(windowevent obj)
    {

    }
    public void windowsiconified(windowevent obj)
    {

    }
    public void windowsactivated(windowevent obj)
    {

    }
    
    public void windowsclose(windowevent obj)
    {

    }
    public void windowsopen(windowevent obj)
    {

    }
    
    public void windowsclosing(windowevent obj)
    {
          system.exit(0);
    }
}

class GUI2
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}