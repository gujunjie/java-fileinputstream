package project11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Text {

	public static void main(String[] args) {
		
		File file=new File("d:\\abc\\abc.txt");
		
		
		FileInputStream fis=null;//字节流：fileinputStream
		try {
			fis = new FileInputStream(file);
			
			int b;//read方法一次读取一个字节并返回，如果返回-1，那么已经读到文件的末尾
			while((b = fis.read())!=-1)
			{
				System.out.print((char)b);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null)
		{
			try {
				fis.close();//使用完io流后记得把流关掉，释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
		
		System.out.println();
		
		/*
		 * 上面那种方法可以完整的读取文件中的内容，但是一次只能读取一个字节，如果文件很大，那么
		 * 频繁的io操作会影响程序的性能，所以应当采取以下方法改进
		 */
		
		File file2=new File("d:\\abc\\hij.txt");
		FileInputStream fis2=null;
		try {
			fis2=new FileInputStream(file2);
			
			byte[] b=new byte[6];//定义一个byte数组，把每次读取到的字节存入数组，数组长度即为每次应该读取的长度
			int len=0;//实际读取中每次读取到的字节长度
			while((len=fis2.read(b))!=-1)//通过这种方法可以减少io操作，提高性能
			{
				for(int i=0;i<len;i++)
				{
					System.out.print((char)b[i]);
				}
			}
		}  catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis2!=null)
			{
				try {
					fis2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		

	}

}
