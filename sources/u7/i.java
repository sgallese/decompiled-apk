package u7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class i extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    private final Enumeration f24194f;

    /* renamed from: m  reason: collision with root package name */
    private InputStream f24195m;

    public i(Enumeration enumeration) throws IOException {
        this.f24194f = enumeration;
        b();
    }

    final void b() throws IOException {
        FileInputStream fileInputStream;
        InputStream inputStream = this.f24195m;
        if (inputStream != null) {
            inputStream.close();
        }
        if (this.f24194f.hasMoreElements()) {
            fileInputStream = new FileInputStream((File) this.f24194f.nextElement());
        } else {
            fileInputStream = null;
        }
        this.f24195m = fileInputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f24195m;
        if (inputStream != null) {
            inputStream.close();
            this.f24195m = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f24195m;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f24195m == null) {
            return -1;
        }
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        do {
            int read = this.f24195m.read(bArr, i10, i11);
            if (read > 0) {
                return read;
            }
            b();
        } while (this.f24195m != null);
        return -1;
    }
}
