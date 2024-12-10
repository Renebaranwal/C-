import java.util.Scanner;
public class patternnn 
{
    public static void patternx(int N)
    {
        for(int i = 0; i<N; i++)
        {
            for(int j=0; j<N-i-1; j++)
            {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1 ; j<=2*i+1;j++)
            {
                System.out.print(ch);
                if(j <= breakpoint)
                {
                    ch++;
                }
                else {
                    ch--;
                }
            }
                for(int j=0; j<N-i-1; j++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        public static void patterny(int N)
        {
            for(int i=0; i<N; i++)
            {
               for(char ch =(char)(int)('E' - i); ch<=(char)(int)('E'); ch++)
               {
                System.out.print(ch + " ");
               } 
               System.out.println();
            }
             

        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows: ");
            int N = sc.nextInt();
            patternx(N);
            patterny(N);
        }
    }


    

