package okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
/* loaded from: classes4.dex */
public interface d extends y0, WritableByteChannel {
    d B0(f fVar) throws IOException;

    d D(int i10) throws IOException;

    d J() throws IOException;

    d P0(long j10) throws IOException;

    d W(String str) throws IOException;

    c a();

    d d0(byte[] bArr, int i10, int i11) throws IOException;

    @Override // okio.y0, java.io.Flushable
    void flush() throws IOException;

    long g0(Source source) throws IOException;

    d h0(long j10) throws IOException;

    d r() throws IOException;

    d t(int i10) throws IOException;

    d w(int i10) throws IOException;

    d y0(byte[] bArr) throws IOException;
}
