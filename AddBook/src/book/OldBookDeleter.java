package book;

import java.io.File;

public class OldBookDeleter{
	public void delete(){
		
		File oldFile = new File(ConstansBook.OLD_DAT_URL);
		
		 if (oldFile.exists()){
		      if (oldFile.delete()){
		        System.out.println("�t�@�C�����폜���܂���");
		      }else{
		        System.out.println("�t�@�C���̍폜�Ɏ��s���܂���");
		      }
		    }else{
		      System.out.println("old�t�@�C����������܂���");
		    }
	}
	
	
	
	
	
}