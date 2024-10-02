
package library;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter number of the books:");
       int numberOfBooks=scanner.nextInt();
       scanner.nextLine();
       
       String[] books=new String[numberOfBooks];
       String[] authors=new String[numberOfBooks];
       String[] puplishers=new String[numberOfBooks];
       
       for(int i=0; i<=numberOfBooks-1; i++){
           System.out.print(i+"."+"Enter of the book name:");
           books[i]=scanner.nextLine();
           System.out.print(i+"."+"Enter of the book authors:");
           authors[i]=scanner.nextLine();
           System.out.print(i+"."+"Enter of the book puplishers:");
           puplishers[i]=scanner.nextLine();
       
           System.out.println();
    
       }
       System.out.print("Please give spesific book name:");
       String spesificBook=scanner.nextLine();
       int in=-1;
       for(int j=0; j<=numberOfBooks-1; j++){
           if(spesificBook.equalsIgnoreCase(books[j])){
               in=j;
           }
       }
       if(in>-1){
         System.out.println("Book found at index:"+in);
           System.out.println("Book:  "+ books[in]);
           System.out.println("Author:  "+ authors[in]);
           System.out.println("Puplisher:  "+ puplishers[in]);
           System.out.println();
       }
       
       else{
           System.out.println("Book did not find");
           System.out.println();
           
       }
        System.out.println("LİBRARY CATALOQUE:");
        System.out.println();
       for(int k=0; k<=numberOfBooks-1; k++){
           System.out.println("Book:  "+books[k]);
           System.out.println("Author:  "+authors[k]);
           System.out.println("Puplisher:  "+puplishers[k]);
           
           System.out.println();
       }
    }
    
    
}
