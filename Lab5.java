// Donark Patel
// Lab 5
// Template
import java.util.Scanner;
import java.io.*;
public class Lab5

{
	public static void main (String [] args)throws IOException
	{
		// Variables
		int aQuantity,bQuantity,gQuantity;
		float aPrice,bPrice,gPrice;
		float aTotal,bTotal,gTotal,grandTotal;
		String storeName,itemOne,itemTwo,itemThree;
		//Input



		File inputFile=new File ("inputFile.txt");
		Scanner in=new Scanner(inputFile);

		itemOne = in.nextLine();
		aQuantity = in.nextInt();
		aPrice = in.nextFloat();
		itemTwo = in.next();
		bQuantity = in.nextInt();
		bPrice = in.nextFloat();
		itemThree = in.next();
		gQuantity = in.nextInt();
		gPrice = in.nextFloat();


		// assiments

		// Calculation
		aTotal = aQuantity * aPrice;
		bTotal = bQuantity * bPrice;
		gTotal = gQuantity * gPrice;
		grandTotal = aTotal + bTotal + gTotal;




		// Output
		PrintWriter out=new PrintWriter("output.txt");
		System.out.println("\t\t\tFruit Retport\n");
		System.out.println("********************************************************\n\n");
		System.out.println(" Item \t\t\tQyantity\tPrice\tTotal");
		System.out.printf("%45s %8s\n","($)","($)");
		System.out.println("********************************************************\n");
		System.out.printf("%-10s %20d %13.2f %8.2f\n",itemOne,aQuantity,aPrice,aTotal);
		System.out.printf("%-10s %20d %13.2f %8.2f\n",itemTwo,bQuantity,bPrice,bTotal);
		System.out.printf("%-10s %20d %13.2f %8.2f\n",itemThree,gQuantity,gPrice,gTotal);
		System.out.println("********************************************************\n\n");
		System.out.printf("%45s %8.2f\n","Grand Total ($)",grandTotal);

		System.out.println("Donark patel");
		System.out.println("Lab5");
		System.out.println("---------\n\n");

		out.println("\t\t\tFruit Retport\n");
		out.println("********************************************************\n\n");
		out.println(" Item \t\t\tQyantity\tPrice\tTotal");
		out.printf("%45s %8s\n","($)","($)");
		out.printf("\n");
		out.println("********************************************************\n");
		out.printf("%-10s %20d %13.2f %8.2f\n",itemOne,aQuantity,aPrice,aTotal);
		out.printf("%-10s %20d %13.2f %8.2f\n",itemTwo,bQuantity,bPrice,bTotal);
		out.printf("%-10s %20d %13.2f %8.2f\n",itemThree,gQuantity,gPrice,gTotal);
		out.println("********************************************************\n\n");
		out.printf("%45s %8.2f\n","Grand Total ($)",grandTotal);

		out.println("Donark patel");
		out.println("Lab5");
		out.println("---------\n\n");
		out.close();





	}
}
