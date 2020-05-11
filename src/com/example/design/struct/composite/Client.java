package com.example.design.struct.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Folder folder = new Folder("我的收藏");
		AbstractFile image = new ImageFile("abc.jps");
		AbstractFile text = new TextFile("123.text");
		
		Folder folder1 = new Folder("文章");
		AbstractFile text1 = new TextFile("一篇日记");
		folder.add(image);
		folder.add(text);
		folder.add(folder1);
		folder1.add(text1);
		folder.killVirus();
		
	}

}
