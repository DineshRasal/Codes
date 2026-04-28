package Array;

import java.util.Scanner;

public class Array2D {
    
    public static void main(String[] args) {
        
        int matrix[][]=new int[3][3];
        int n=matrix.length ,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Values");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt(); 
            }     
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter Key Value");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key Found at index ("+i+","+j+")");
                }
                }
                
            }
            System.out.println("Key Not Found ");


            //Smallest Element
            int smallest=Integer.MAX_VALUE;
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
                
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
                }
                
            }
            System.out.println("Smallest="+smallest);
             System.out.println("Largest="+largest);
        }
                    
                

        
    
    }

