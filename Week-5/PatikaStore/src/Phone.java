import java.util.*;

public class Phone extends Product implements IOperation{
    private int camera;
    private int batteryCapacity;
    private String color;
    public Phone(int id, String name, double price, double discountRate, int stock, int camera, int batteryCapacity, String color, String brandName, int screenSize, int ram, int memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public Phone(){
    }
    static List<Phone> phones = new ArrayList<>();
    static {
        phones.add(new Phone(3,"Samsung Galaxy S9", 4999,10,70,24,5000,"Blue","Samsung", 8, 8, 64));
        phones.add(new Phone(2,"Iphone 11 64 GB", 7399,8,80,64,2000,"Black","Iphone", 6, 12, 256));
        phones.add(new Phone(1,"Samsung Galaxy A51", 3199,15,100,32,3000,"White","Samsung", 5, 6, 128));
    }

    @Override
    public void runMenu() {
        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("######################################");
            System.out.println("Phone Yönetim Paneli");
            System.out.println("1 - Phone ekleme \n" +
                    "2 - Phone silme \n" +
                    "3 - Id ye göre filtreleme \n" +
                    "4 - Markaya göre filtreleme \n" +
                    "5 - Phone listeleme \n" +
                    "0 - Üst menüye dön ");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addProduct();      //Phone adding
                    break;
                case 2:
                    deleteProduct();    //Phone deleting
                    break;
                case 3:
                    filterByProductId();    //Filter by ID
                    break;
                case 4:
                    filterByProductBrand();    //Filter by ID
                    break;
                case 5:
                    showProductList();      //Show the phone list
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }
    }

    @Override
    public void showProductList() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-22s %-10s %-12s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Camera", "| Ekran", "| RAM", "| Pil", "| Renk", "| Stok", "| İndirim    |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone phone : phones){
            System.out.printf("  %-6s %-22s %-10s %-12s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrandName(),
                    phone.getMemory(), phone.getCamera(), phone.getScreenSize(), phone.getRam(),
                    phone.getBatteryCapacity(), phone.getColor(), phone.getStock(), phone.getDiscountRate());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    @Override
    public void addProduct() {
        System.out.println("Eklemek istediğiniz ürünün özelliklerini giriniz : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürünün adını giriniz : ");
        String name = scanner.nextLine();

        System.out.print("Ürünün fiyatını giriniz : ");
        int price = scanner.nextInt();

        System.out.print("Ürünün markasını giriniz : ");
        String brand = scanner.next();

        System.out.print("Ürünün kamera bilgisini giriniz : ");
        int camera = scanner.nextInt();

        System.out.print("Ürünün ekran boyutunu(inç) giriniz : ");
        int screenSize = scanner.nextInt();

        System.out.print("Ürünün ram bilgisini giriniz : ");
        int ram = scanner.nextInt();

        System.out.print("Ürünün pil kapasitesini giriniz : ");
        int batteryCapacity = scanner.nextInt();

        System.out.print("Ürünün rengini giriniz : ");
        String color = scanner.next();

        System.out.print("Ürünün stok bilgisini giriniz : ");
        int stock = scanner.nextInt();

        System.out.print("Ürünün indirim oranını giriniz : ");
        int discountRate = scanner.nextInt();

        System.out.print("Ürünün hafızasını giriniz : ");
        int memory = scanner.nextInt();

        int id = phones.size() + 1;

        phones.add(new Phone(id, name, price, discountRate, stock, camera, batteryCapacity, color, brand, screenSize, ram, memory));
    }

    @Override
    public void deleteProduct() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen silmek istediğiniz ID yi seçiniz : ");
        int delete = scanner.nextInt();
        if (delete <= phones.size() && delete > 0) {
            Phone deletePhone = findPhoneById(delete);
            phones.remove(deletePhone);
            System.out.println("Seçiminiz silindi.");
        }
        else {
            System.out.println("Yanlış seçim yaptınız.");
        }
    }
    @Override
    public void filterByProductId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ürünün id bilgisini giriniz : ");
        int id = scanner.nextInt();

        if (phones.contains(findPhoneById(id))){
            showProduct(findPhoneById(id));
        }
        else {
            System.out.println("Ürün bulunamamıştır.");
        }
    }
    @Override
    public void filterByProductBrand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ürünün markasını giriniz : ");
        String brand = scanner.next().toLowerCase();
        if (phones.contains(findPhoneByBrand(brand))){
            showProduct(findPhoneByBrand(brand));
        }
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private Phone findPhoneById(int id){
        for (Phone phone : phones){
            if (phone.getId() == id){
                return phone;
            }
        }
        return null;
    }
    private Phone findPhoneByBrand(String brand){
        for (Phone phone : phones){
            if (phone.getBrandName().equals(brand)){
                return phone;
            }
        }
        return null;
    }
    private void showProduct(Phone selected){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-22s %-10s %-12s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Camera", "| Ekran", "| RAM", "| Pil", "| Renk", "| Stok", "| İndirim    |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone phone : phones) {
            if (phone == selected) {
                System.out.printf("  %-6s %-22s %-10s %-12s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                        phone.getId(), phone.getName(), phone.getPrice(), phone.getBrandName(),
                        phone.getMemory(), phone.getCamera(), phone.getScreenSize(), phone.getRam(),
                        phone.getBatteryCapacity(), phone.getColor(), phone.getStock(), phone.getDiscountRate());
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
}
