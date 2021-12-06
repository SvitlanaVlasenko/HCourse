package com.company.homework12.cofee.order;

import com.company.homework11.phonebook.Record;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders = new LinkedList<>();

    /**
     * 3.Реализовать метод add в классе CoffeeOrderBoard. Данный метод добавляет новый заказ и присваивает заказу номер (натуральный порядок).
     * Натуральный порядок (natural ordering) означенает, что если у последнего заказа номер 86, то следущий будет 87.
     * Не может быть такой ситуации, что номер повторяется в рамках одного объекта типа CoffeeOrderBoard.
     */

    public void add(String name) {
        orders.add(new Order(orders.size() + 1, name));
    }
    /**4.Реализовать метод deliver в классе CoffeeOrderBoard. Данный метод выдает ближайший на очереди заказ.
     Выдача сопровождается удалением заказа с списка.*/

    public Order deliver(){
        return ((LinkedList<Order>) orders).pollFirst();
    }
    /**Реализовать метод deliver в классе CoffeeOrderBoard. Данный метод выдает заказ с определенным номеров.
     Выдача сопровождается удалением заказа с списка.
     Данный метод обслуживает ситуацию, когда заказ поступивший позже готов раньше.*/

    public Order deliverdelite(int number){
        Order order =find(number);
        orders.remove(order);
        return order;
    }
    
    private Order find(int number){
        LinkedList<Order> linkedOrders = ((LinkedList<Order>) orders);
        for (Order order: linkedOrders) {
            if (order.getNumber() == number){
                return order;
            }
        }
        return null;
    }

}
