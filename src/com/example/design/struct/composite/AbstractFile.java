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
		System.out.println("图片:" + name + " 查杀");
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
		System.out.println("视频:" + name + " 查杀");
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
		System.out.println("文本:" + name + " 查杀");
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
