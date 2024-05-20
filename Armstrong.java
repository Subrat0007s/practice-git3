/**
 * Armstrong
 */
 interface Armstrong {
    int isArmstrong(int n);
}
class ArmstrongImpln implements Armstrong{
     public int isArmstrong(int a){
	int t=a,len=0;
		while (t!=0){
			t=t/10;
			len++;
		}
		int arm=0, t1=a,rem=0;
		while(t1!=0){
			rem=t1%10;
			int mul=1;
			for(int i=0;i<len;i++){
				mul=mul*rem;
			}
			arm=arm+mul;
			t1=t1/10;
		}
		if(a==arm){
		System.out.println("ArmStrong Number");
		}
     }
}

