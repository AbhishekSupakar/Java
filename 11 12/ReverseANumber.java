class ReverseANumber{
public static void main(String []args){
int n=1234321;
int r,sum=0,m;
m=n;
while(m!=0){
	r=m%10;
	sum=sum*10+r;
	m/=10;
}
	System.out.println("Reverse of the number is = "+sum);
	if(n==sum){
		System.out.println(n+" is a palindrom Number.");
	}
	else{
		System.out.println("Not a Palindrtom Number");
	}
}
}