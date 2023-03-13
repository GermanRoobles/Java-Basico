public class SmartDevice {
    String marca;
    String modelo;
    String color;

    public SmartDevice (String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public SmartDevice () {
    }

    public static class SmartPhone extends SmartDevice {
        int ram;
        String sistema;

        public SmartPhone () {
            super();
        }

        public SmartPhone (String marca, String modelo, String color, int ram, String sistema) {
            super(marca, modelo, color);
            this.ram = ram;
            this.sistema = sistema;
        }

        @Override
        public String toString() {
            return "marca= " + marca +
                    ", modelo= " + modelo +
                    ", color= " + color +
                    ", ram= " + ram +
                    ", sistema= " + sistema;
        }
    }

    public static class SmartWatch extends SmartDevice {
        double pulgadas;
        String conectividad;

        public SmartWatch () {
            super();
        }

        public SmartWatch (String marca, String modelo, String color, double pulgadas, String conectividad) {
            super(marca, modelo, color);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }

        @Override
        public String toString() {
            return "marca= " + marca +
                    ", modelo= " + modelo +
                    ", color= " + color +
                    ", pulgadas= " + pulgadas +
                    ", conectividad= " + conectividad;
        }
    }

    public static void main(String[] args) {
        SmartPhone SmartPhone = new SmartPhone("Xiaomi", "Poco X5", "negro", 16, "android");
        SmartWatch SmartWatch = new SmartWatch("Xiaomi", "Mi Band 6", "negro", 8, "Bluetooth");

        System.out.println("El SmartPhone es: " + SmartPhone + "El SmartWatch es: " + SmartWatch);

    }
}
