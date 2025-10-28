package Modul3.Tugas1;

public class MenuItem {
    private String name;
    private int harga;

    public MenuItem(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }

    public String getName() {
        return name;
    }

    public int getHarga() {
        return harga;
    }

    @Override
    public String toString(){
        return name + " -Rp " + harga;
    }
}
