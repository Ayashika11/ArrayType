package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arrayLength,elements,even=0,odd=0;
	Scanner sc = new Scanner(System.in);
	arrayLength = sc.nextInt();
	for(int index=0;index<arrayLength;index++)
    {
        elements=sc.nextInt();
        if(elements%2==0)
            even++;
        else
            odd++;
    }
	System.out.println("The array is "+ checkArrayType(arrayLength,even,odd));
    }

    private static String checkArrayType(int arrayLength, int even, int odd) {
        if(even==arrayLength)
            return "Even";
        else if(odd==arrayLength)
            return "Odd";
        else
            return "Mixed";
    }
}
