package book;

import java.io.File;

public class OldBookDeleter{
	public void delete(){
		
		File oldFile = new File(ConstansBook.OLD_DAT_URL);
		
		 if (oldFile.exists()){
		      if (oldFile.delete()){
		        System.out.println("ファイルを削除しました");
		      }else{
		        System.out.println("ファイルの削除に失敗しました");
		      }
		    }else{
		      System.out.println("oldファイルが見つかりません");
		    }
	}
	
	
	
	
	
}