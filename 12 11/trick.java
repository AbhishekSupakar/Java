class trick{
	public static void main(String []args){
	int n=5;
	int r,c,s,k;
	for(r=1;r<=n;r++){
	for(s=1;s<=n-r;s++){System.out.print(" ");}
	for(c=1;c<=r;c++){System.out.print("*");}
	for(k=2;k<=r;k++){System.out.print("*");}
	System.out.println();
	}
	}
}