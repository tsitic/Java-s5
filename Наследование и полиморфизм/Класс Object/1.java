class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение ссылки
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка null и типа
        Product product = (Product) obj; // Приведение к типу Product
        return Double.compare(product.price, price) == 0 && name.equals(product.name); // Сравнение полей
    }
}
public class Main {
  public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000.50);
        Product product2 = new Product("Laptop", 1000.50);
        Product product3 = new Product("Phone", 799.99);

        System.out.println(product1.equals(product2)); // true
        System.out.println(product1.equals(product3)); // false
        System.out.println(product1.equals(null)); // false
    }
}
/*
 При реализации метода equals() важно следовать определенным соглашениям:
Симметричность: Если объект A равен объекту B, то объект B должен быть равен объекту A.
Транзитивность: Если A равно B и B равно C, то A должно быть равно C.
Консистентность: Многоразовые вызовы метода equals() для одного и того же объекта должны возвращать одно и то же значение, если поля не изменяются.
Неравенство с null: Любой объект не должен быть равен null.
*/
