/*  作成者:樽本  */

package book;

import java.io.Serializable;

public class BookBean implements Serializable {
	
	//今のところ　まったく無意味なbeanたち
	
	//Book情報たち
	private String bName;
	private String bCompany;
	private String bPrice;
	private String bDay;
	private String bAuthor;
	private String bISBN;
	
	//Magazine情報たち
	private String mName;
	private String mCompany;
	private String mPrice;
	private String mDay;
	private String mCode;
	private String mNumber;
	
	//コマンドライン引数から完成されたbook情報
	private String commandLineBook;
	//コマンドライン引数から完成されたMagazine情報
	private String commandLineMagazine;
	
	//コマンドライン引数の第一引数の情報
	private String argument;
	
	
	
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbCompany() {
		return bCompany;
	}
	public void setbCompany(String bCompany) {
		this.bCompany = bCompany;
	}
	public String getbPrice() {
		return bPrice;
	}
	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	public String getbDay() {
		return bDay;
	}
	public void setbDay(String bDay) {
		this.bDay = bDay;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbISBN() {
		return bISBN;
	}
	public void setbISBN(String bISBN) {
		this.bISBN = bISBN;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmCompany() {
		return mCompany;
	}
	public void setmCompany(String mCompany) {
		this.mCompany = mCompany;
	}
	public String getmPrice() {
		return mPrice;
	}
	public void setmPrice(String mPrice) {
		this.mPrice = mPrice;
	}
	public String getmDay() {
		return mDay;
	}
	public void setmDay(String mDay) {
		this.mDay = mDay;
	}
	public String getmCode() {
		return mCode;
	}
	public void setmCode(String mCode) {
		this.mCode = mCode;
	}
	public String getmNumber() {
		return mNumber;
	}
	public void setmNumber(String mNumber) {
		this.mNumber = mNumber;
	}
	public String getCommandLineBook() {
		return commandLineBook;
	}
	public void setCommandLineBook(String commandLineBook) {
		this.commandLineBook = commandLineBook;
	}
	public String getCommandLineMagazine() {
		return commandLineMagazine;
	}
	public void setCommandLineMagazine(String commandLineMagazine) {
		this.commandLineMagazine = commandLineMagazine;
	}
	public String getArgument() {
		return argument;
	}
	public void setArgument(String argument) {
		this.argument = argument;
	}
	

	
	
	
	
}
