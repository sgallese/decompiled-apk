package q8;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueueFile.java */
/* loaded from: classes3.dex */
public class e implements Closeable {

    /* renamed from: t  reason: collision with root package name */
    private static final Logger f21575t = Logger.getLogger(e.class.getName());

    /* renamed from: f  reason: collision with root package name */
    private final RandomAccessFile f21576f;

    /* renamed from: m  reason: collision with root package name */
    int f21577m;

    /* renamed from: p  reason: collision with root package name */
    private int f21578p;

    /* renamed from: q  reason: collision with root package name */
    private b f21579q;

    /* renamed from: r  reason: collision with root package name */
    private b f21580r;

    /* renamed from: s  reason: collision with root package name */
    private final byte[] f21581s = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f21582a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f21583b;

        a(StringBuilder sb2) {
            this.f21583b = sb2;
        }

        @Override // q8.e.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f21582a) {
                this.f21582a = false;
            } else {
                this.f21583b.append(", ");
            }
            this.f21583b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f21585c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f21586a;

        /* renamed from: b  reason: collision with root package name */
        final int f21587b;

        b(int i10, int i11) {
            this.f21586a = i10;
            this.f21587b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f21586a + ", length = " + this.f21587b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public final class c extends InputStream {

        /* renamed from: f  reason: collision with root package name */
        private int f21588f;

        /* renamed from: m  reason: collision with root package name */
        private int f21589m;

        /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            e.I(bArr, "buffer");
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f21589m;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    e.this.c0(this.f21588f, bArr, i10, i11);
                    this.f21588f = e.this.l0(this.f21588f + i11);
                    this.f21589m -= i11;
                    return i11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f21588f = e.this.l0(bVar.f21586a + 4);
            this.f21589m = bVar.f21587b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f21589m == 0) {
                return -1;
            }
            e.this.f21576f.seek(this.f21588f);
            int read = e.this.f21576f.read();
            this.f21588f = e.this.l0(this.f21588f + 1);
            this.f21589m--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    /* loaded from: classes3.dex */
    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    public e(File file) throws IOException {
        if (!file.exists()) {
            B(file);
        }
        this.f21576f = L(file);
        R();
    }

    private static void B(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile L = L(file2);
        try {
            L.setLength(4096L);
            L.seek(0L);
            byte[] bArr = new byte[16];
            s0(bArr, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            L.write(bArr);
            L.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th) {
            L.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T I(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile L(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b Q(int i10) throws IOException {
        if (i10 == 0) {
            return b.f21585c;
        }
        this.f21576f.seek(i10);
        return new b(i10, this.f21576f.readInt());
    }

    private void R() throws IOException {
        this.f21576f.seek(0L);
        this.f21576f.readFully(this.f21581s);
        int T = T(this.f21581s, 0);
        this.f21577m = T;
        if (T <= this.f21576f.length()) {
            this.f21578p = T(this.f21581s, 4);
            int T2 = T(this.f21581s, 8);
            int T3 = T(this.f21581s, 12);
            this.f21579q = Q(T2);
            this.f21580r = Q(T3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f21577m + ", Actual length: " + this.f21576f.length());
    }

    private static int T(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int V() {
        return this.f21577m - k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int l02 = l0(i10);
        int i13 = l02 + i12;
        int i14 = this.f21577m;
        if (i13 <= i14) {
            this.f21576f.seek(l02);
            this.f21576f.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - l02;
        this.f21576f.seek(l02);
        this.f21576f.readFully(bArr, i11, i15);
        this.f21576f.seek(16L);
        this.f21576f.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void f0(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int l02 = l0(i10);
        int i13 = l02 + i12;
        int i14 = this.f21577m;
        if (i13 <= i14) {
            this.f21576f.seek(l02);
            this.f21576f.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - l02;
        this.f21576f.seek(l02);
        this.f21576f.write(bArr, i11, i15);
        this.f21576f.seek(16L);
        this.f21576f.write(bArr, i11 + i15, i12 - i15);
    }

    private void i0(int i10) throws IOException {
        this.f21576f.setLength(i10);
        this.f21576f.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l0(int i10) {
        int i11 = this.f21577m;
        if (i10 >= i11) {
            return (i10 + 16) - i11;
        }
        return i10;
    }

    private void p0(int i10, int i11, int i12, int i13) throws IOException {
        s0(this.f21581s, i10, i11, i12, i13);
        this.f21576f.seek(0L);
        this.f21576f.write(this.f21581s);
    }

    private static void q0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void s0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            q0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void x(int i10) throws IOException {
        int i11 = i10 + 4;
        int V = V();
        if (V >= i11) {
            return;
        }
        int i12 = this.f21577m;
        do {
            V += i12;
            i12 <<= 1;
        } while (V < i11);
        i0(i12);
        b bVar = this.f21580r;
        int l02 = l0(bVar.f21586a + 4 + bVar.f21587b);
        if (l02 < this.f21579q.f21586a) {
            FileChannel channel = this.f21576f.getChannel();
            channel.position(this.f21577m);
            long j10 = (long) (l02 - 4);
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f21580r.f21586a;
        int i14 = this.f21579q.f21586a;
        if (i13 < i14) {
            int i15 = (this.f21577m + i13) - 16;
            p0(i12, this.f21578p, i14, i15);
            this.f21580r = new b(i15, this.f21580r.f21587b);
        } else {
            p0(i12, this.f21578p, i14, i13);
        }
        this.f21577m = i12;
    }

    public synchronized boolean E() {
        boolean z10;
        if (this.f21578p == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized void Y() throws IOException {
        if (!E()) {
            if (this.f21578p == 1) {
                q();
            } else {
                b bVar = this.f21579q;
                int l02 = l0(bVar.f21586a + 4 + bVar.f21587b);
                c0(l02, this.f21581s, 0, 4);
                int T = T(this.f21581s, 0);
                p0(this.f21577m, this.f21578p - 1, l02, this.f21580r.f21586a);
                this.f21578p--;
                this.f21579q = new b(l02, T);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f21576f.close();
    }

    public void j(byte[] bArr) throws IOException {
        m(bArr, 0, bArr.length);
    }

    public int k0() {
        if (this.f21578p == 0) {
            return 16;
        }
        b bVar = this.f21580r;
        int i10 = bVar.f21586a;
        int i11 = this.f21579q.f21586a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + bVar.f21587b + 16;
        }
        return (((i10 + 4) + bVar.f21587b) + this.f21577m) - i11;
    }

    public synchronized void m(byte[] bArr, int i10, int i11) throws IOException {
        int l02;
        int i12;
        I(bArr, "buffer");
        if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
            x(i11);
            boolean E = E();
            if (E) {
                l02 = 16;
            } else {
                b bVar = this.f21580r;
                l02 = l0(bVar.f21586a + 4 + bVar.f21587b);
            }
            b bVar2 = new b(l02, i11);
            q0(this.f21581s, 0, i11);
            f0(bVar2.f21586a, this.f21581s, 0, 4);
            f0(bVar2.f21586a + 4, bArr, i10, i11);
            if (E) {
                i12 = bVar2.f21586a;
            } else {
                i12 = this.f21579q.f21586a;
            }
            p0(this.f21577m, this.f21578p + 1, i12, bVar2.f21586a);
            this.f21580r = bVar2;
            this.f21578p++;
            if (E) {
                this.f21579q = bVar2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void q() throws IOException {
        p0(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
        this.f21578p = 0;
        b bVar = b.f21585c;
        this.f21579q = bVar;
        this.f21580r = bVar;
        if (this.f21577m > 4096) {
            i0(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        this.f21577m = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f21577m);
        sb2.append(", size=");
        sb2.append(this.f21578p);
        sb2.append(", first=");
        sb2.append(this.f21579q);
        sb2.append(", last=");
        sb2.append(this.f21580r);
        sb2.append(", element lengths=[");
        try {
            z(new a(sb2));
        } catch (IOException e10) {
            f21575t.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public synchronized void z(d dVar) throws IOException {
        int i10 = this.f21579q.f21586a;
        for (int i11 = 0; i11 < this.f21578p; i11++) {
            b Q = Q(i10);
            dVar.a(new c(this, Q, null), Q.f21587b);
            i10 = l0(Q.f21586a + 4 + Q.f21587b);
        }
    }
}
