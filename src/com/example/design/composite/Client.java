package com.example.design.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Folder folder = new Folder("�ҵ��ղ�");
		AbstractFile image = new ImageFile("abc.jps");
		AbstractFile text = new TextFile("123.text");
		
		Folder folder1 = new Folder("С˵");
		AbstractFile text1 = new TextFile("Ц������");
		folder.add(image);
		folder.add(text);
		folder.add(folder1);
		folder1.add(text1);
		folder.killVirus();
		
	}

}
