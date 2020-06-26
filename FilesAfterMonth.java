import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FilesAfterMonth 
{
	public static void main(String[] args) 
	{
		String loc;
		int mon;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the location: ");
		loc=sc.next();
		System.out.println("Enter month: ");
		mon=sc.nextInt();
		
		File f=new File(loc);
		String fna[]=f.list();
		for(int i=0;i<fna.length;i++)
		{
			File ff=new File(loc,fna[i]);
			Date dd=new Date(ff.lastModified());
			
			int m=dd.getMonth();
			m++;
			if(m>=mon)
			{
				System.out.println(fna[i]);
			}
		}
	}
}
