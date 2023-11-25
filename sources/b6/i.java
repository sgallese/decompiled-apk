package b6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ElfParser.java */
/* loaded from: classes.dex */
public class i implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    private final int f8075f = 1179403647;

    /* renamed from: m  reason: collision with root package name */
    private final FileChannel f8076m;

    public i(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            this.f8076m = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    private long b(d dVar, long j10, long j11) throws IOException {
        for (long j12 = 0; j12 < j10; j12++) {
            e b10 = dVar.b(j12);
            if (b10.f8068a == 1) {
                long j13 = b10.f8070c;
                if (j13 <= j11 && j11 <= b10.f8071d + j13) {
                    return (j11 - j13) + b10.f8069b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d c() throws IOException {
        boolean z10;
        this.f8076m.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (z(allocate, 0L) == 1179403647) {
            short j10 = j(allocate, 4L);
            if (j(allocate, 5L) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j10 == 1) {
                return new g(z10, this);
            }
            if (j10 == 2) {
                return new h(z10, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8076m.close();
    }

    public List<String> d() throws IOException {
        ByteOrder byteOrder;
        long j10;
        this.f8076m.position(0L);
        ArrayList arrayList = new ArrayList();
        d c10 = c();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (c10.f8059a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j11 = c10.f8064f;
        int i10 = 0;
        if (j11 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j11 = c10.c(0).f8072a;
        }
        long j12 = 0;
        while (true) {
            if (j12 < j11) {
                e b10 = c10.b(j12);
                if (b10.f8068a == 2) {
                    j10 = b10.f8069b;
                    break;
                }
                j12++;
            } else {
                j10 = 0;
                break;
            }
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j13 = 0;
        while (true) {
            c a10 = c10.a(j10, i10);
            long j14 = j10;
            long j15 = a10.f8057a;
            if (j15 == 1) {
                arrayList2.add(Long.valueOf(a10.f8058b));
            } else if (j15 == 5) {
                j13 = a10.f8058b;
            }
            i10++;
            if (a10.f8057a == 0) {
                break;
            }
            j10 = j14;
        }
        if (j13 != 0) {
            long b11 = b(c10, j11, j13);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(x(allocate, ((Long) it.next()).longValue() + b11));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    protected void e(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int read = this.f8076m.read(byteBuffer, j10 + j11);
            if (read != -1) {
                j11 += read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    protected short j(ByteBuffer byteBuffer, long j10) throws IOException {
        e(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int m(ByteBuffer byteBuffer, long j10) throws IOException {
        e(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long q(ByteBuffer byteBuffer, long j10) throws IOException {
        e(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String x(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short j12 = j(byteBuffer, j10);
            if (j12 != 0) {
                sb2.append((char) j12);
                j10 = j11;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long z(ByteBuffer byteBuffer, long j10) throws IOException {
        e(byteBuffer, j10, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
