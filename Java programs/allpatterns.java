public class allpatterns {
    public static void main(String args[]){
        int c =5;    //column(j)
        int r =5;    //row(i)

        //solid rectangle
        System.out.println("Solid Rectangle - ");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        
        //hollow rectangle
        System.out.println("hollow Rectangle - ");
        for(int i =1;i<=r;i++){       //outer loop(rows)
            //cell(i,j)
            for (int j=1;j<=c;j++){   //inner loop(columns)
                //boundary cells
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //half pyramid 
        System.out.println("Half Pyramid - ");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 

        //inverted half pyramid
        System.out.println("Inverted Half Pyramid - ");
        for(int i =r;i>=1;i--){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 

        //diagonal of rectangle
        System.out.println("Diagonal of Rectangle - ");
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //inverted half triangle by 180
        System.out.println("Inverted Half Triangle by 180 - ");
        for(int i =1; i<=r;i++){
            //inner loop for space 
            for(int j =1;j<=(c-i);j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //half pyramid with numbers
        System.out.println("Half Pyramid With Numbers - ");
        for (int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted half pyramid with numbers
        System.out.println("Inverted Half Pyramid With Numbers - ");
        for (int i=1;i<=r;i++){
            for(int j=1;j<=c-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
                                       //OR
        System.out.println("Another Way - ");
        for(int i =5;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Floyd's triangle
        System.out.println("Floyd's Triangle - ");
        int a =1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }

        //0-1 Triangle
        System.out.println("0-1 Triangle - ");
        for(int i =1; i<=r;i++){
            for(int j =1;j<=i;j++){                //even i+j -> 1 odd i+j -> 0
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        //Butterfly pattern  
        System.out.println("Butterfly Pattern - ");
        // for upper part
        for (int i=1;i<=r;i++){                               //1  1star 6spaces 1star
            // for 1st part stars                             //2  2stars 4spaces 2stars
            for (int j =1;j<=i;j++){                          //3  3stars 2spaces 3stars
                System.out.print("*");                        //4  4stars 0spaces 4stars
            }
            // for spaces
            int s = 2*(r-i);
            for (int j =1;j<=s;j++){
                System.out.print(" ");
            }
            // for 2nd part stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   
        // for lower part
        for (int i=r;i>=1;i--){                               //1  1star 6spaces 1star
            // for 1st part stars                             //2  2stars 4spaces 2stars
            for (int j =1;j<=i;j++){                          //3  3stars 2spaces 3stars
                System.out.print("*");                        //4  4stars 0spaces 4stars
            }
            // for spaces
            int s = 2*(r-i);
            for (int j =1;j<=s;j++){
                System.out.print(" ");
            }
            // for 2nd part stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   

        // Solid rhombus
        System.out.println("Solid Rhombus - ");
        for(int i=1;i<=r;i++){                                //1 4spaces 5stars
            //for spaces                                      //2 3spaces 5stars
            int s = r-i ;                                     //3 2spaces 5stars
            for(int j=1;j<=s;j++){                            //4 1space 5stars
                System.out.print(" ");                        //5 0space 5stars
            }
            //for stars
            for (int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }    

        // Number pyramid 
        System.out.println("Number Pyramid - ");
        for (int i=1;i<=r;i++){
            //spaces
            for (int j =1; j<=(r-i);j++){
                System.out.print(" ");
            }
            // for numbers
            for(int j =1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }    

        //Palindrome pattern
        System.out.println("Palindrome Pattern - ");
        for (int i=1;i<=r;i++){
            // for spaces 
            for (int j =1;j<=(r-i);j++){
                System.out.print(" ");
            }
            // for first half numbers 
            for (int j=i; j>=1;j--){
                System.out.print(j);
            }
            //second half numbers
            for(int j =2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }    

        //Diamond pattern
        System.out.println("Diamond Pattern - ");
        //upper half
        for(int i =1;i<=r;i++){
            //for spaces
            for(int j =1; j<=r-i;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i =r;i>=1;i--){
            //for spaces
            for(int j =1; j<=r-i;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j=1;j<=(2*i)-1;j++){   
                System.out.print("*");
            }
            System.out.println();
        }
    }                                                         
}
