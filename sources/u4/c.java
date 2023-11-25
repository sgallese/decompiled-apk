package u4;

import dc.w;
import java.io.IOException;
import okio.l;
import okio.y0;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<IOException, w> f24142f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f24143m;

    /* JADX WARN: Multi-variable type inference failed */
    public c(y0 y0Var, pc.l<? super IOException, w> lVar) {
        super(y0Var);
        this.f24142f = lVar;
    }

    @Override // okio.l, okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f24143m = true;
            this.f24142f.invoke(e10);
        }
    }

    @Override // okio.l, okio.y0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f24143m = true;
            this.f24142f.invoke(e10);
        }
    }

    @Override // okio.l, okio.y0
    public void write(okio.c cVar, long j10) {
        if (this.f24143m) {
            cVar.skip(j10);
            return;
        }
        try {
            super.write(cVar, j10);
        } catch (IOException e10) {
            this.f24143m = true;
            this.f24142f.invoke(e10);
        }
    }
}
