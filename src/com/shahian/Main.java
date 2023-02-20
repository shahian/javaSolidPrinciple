package com.shahian;

import com.shahian.dip.EmailService;
import com.shahian.dip.MessageService;
import com.shahian.dip.Notification;
import com.shahian.dip.SMSMessageService;
import com.shahian.srp.NotOk;
import com.shahian.isp.CircleIsp;
import com.shahian.isp.RectangleIsp;
import com.shahian.lsp.RectangleLsp;
import com.shahian.lsp.ShapeLsp;
import com.shahian.lsp.SquareLsp;
import com.shahian.ocp.*;
import com.shahian.srp.Ok;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        srp();
        ocp();
        lsp();
        isp();
        dip();
    }

    private static void srp() {
        NotOk notOk = new NotOk();
        notOk.university();

        Ok ok = new Ok();
        ok.university();
    }

    private static void ocp() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        shapes.add(new Square());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private static void lsp() {
        ShapeLsp shape1 = new RectangleLsp(5, 10);
        ShapeLsp shape2 = new SquareLsp(7);
        System.out.println("Area of shape1: " + shape1.calculateArea()); // Output: Area of shape1: 50
        System.out.println("Area of shape2: " + shape2.calculateArea()); // Output: Area of shape2: 49
    /*  shape1 and shape2 are objects of different classes,
          but they can be used interchangeably because they both inherit from Shape and implement calculateArea() method.*/

    }

    private static void isp() {
        CircleIsp circleIsp = new CircleIsp(5L);
        RectangleIsp rectangleIsp = new RectangleIsp(5L, 8L);
        System.out.println(circleIsp.getArea());
        System.out.println(rectangleIsp.getArea());
    }

    private static void dip() {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSMessageService();

        Notification emailNotification = new Notification(emailService);
        Notification smsNotification = new Notification(smsService);

        emailNotification.sendNotification("Hello, this is an email notification!");
        smsNotification.sendNotification("Hello, this is an SMS notification!");
    }


}
