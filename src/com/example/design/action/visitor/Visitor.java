package com.example.design.action.visitor;

public interface Visitor {

	void visitor(Manager manager);
	

	void visitor(Engineer engineer);
	
}

class CEOVisitor implements Visitor {
    @Override
    public void visitor(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", KPI: " + engineer.getKpi());
    }

    @Override
    public void visitor(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", KPI: " + manager.getKpi() +
                ", 新产品数量: " + manager.getProducts());
    }

}

