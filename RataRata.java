import java.util.Scanner;
	public class RataRata{
		public static void main(String[]args){
		int bil,n;
		double x,jml,rata;
		Scanner scan=new Scanner(System.in);
		System.out.print("Masukkan nilai N: ");
		n=scan.nextInt();
		jml=0;
		for(bil=1;bil<=n;bil++)
		{
		System.out.print("Masukkan nilai x : ");
		x=scan.nextDouble();
		jml=jml+bil;
		}
		System.out.println("jumlah ="+jml);
		rata=jml/n;
		System.out.println("rata ="+rata);
		}
		}
		