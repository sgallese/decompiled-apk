package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;
import okio.Source;
import okio.c;
import okio.p;
import qc.q;

/* compiled from: MessageInflater.kt */
/* loaded from: classes4.dex */
public final class MessageInflater implements Closeable {
    private final c deflatedBytes;
    private final Inflater inflater;
    private final p inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
        c cVar = new c();
        this.deflatedBytes = cVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new p((Source) cVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(c cVar) throws IOException {
        boolean z10;
        q.i(cVar, "buffer");
        if (this.deflatedBytes.s0() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.g0(cVar);
            this.deflatedBytes.w(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.s0();
            do {
                this.inflaterSource.b(cVar, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
