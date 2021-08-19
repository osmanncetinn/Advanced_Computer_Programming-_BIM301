package tr.edu.halic.programlama.ders5;

import java.util.Scanner;

public class kelime {
public static void main(String[] args) {
	
    String cumle,harf;
    int harfSayisi = 0;

    Scanner input = new Scanner(System.in);


	    System.out.println("Bir cümle giriniz: ");
	    cumle = input.nextLine();
	    
	    System.out.println("Bir harf giriniz: ");
	    harf = input.next();
	    
	    for(int i = 0; i < cumle.length() - 1;i++)
	    {    
	        if(cumle.substring(i,i+1).equals(harf))
	            harfSayisi++;
	    }


	    System.out.println(harf + " harfi " + harfSayisi + " defa tekrar etmiþtir.");


	}


	    


}
