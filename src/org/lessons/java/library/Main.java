package org.lessons.java.library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static final String FILE_PATH = "A:\\Mirko pc\\Boolean\\Java\\java-exceptions-books\\books.txt";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Libro[] books = null;
		FileWriter myWriter = null;
		boolean isValid = false;
		
		
		while(!isValid) {
			
			try {
				System.out.print("How many books do you want? ");
				int booksIndex = Integer.valueOf(sc.nextLine());
				books = new Libro[booksIndex];
				isValid = true;
				
			} catch (Exception e) {
				
				System.out.println("Invalid value, try again");
				continue;
			}
		}
		
		
		for(int i = 0; i < books.length; i ++) {
			
			System.out.println("Book n." + (i + 1));
			
			System.out.print("Enter the title: ");
			String title = sc.nextLine();
			
			System.out.print("Enter the number of pages");
			int numberPage = Integer.valueOf(sc.nextLine());
			
			System.out.print("Enter the author: ");
			String author = sc.nextLine();
			
			System.out.print("Enter the publisher: ");
			String publisher = sc.nextLine();
			
			
			///WRITING
			try {
				
				books[i] = new Libro(title, numberPage, author, publisher);
				
			} catch (Exception e) {
				
				System.err.println(e.getMessage());
				i--;
			}
			
			try {
				
				myWriter = new FileWriter(FILE_PATH, true);
				myWriter.write(books[i].toString());
				
			} catch (IOException e) {
				
				System.err.println("writing error" + e.getMessage());
				
			} finally {
				
				try {
					
					myWriter.close();
					
				}catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		sc.close();
		
		///READING
		File booksFile = new File(FILE_PATH);
		Scanner reader = null;
		
		try {
			
			reader = new Scanner(booksFile);
			
			while (reader.hasNextLine()) {
				
				String line = reader.nextLine();
				System.out.println(line);
			}
		} catch (Exception e) {
			
			System.out.println("Reading error" + e.getMessage());
			
		} finally {
			
			if (reader != null)
				
				reader.close();
		}
	}
}
