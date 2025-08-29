import java.util.*;

public class Koperasi {
    private final Map<String, Anggota> anggotaMap = new HashMap<>();
    private final Map<String, Barang> barangMap  = new HashMap<>();

    public void tambahAnggota(Anggota a) { anggotaMap.put(a.getId(), a); }
    public Anggota cariAnggota(String id) { return anggotaMap.get(id); }
    public Collection<Anggota> semuaAnggota() { return anggotaMap.values(); }

    public void tambahBarang(Barang b) { barangMap.put(b.getKode(), b); }
    public Barang cariBarang(String kode) { return barangMap.get(kode); }
    public Collection<Barang> semuaBarang() { return barangMap.values(); }
}
