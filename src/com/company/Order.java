package com.company;

public class Order extends Box{
    private Box boxObject;
    private int quantity; // number of boxes to be created
    private int code; // color code of boxes to be created
    private static int totalQuantity;

    Order(Box boxObject,int quantity,int code)
    {
        this.boxObject = boxObject;
        this.quantity = quantity;
        this.code = code;
        // Total Number of Orders
        totalQuantity = totalQuantity + quantity;
    }
    public static int getTotalQuantity()
    {
        return totalQuantity;
    }
}
