package com.example.design.struct.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {

	void killVirus();
	
}

class ImageFile implements AbstractFile {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("ͼƬ�ļ�:" + name + " ��ɱ");
	}
	
	
}

class VideoFile implements AbstractFile {
	private String name;

	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("��Ƶ�ļ�:" + name + " ��ɱ");
	}
	
}

class TextFile implements AbstractFile {
	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("�ı��ļ�:" + name + " ��ɱ");
	}
	
}


class Folder implements AbstractFile {
	private String name;

	List<AbstractFile> list = new ArrayList<>();
	public Folder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("�ļ���:" + name + " ��ɱ");
		
		for (AbstractFile f : list) {
			f.killVirus();
		}
	}
	
	public void add(AbstractFile f) {
		list.add(f);
	}
	
}
