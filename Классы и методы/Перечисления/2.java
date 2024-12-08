public enum CoffeeType {
    ESPRESSO(100, 50),  //цена за порцию, объем 
    LATTE(150, 300),
    CAPPUCCINO(160, 250),
    AMERICANO(120, 200),
    MOCHA(180, 350);

    private final int price;   
    private final int volume; 
    //конструктор
    CoffeeType(int price, int volume) {
        this.price = price;
        this.volume = volume;
    }
  
    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    //метод для расчета стоимости за 100 мл
    public double costPer100ml() {
        return (double) price / volume * 100;
    }
}
