package pengguna;

public  class Mhs extends User {
    private String nama;
    private String nim;
    private int smt;

    public Mhs (String username, String password) {
        super(username, password);

    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setSmt(int smt) {
        this.smt = smt;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getSmt() {
        return smt;
    }
}
