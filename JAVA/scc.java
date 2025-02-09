abstract class scc {
        abstract void display();
    }
    class abss extends scc
    {
        void display()
        {
            System.out.println("this is abstract function");
        }
    }
        class Main
        {
            public static void main(String args[]) 
            {
                abss ob=new abss();
                ob.display();
            }
        }
