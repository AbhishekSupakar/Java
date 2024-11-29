class pattern{
	public static void main(String []args){
		int n=5;
		int a,r,c;
		for(r=1;r<=n;r++){
			a=r;
			for(c=1;c<=n;c++){
				System.out.printf("%3d",r*c);
			}
			System.out.println();
		}
	}
}