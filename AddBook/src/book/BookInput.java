package book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class BookInput{
  public void input(String a) throws IOException{
    
      File file = new File(ConstansBook.OLD_DAT_URL);

      //���ŏ������߂邱�Ƃ��ؖ���������AIOException������\���������ď����̂͏璷�H
      if (checkBeforeWritefile(file)){
        FileWriter filewriter = new FileWriter(file, true);
       
        String commandLine = ConstansBook.SPACE + a;
        
        System.out.println("�����ŗ^����ꂽ�{���ł�");
        System.out.println(commandLine);
        
        filewriter.write(commandLine);


        filewriter.close();
      }else{
        System.out.println("�t�@�C���ɏ������߂܂���");
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