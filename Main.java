import pengguna.*;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("ini_username", "ini_password");
        
        mhs.setNama("Mochamad Idris");
        mhs.setNim("A123");
        mhs.setSmt(6);

        System.out.println("Nama Mhs:" + mhs.getNama()); 
        System.out.println("Nim Mhs:" + mhs.getNim()); 
        System.out.println("Smt Mhs:" + mhs.getSmt());
        System.out.println("Username Mhs:" + mhs.getUsername());
        System.out.println("Password Mhs:" + mhs.getPassword());
    }
}