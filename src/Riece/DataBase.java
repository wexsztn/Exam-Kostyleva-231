package Riece;

import java.sql.*;

public class DataBase {
        private final String host = "localhost";
        private final String port = "5432";
        private final String dbName = "test10";
        private final String login = "postgres";
        private final String password = "";

        private Connection dbCon;

        private Connection getDbConnection() throws ClassNotFoundException, SQLException {
            String str = "jdbc:postgresql://" + host + ":" + port + "/" + dbName;
            Class.forName("org.postgresql.Driver");
            dbCon = DriverManager.getConnection(str, login, password);
            return dbCon;
        }

        public void isConnection() throws SQLException, ClassNotFoundException {
            dbCon = getDbConnection();
            System.out.println("база данных подключена");
        }

        public void createTableReices(String reice) throws ClassNotFoundException, SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS " + reice
                    + " (id INT PRIMARY KEY, reice_name VARCHAR(30), reice_mesta VARCHAR(20));";
            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate(sql);
                System.out.println("таблица создалась");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void addValues(String reice, String values) {
            try {
                Statement statement = getDbConnection().createStatement();
                statement.executeUpdate("INSERT INTO " + reice + " VALUES(" + values + ");");
                System.out.println("добавлено");

            } catch (Exception e) {
                System.out.println("не удалось добавить");;
            }
        }

        public void selectTableReices(String reice) throws SQLException, ClassNotFoundException {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + reice);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String order_name = resultSet.getString(2);
                String reice_mesta = resultSet.getString(3);
                System.out.printf("%d. %s. %s \n", id, order_name, reice_mesta);
            }
        }

        public void selectTableReicesWhere(String reice) throws SQLException, ClassNotFoundException {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from " + reice + " WHERE reice_mesta = 'свободно'");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String reice_name = resultSet.getString(2);
                String reice_mesta = resultSet.getString(3);
                System.out.printf("%d. %s. %s \n", id, reice_name, reice_mesta);
            }
        }

    }
