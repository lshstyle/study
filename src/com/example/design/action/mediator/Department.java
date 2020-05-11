package com.example.design.action.mediator;

public interface Department {

	void selfAction();

	void outAction();
}

class Development implements Department {
	private Mediator mediator;

	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("开发项目");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("缺乏研发资金");
	}

}

class Market implements Department {
	private Mediator mediator;

	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("market", this);
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("缺少开拓市场资金");
		mediator.command("finacial");
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("接项目");
	}

}

class Finacial implements Department {
	private Mediator mediator;

	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("管理资金");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("转账汇款");
	}

}
