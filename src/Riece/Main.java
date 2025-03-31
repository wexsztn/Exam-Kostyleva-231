package Riece;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();

        db.createTableReices("reice");

        db.addValues("reice","1, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","2, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","3, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","4, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","5, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","6, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","7, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","8, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","9, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","10, 'Москва-Дубаи', 'занято'");

        db.addValues("reice","11, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","12, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","13, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","14, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","15, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","16, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","17, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","18, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","19, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","20, 'Москва-Дубаи', 'занято'");

        db.addValues("reice","21, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","22, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","23, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","24, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","25, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","26, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","27, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","28, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","29, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","30, 'Москва-Дубаи', 'занято'");

        db.addValues("reice","31, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","32, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","33, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","34, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","35, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","36, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","37, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","38, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","39, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","40, 'Москва-Дубаи', 'занято'");

        db.addValues("reice","41, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","42, 'Москва-Дубаи', 'свободно'");
        db.addValues("reice","43, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","44, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","45, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","46, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","47, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","48, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","49, 'Москва-Дубаи', 'занято'");
        db.addValues("reice","50, 'Москва-Дубаи', 'занято'");


        System.out.println("Все брони:");
        db.selectTableReices("reice");
        System.out.println("----------------");
        System.out.println("Свободные места:");
        db.selectTableReicesWhere("reice");
    }
}
