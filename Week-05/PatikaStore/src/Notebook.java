import java.util.*;

public class Notebook extends Product implements IOperation{
    public Notebook(int id, String name, double price, double discountRate, int stock, String brandName, int screenSize, int ram, int memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }

    public Notebook() {
    }
    static List<Notebook> notebooks = new ArrayList<>();
    static {
        notebooks.add(new Notebook(1, "HUAWEI Matebook 14", 7000.0, 15.0, 25, "HUAWEI", 14, 16, 512));
        notebooks.add(new Notebook(2, "LENOVO V14 IGL", 3699.0, 10.0, 34, "LENOVO", 14, 8, 1024));
        notebooks.add(new Notebook(3, "ASUS Tuf Gaming", 8199.0, 25.0, 48, "Asus", 12, 32, 2048));
    }

    @Override
    public void runMenu() {
        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("######################################");
            System.out.println("Notebook Yönetim Paneli");
            System.out.println("1 - Notebook ekleme \n" +
                    "2 - Notebook silme \n" +
                    "3 - id ye göre filtreleme \n" +
                    "4 - markaya göre filtreleme \n" +
                    "5 - Notebook listeleme \n" +
                    "0 - Üst menüye dön");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addProduct();      //Notebook adding
                    break;
                case 2:
                    deleteProduct();    //Notebook deleting
                    break;
                case 3:
                    filterByProductId();    //Filter by ID
                    break;
                case 4:
                    filterByProductBrand();    //Filter by ID
                    break;
                case 5:
                    showProductList();      //Show the notebook list
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }
    }

    @Override
    public void showProductList() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Ekran", "| RAM", "| Stok", "| İndirim    |");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks){
            System.out.printf("  %-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                    notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrandName(),
                    notebook.getMemory(), notebook.getScreenSize(), notebook.getRam(),
                    notebook.getStock(), notebook.getDiscountRate());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void addProduct() {
        System.out.println("Eklemek istediğiniz ürünün özelliklerini giriniz : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürünün adını giriniz : ");
        String name = scanner.nextLine();

        System.out.print("Ürünün fiyatını giriniz : ");
        double price = scanner.nextDouble();

        System.out.print("Ürünün markasını giriniz : ");
        String brand = scanner.next();

        System.out.print("Ürünün ekran boyutunu(inç) giriniz : ");
        int screenSize = scanner.nextInt();

        System.out.print("Ürünün ram bilgisini giriniz : ");
        int ram = scanner.nextInt();

        System.out.print("Ürünün stok bilgisini giriniz : ");
        int stock = scanner.nextInt();

        System.out.print("Ürünün indirim oranını giriniz : ");
        double discountRate = scanner.nextDouble();

        System.out.print("Ürünün hafızasını giriniz : ");
        int memory = scanner.nextInt();

        int id = maxNotebookId() + 1;

        notebooks.add(new Notebook(id, name, price, discountRate, stock, brand, screenSize, ram, memory));
    }

    @Override
    public void deleteProduct() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen silmek istediğiniz ID yi seçiniz : ");
        int delete = scanner.nextInt();
        if (delete <= notebooks.size() && delete > 0) {
            Notebook deleteNotebook = findNotebookById(delete);
            notebooks.remove(deleteNotebook);
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

        if (notebooks.contains(findNotebookById(id))){
            showProduct(findNotebookById(id));
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
        if (notebooks.contains(findNotebookByBrand(brand))){
            showProduct(findNotebookByBrand(brand));
        }
    }
    private Notebook findNotebookById(int id){
        for (Notebook notebook : notebooks){
            if (notebook.getId() == id){
                return notebook;
            }
        }
        return null;
    }
    private Notebook findNotebookByBrand(String brand){
        for (Notebook notebook : notebooks){
            if (notebook.getBrandName().equals(brand)){
                return notebook;
            }
        }
        return null;
    }
    private int maxNotebookId(){
        int count = 0;
        for (Notebook notebook : notebooks){
            if(notebook.getId() > count){
                count = notebook.getId();
            }
        }
        return count;
    }
    private void showProduct(Notebook selected){
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Ekran", "| RAM", "| Stok", "| İndirim    |");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            if (notebook == selected) {
                System.out.printf("  %-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                        notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrandName(),
                        notebook.getMemory(), notebook.getScreenSize(), notebook.getRam(),
                        notebook.getStock(), notebook.getDiscountRate());
                System.out.println("----------------------------------------------------------------------------------------------------------------");
            }
        }
    }

}
