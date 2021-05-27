package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arrayLength,elements,even=0,odd=0,typeCheck;
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
	String[] typesOfArray = new String[] {"Even","Odd","Mixed"};
	typeCheck = checkArrayType(arrayLength,even,odd);
	System.out.println("The array is "+ typesOfArray[typeCheck-1]);
    }

    private static int checkArrayType(int arrayLength, int even, int odd) {
        if(even==arrayLength)
            return 1;
        else if(odd==arrayLength)
            return 2;
        else
            return 3;
    }
}
