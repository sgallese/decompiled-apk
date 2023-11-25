package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
final class q0 extends Writer {

    /* renamed from: f  reason: collision with root package name */
    private final String f4797f;

    /* renamed from: m  reason: collision with root package name */
    private StringBuilder f4798m = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(String str) {
        this.f4797f = str;
    }

    private void b() {
        if (this.f4798m.length() > 0) {
            Log.d(this.f4797f, this.f4798m.toString());
            StringBuilder sb2 = this.f4798m;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f4798m.append(c10);
            }
        }
    }
}
