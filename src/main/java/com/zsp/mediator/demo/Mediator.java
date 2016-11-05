package com.zsp.mediator.demo;

/**
 * Created by zsp-pc on 2016/11/3.
 */
public class Mediator extends AbstractMediator {

    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")) {
            this.buyComputer((Integer)objects[0]);
        } else if(str.equals("sale.sell")) {
            this.sellComputer((Integer)objects[0]);
        } else if(str.equals("sale.offsell")) {
            this.offsell();
        } else if(str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        int buyNumber = 0;
        if(saleStatus <= 80) {
            buyNumber = number/2;
        }
        System.out.println("采购IBM电脑:" + buyNumber + "台");
        super.stock.increase(number);
    }

    private void sellComputer(int number) {
        if(super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offsell() {
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}
