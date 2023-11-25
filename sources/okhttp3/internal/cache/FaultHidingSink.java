package okhttp3.internal.cache;

import dc.w;
import java.io.IOException;
import okio.c;
import okio.l;
import okio.y0;
import qc.q;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes4.dex */
public class FaultHidingSink extends l {
    private boolean hasErrors;
    private final pc.l<IOException, w> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(y0 y0Var, pc.l<? super IOException, w> lVar) {
        super(y0Var);
        q.i(y0Var, "delegate");
        q.i(lVar, "onException");
        this.onException = lVar;
    }

    @Override // okio.l, okio.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // okio.l, okio.y0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    public final pc.l<IOException, w> getOnException() {
        return this.onException;
    }

    @Override // okio.l, okio.y0
    public void write(c cVar, long j10) {
        q.i(cVar, "source");
        if (this.hasErrors) {
            cVar.skip(j10);
            return;
        }
        try {
            super.write(cVar, j10);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
