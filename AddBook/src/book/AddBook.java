package book;

import java.io.File;
import java.io.IOException;


public class AddBook {

	String inputBookData;

	public static void main(String[] args) {

		if (args.length != 9) {
			System.out.println("�{������͂��Ă�������");
			System.exit(1);
		} else {

			File datFile = new File(ConstansBook.DAT_URL);
			File oldFile = new File(ConstansBook.OLD_DAT_URL);


			// ��������old�t�@�C��������̂Ȃ�����Ă����B
			if (oldFile.exists()) {

				OldBookDeleter del = new OldBookDeleter();
				del.delete();


			}if (datFile.exists()) {
				// �����Ńt�@�C����ǂݍ���
				BookReader bookRead = new BookReader();
				
			try{
				
				//��O�����ABookReader�����O���������B�����Ŏ󂯎���B
				 bookRead.reader(ConstansBook.DAT_URL);
			}catch(IOException e){
				
				System.out.println("�t�@�C����������܂���");
				
			}

				// �R�}���h������1�Ԗڂ��uM�v�̂Ƃ�
				if (args[0].equals(ConstansBook.MAGAZINE)) {


					//�悭�悭�l������bean��������Ӗ����Ȃ������E�E�E���P����Ƃ��͐������悤�ɂ��܂�
					BookBean bb = new BookBean();
					bb.setArgument(args[0]);
					bb.setmName(args[1]);
					bb.setmCompany(args[2]);
					bb.setmPrice(args[3]);

					// ���t�̏����B�����������C���������ł��E�E�E
					String year = args[4];
					String month = args[5];
					String day = args[6];
					StringBuilder sb = new StringBuilder();
					sb.append(year);
					sb.append(ConstansBook.SLASH);
					sb.append(month);
					sb.append(ConstansBook.SLASH);
					sb.append(day);

					String perfectDay = new String(sb);

					bb.setmDay(perfectDay);
					bb.setmCode(args[7]);
					bb.setmNumber(args[8]);

					StringBuilder plusColon = new StringBuilder();

					String name = bb.getmName();
					String company = bb.getmCompany();
					String price = bb.getmPrice();
					String perfectday = bb.getmDay();
					String code = bb.getmCode();
					String number = bb.getmNumber();

					// �u:�v�Ɓu �v��ǉ����Ă����B�����̏������Ȃ�Ƃ��������E�E�E
					plusColon.append(ConstansBook.NAME);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(name);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.COMPANY);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(company);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.PRICE);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(price);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.PUBLISH_DAY);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(perfectday);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.MAGAZINE_CODE);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(code);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.MAGAZINE_NUMBER);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(number);
					plusColon.append(ConstansBook.SPACE);

					String inputBookData = new String(plusColon);

	
					bb.setCommandLineMagazine(inputBookData);

					BookInput input = new BookInput();
					try{
						input.input(bb.getCommandLineMagazine());
					}catch(IOException e){
						
						System.out.println("�t�@�C����������܂���ł���");
						
					}
					
					
					

					// �R�}���h������1�Ԗڂ��uB�v�̂Ƃ�
				} else if (args[0].equals(ConstansBook.BOOK)){


					BookBean bb = new BookBean();
					bb.setArgument(args[0]);
					bb.setbName(args[1]);
					bb.setbCompany(args[2]);
					bb.setbPrice(args[3]);

					// ���t�̏����B�����������C���������ł��E�E�E
					String year = args[4];
					String month = args[5];
					String day = args[6];
					StringBuilder sb = new StringBuilder();
					sb.append(year);
					sb.append(ConstansBook.SLASH);
					sb.append(month);
					sb.append(ConstansBook.SLASH);
					sb.append(day);

					String perfectDay = new String(sb);

					bb.setbDay(perfectDay);
					bb.setbAuthor(args[7]);
					bb.setbISBN(args[8]);

					StringBuilder plusColon = new StringBuilder();

					String name = bb.getbName();
					String company = bb.getbCompany();
					String price = bb.getbPrice();
					String perfectday = bb.getbDay();
					String author = bb.getbAuthor();
					String isbn = bb.getbISBN();

					// �u:�v�Ɓu �v��ǉ����Ă����B�����̏������Ȃ�Ƃ��������E�E�E
					plusColon.append(ConstansBook.NAME);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(name);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.COMPANY);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(company);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.PRICE);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(price);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.PUBLISH_DAY);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(perfectday);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.BOOK_AUTHOR);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(author);
					plusColon.append(ConstansBook.SPACE);

					plusColon.append(ConstansBook.BOOK_ISBN);
					plusColon.append(ConstansBook.COLON);
					plusColon.append(isbn);
					plusColon.append(ConstansBook.SPACE);

					String inputBookData = new String(plusColon);

					bb.setCommandLineBook(inputBookData);

					BookInput input = new BookInput();
					
					try{
					input.input(bb.getCommandLineBook());
					}catch(IOException e){
						
						System.out.println("�t�@�C����������܂���ł���");
						
					}

				}



			}
		}
	}
}



		