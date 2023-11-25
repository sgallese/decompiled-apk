package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
/* loaded from: classes4.dex */
public interface e extends Source, ReadableByteChannel {
    byte[] A() throws IOException;

    boolean C() throws IOException;

    short E0() throws IOException;

    long G0() throws IOException;

    void H(c cVar, long j10) throws IOException;

    long H0(y0 y0Var) throws IOException;

    long K() throws IOException;

    e L0();

    String M(long j10) throws IOException;

    void O0(long j10) throws IOException;

    long S0() throws IOException;

    InputStream U0();

    int W0(o0 o0Var) throws IOException;

    c a();

    boolean a0(long j10, f fVar) throws IOException;

    String b0(Charset charset) throws IOException;

    String h(long j10) throws IOException;

    f j0() throws IOException;

    f l(long j10) throws IOException;

    boolean m0(long j10) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;

    String t0() throws IOException;

    int u0() throws IOException;

    byte[] v0(long j10) throws IOException;
}
