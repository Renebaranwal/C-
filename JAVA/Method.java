public class Method {
    public static void main(String[] args) {
        printFirstPattern();
        


        
    }
    public static void printFirstPattern()
    {
        int rows = 0;
        while (rows < 5)
        {
            System.out.print("*");
            int i = 0;
            while (i < rows)
            {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    
}
