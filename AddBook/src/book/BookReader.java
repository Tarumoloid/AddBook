package book;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookReader{



	public String[] reader(String a) throws IOException{

		String[] bookBunkatsu = null;


		ArrayList<String> bookData = new ArrayList<>();
	
			bookData = (ArrayList<String>) Files.readAllLines(Paths.get(a),Charset.defaultCharset());


			if(bookData.size() >0){

				//System.out.println(bookData.get(0));

				String book = bookData.get(0);

				bookBunkatsu = book.split(" ");

				String year = bookBunkatsu[4];
				String month = bookBunkatsu[5];
				String day = bookBunkatsu[6];
				StringBuilder sb = new StringBuilder();
				sb.append(year);
				sb.append(ConstansBook.SLASH);
				sb.append(month);
				sb.append(ConstansBook.SLASH);
				sb.append(day);
				String perfectDay = new String(sb);
				//System.out.println("perfectDayをチェック"+perfectDay);

				if(bookBunkatsu[0].equals("B")){
					
					System.out.println("datファイルから入力されたBook情報です");
					System.out.print(ConstansBook.NAME + ConstansBook.COLON +bookBunkatsu[1] + ConstansBook.SPACE);
					System.out.print(ConstansBook.COMPANY + ConstansBook.COLON +bookBunkatsu[2] + ConstansBook.SPACE);
					System.out.print(ConstansBook.PRICE + ConstansBook.COLON + bookBunkatsu[3] + ConstansBook.SPACE);
					System.out.print(ConstansBook.PUBLISH_DAY + ConstansBook.COLON + perfectDay + ConstansBook.SPACE);
					System.out.print(ConstansBook.BOOK_AUTHOR + ConstansBook.COLON + bookBunkatsu[7] + ConstansBook.SPACE);
					System.out.print(ConstansBook.BOOK_ISBN + ConstansBook.COLON + bookBunkatsu[8] + ConstansBook.SPACE);

				}else{
					
					System.out.println("datファイルから入力されたMagazine情報です");
					System.out.print(ConstansBook.NAME + ConstansBook.COLON +bookBunkatsu[1] + ConstansBook.SPACE);
					System.out.print(ConstansBook.COMPANY + ConstansBook.COLON +bookBunkatsu[2] + ConstansBook.SPACE);
					System.out.print(ConstansBook.PRICE + ConstansBook.COLON + bookBunkatsu[3] + ConstansBook.SPACE);
					System.out.print(ConstansBook.PUBLISH_DAY + ConstansBook.COLON + perfectDay + ConstansBook.SPACE);
					System.out.print(ConstansBook.MAGAZINE_CODE + ConstansBook.COLON + bookBunkatsu[7] + ConstansBook.SPACE);
					System.out.print(ConstansBook.MAGAZINE_NUMBER + ConstansBook.COLON + bookBunkatsu[8] + ConstansBook.SPACE);


				}


				//変更前ファイル名
				File fileA = new File(a);

				//変更後のファイル名
				File fileB = new File(ConstansBook.OLD_DAT_URL);


				if(fileA.renameTo(fileB)){
					//ファイル名変更成功
					System.out.println("ファイル名変更成功");


				}else{
					//ファイル名変更失敗
					System.out.println("ファイル名変更失敗");



				}

			}else{

				System.out.println("なにもないっすね");


			}


		return bookBunkatsu;
	}

}