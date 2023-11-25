package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public class l implements x3.e, x3.d {

    /* renamed from: v  reason: collision with root package name */
    static final TreeMap<Integer, l> f7060v = new TreeMap<>();

    /* renamed from: f  reason: collision with root package name */
    private volatile String f7061f;

    /* renamed from: m  reason: collision with root package name */
    final long[] f7062m;

    /* renamed from: p  reason: collision with root package name */
    final double[] f7063p;

    /* renamed from: q  reason: collision with root package name */
    final String[] f7064q;

    /* renamed from: r  reason: collision with root package name */
    final byte[][] f7065r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f7066s;

    /* renamed from: t  reason: collision with root package name */
    final int f7067t;

    /* renamed from: u  reason: collision with root package name */
    int f7068u;

    private l(int i10) {
        this.f7067t = i10;
        int i11 = i10 + 1;
        this.f7066s = new int[i11];
        this.f7062m = new long[i11];
        this.f7063p = new double[i11];
        this.f7064q = new String[i11];
        this.f7065r = new byte[i11];
    }

    public static l d(String str, int i10) {
        TreeMap<Integer, l> treeMap = f7060v;
        synchronized (treeMap) {
            Map.Entry<Integer, l> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                l value = ceilingEntry.getValue();
                value.e(str, i10);
                return value;
            }
            l lVar = new l(i10);
            lVar.e(str, i10);
            return lVar;
        }
    }

    private static void j() {
        TreeMap<Integer, l> treeMap = f7060v;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i10 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i10;
                } else {
                    return;
                }
            }
        }
    }

    @Override // x3.d
    public void N(int i10, long j10) {
        this.f7066s[i10] = 2;
        this.f7062m[i10] = j10;
    }

    @Override // x3.d
    public void U(int i10, byte[] bArr) {
        this.f7066s[i10] = 5;
        this.f7065r[i10] = bArr;
    }

    @Override // x3.e
    public void b(x3.d dVar) {
        for (int i10 = 1; i10 <= this.f7068u; i10++) {
            int i11 = this.f7066s[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                dVar.U(i10, this.f7065r[i10]);
                            }
                        } else {
                            dVar.p(i10, this.f7064q[i10]);
                        }
                    } else {
                        dVar.y(i10, this.f7063p[i10]);
                    }
                } else {
                    dVar.N(i10, this.f7062m[i10]);
                }
            } else {
                dVar.r0(i10);
            }
        }
    }

    @Override // x3.e
    public String c() {
        return this.f7061f;
    }

    void e(String str, int i10) {
        this.f7061f = str;
        this.f7068u = i10;
    }

    @Override // x3.d
    public void p(int i10, String str) {
        this.f7066s[i10] = 4;
        this.f7064q[i10] = str;
    }

    @Override // x3.d
    public void r0(int i10) {
        this.f7066s[i10] = 1;
    }

    public void release() {
        TreeMap<Integer, l> treeMap = f7060v;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f7067t), this);
            j();
        }
    }

    @Override // x3.d
    public void y(int i10, double d10) {
        this.f7066s[i10] = 3;
        this.f7063p[i10] = d10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
