import java.util.Scanner;

/**
 * Armstrong
 */
 interface Armstrong {
    String isArmstrong(int n);
}
class ArmstrongImpln implements Armstrong{
    public String isArmstrong(int a){
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
		return "Armstrong number";
	}
	return "Not an Armstrong number";
    }
}

class ArmstrongDriver{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(new ArmstrongImpln().isArmstrong(n));
		sc.close();
	}
}
