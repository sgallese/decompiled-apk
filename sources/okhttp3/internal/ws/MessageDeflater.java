package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import nc.b;
import okio.c;
import okio.f;
import okio.g;
import okio.y0;
import qc.q;

/* compiled from: MessageDeflater.kt */
/* loaded from: classes4.dex */
public final class MessageDeflater implements Closeable {
    private final c deflatedBytes;
    private final Deflater deflater;
    private final g deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        c cVar = new c();
        this.deflatedBytes = cVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new g((y0) cVar, deflater);
    }

    private final boolean endsWith(c cVar, f fVar) {
        return cVar.a0(cVar.s0() - fVar.D(), fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(c cVar) throws IOException {
        boolean z10;
        f fVar;
        q.i(cVar, "buffer");
        if (this.deflatedBytes.s0() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(cVar, cVar.s0());
            this.deflaterSink.flush();
            c cVar2 = this.deflatedBytes;
            fVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(cVar2, fVar)) {
                long s02 = this.deflatedBytes.s0() - 4;
                c.a i02 = c.i0(this.deflatedBytes, null, 1, null);
                try {
                    i02.d(s02);
                    b.a(i02, null);
                } finally {
                }
            } else {
                this.deflatedBytes.D(0);
            }
            c cVar3 = this.deflatedBytes;
            cVar.write(cVar3, cVar3.s0());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
