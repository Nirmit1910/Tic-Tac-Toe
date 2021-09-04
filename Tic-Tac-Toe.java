import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        System.out.println("---------");
        int p=0,c1=0,c2=0,c3=0;
        for(int i=1;i<=3;i++)
        {
            System.out.print ("| ");
            String k= s.substring(p,p+3);
            for(int j=0;j<3;j++)
            {
                System.out.print(k.charAt(j)+" ");
            }
            System.out.println("|");
            p=p+3;
        }
        p=0;
        System.out.println("---------");
        //Counting x and o
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='X')
                c1++;
            else if(s.charAt(i)=='O')
                c2++;
            else 
                c3++;
        }
        int d =c1-c2;
        d=Math.abs(d);
        //Game starts
        boolean k1 =false ,k2 =false;
        if(s.charAt(0) == 'X' && s.charAt(1)=='X' && s.charAt(2)=='X')
        k1=true;
        else if(s.charAt(0) == 'X' && s.charAt(4)=='X' && s.charAt(8)=='X')
        k1=true;
        else if(s.charAt(0) == 'X' && s.charAt(3)=='X' && s.charAt(6)=='X')
        k1=true;
        else if(s.charAt(1) == 'X' && s.charAt(4)=='X' && s.charAt(7)=='X')
        k1=true;
        else if(s.charAt(2) == 'X' && s.charAt(5)=='X' && s.charAt(8)=='X')
        k1=true;
        else if(s.charAt(2) == 'X' && s.charAt(4)=='X' && s.charAt(6)=='X')
        k1=true;
        else if(s.charAt(5) == 'X' && s.charAt(4)=='X' && s.charAt(3)=='X')
        k1=true;
        else if(s.charAt(6) == 'X' && s.charAt(7)=='X' && s.charAt(8)=='X')
        k1=true;
        if(s.charAt(0) == 'O' && s.charAt(1)=='O' && s.charAt(2)=='O')
        k2=true;
        else if(s.charAt(0) == 'O' && s.charAt(4)=='O' && s.charAt(8)=='O')
        k2=true;
        else if(s.charAt(0) == 'O' && s.charAt(3)=='O' && s.charAt(6)=='O')
        k2=true;
        else if(s.charAt(1) == 'O' && s.charAt(4)=='O' && s.charAt(7)=='O')
        k2=true;
        else if(s.charAt(2) == 'O' && s.charAt(5)=='O' && s.charAt(8)=='O')
        k2=true;
        else if(s.charAt(2) == 'O' && s.charAt(4)=='O' && s.charAt(6)=='O')
        k2=true;
        else if(s.charAt(5) == 'O' && s.charAt(4)=='O' && s.charAt(3)=='O')
        k2=true;
        else if(s.charAt(6) == 'O' && s.charAt(7)=='O' && s.charAt(8)=='O')
        k2=true;
        if( k1==false && k2==false && c3>0 && d<2)
        System.out.print("Game not finished");
        else if( k1==true && k2==true && c3==0)
        System.out.print("Draw");
        else if( k1==false && k2==false && c3==0)
        System.out.print("Draw");
        else if(k1==true && k2==false)
        System.out.print("X wins");
        else if(k1==false && k2==true)
        System.out.print("O wins");
        else if( k1==true && k2==true && c3>0 )
        System.out.print("Impossible");
        else if( k1==true && k2==true && d>=2 && c3>0 )
        System.out.print("Impossible");
        else if( k1==false && k2==false && d>=2 && c3>0 )
        System.out.print("Impossible");
    } 
}

/*XOOOOXXXX
---------
| X O O |
| O O X |
| X X X |
---------
X wins*/