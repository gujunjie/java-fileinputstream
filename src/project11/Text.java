package project11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Text {

	public static void main(String[] args) {
		
		File file=new File("d:\\abc\\abc.txt");
		
		
		FileInputStream fis=null;//�ֽ�����fileinputStream
		try {
			fis = new FileInputStream(file);
			
			int b;//read����һ�ζ�ȡһ���ֽڲ����أ��������-1����ô�Ѿ������ļ���ĩβ
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
				fis.close();//ʹ����io����ǵð����ص����ͷ���Դ
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
		
		System.out.println();
		
		/*
		 * �������ַ������������Ķ�ȡ�ļ��е����ݣ�����һ��ֻ�ܶ�ȡһ���ֽڣ�����ļ��ܴ���ô
		 * Ƶ����io������Ӱ���������ܣ�����Ӧ����ȡ���·����Ľ�
		 */
		
		File file2=new File("d:\\abc\\hij.txt");
		FileInputStream fis2=null;
		try {
			fis2=new FileInputStream(file2);
			
			byte[] b=new byte[6];//����һ��byte���飬��ÿ�ζ�ȡ�����ֽڴ������飬���鳤�ȼ�Ϊÿ��Ӧ�ö�ȡ�ĳ���
			int len=0;//ʵ�ʶ�ȡ��ÿ�ζ�ȡ�����ֽڳ���
			while((len=fis2.read(b))!=-1)//ͨ�����ַ������Լ���io�������������
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
