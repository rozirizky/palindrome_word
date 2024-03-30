/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromewrod;

import java.util.Scanner;

/**
 *
 * @author mreza
 */
public class Palindromewrod {

    public static void main(String[] args) {
    String keyword,reverse = ""; 
   
    Scanner in = new Scanner(System.in);
    System.out.println("masukan kata :");
 
    keyword = in.nextLine().toLowerCase();

    for (int i = keyword.length() - 1; i >= 0; i--)
      reverse = reverse + keyword.charAt(i);

    if (keyword.equals(reverse))
      System.out.println("kata palindrome.");
    else
      System.out.println("kata bukan palindrome.");
    }
   }
  
   

