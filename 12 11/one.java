import java.util.Scanner;
class one{
public static void main(String[]args){
	Scanner scanner= new Scanner(System.in);
	int n,r,c;
	System.out.print("Enter a number for  r&c: ");
	n=scanner.nextInt();
	for(r=1;r<=n;r++){
	for(c=1;c<=r;c++){
		System.out.print("* ");
	}
	System.out.println();
	}
}
}