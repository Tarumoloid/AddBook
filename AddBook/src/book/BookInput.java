package book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class BookInput{
  public void input(String a) throws IOException{
    
      File file = new File(ConstansBook.OLD_DAT_URL);

      //下で書き込めることを証明したから、IOException投げる可能性あるよって書くのは冗長？
      if (checkBeforeWritefile(file)){
        FileWriter filewriter = new FileWriter(file, true);
       
        String commandLine = ConstansBook.SPACE + a;
        
        System.out.println("引数で与えられた本情報です");
        System.out.println(commandLine);
        
        filewriter.write(commandLine);


        filewriter.close();
      }else{
        System.out.println("ファイルに書き込めません");
      }
   
  }

  private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }
}