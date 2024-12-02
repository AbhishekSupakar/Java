class FindSecondMax
{
    public static void main(String[] args)
    {
        /*
        Q - 13
        String[] arr = {"Java", "is","a","programming","language"};
        String res = String.join("100",arr);
        System.out.println(res);
       
        Q-15
       
        String s  = "Umbrella";
        char[] arr = s.toCharArray();
        String res = "";
        for(int i = arr.length-1;i>=0;i--) {
         //System.out.print(arr[i]);
         res+=arr[i];
        }
        System.out.println(s);
        System.out.println(res);
       
        //Q - 16
        for(int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
       
       
       
        String s = "rythm";
        int index = -1;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i' ||ch=='o' || ch=='u'){
                index = i;
                break;
            }
        }
        if(index!=-1)
        System.out.println("Index :"+index);
        else
        System.out.println("No vowel present");
       
        Q-22
       
        String s = "KARTHIKEYA NAIDU";
        String [] arr = s.split(" ");// 0 -> KARTHIKEYA 1 -> NAIDU
        String res = arr[0].charAt(0)+". "+arr[1];
        System.out.println(res);
       
        q - 24
       
        String s = "RYTHM";
        int index = 0; // index = 0
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='A' || ch=='E'||ch=='I' ||ch=='O' || ch=='U'){
                index = i;
                break;
            }
        }
        //             APPLEAY
        String res = s.substring(index) + s.substring(0,index)+"AY";
        System.out.println(res);
        */
        /*
       
        Ques - 25
        A->C  -> 65+2  = 67
        B->D  -> 66+2 = 68
        X->Z  -> 88+2 = 90
       
        Y->A  -> 89+2 = 91-26 = 65
        Z->B  -> 90+2 = 92-26 = 66
       
       
       
        */
       
        String s = "XYZ";
        String res = "";
        //
        for(int i = 0;i<s.length();i++){
            int total = s.charAt(i)+2;
            if(total>90){
                res+=(char)(total-26);
            }else {
                res+=(char)total;
            }
        }
        System.out.println(s);
        System.out.println(res);
       
       
       
       
           
       
    }
}