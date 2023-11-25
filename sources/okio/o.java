package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes4.dex */
public final class o implements Source {

    /* renamed from: f  reason: collision with root package name */
    private byte f20653f;

    /* renamed from: m  reason: collision with root package name */
    private final u0 f20654m;

    /* renamed from: p  reason: collision with root package name */
    private final Inflater f20655p;

    /* renamed from: q  reason: collision with root package name */
    private final p f20656q;

    /* renamed from: r  reason: collision with root package name */
    private final CRC32 f20657r;

    public o(Source source) {
        qc.q.i(source, "source");
        u0 u0Var = new u0(source);
        this.f20654m = u0Var;
        Inflater inflater = new Inflater(true);
        this.f20655p = inflater;
        this.f20656q = new p((e) u0Var, inflater);
        this.f20657r = new CRC32();
    }

    private final void b(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        qc.q.h(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void c() throws IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f20654m.O0(10L);
        byte B = this.f20654m.f20683m.B(3L);
        boolean z13 = true;
        if (((B >> 1) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e(this.f20654m.f20683m, 0L, 10L);
        }
        b("ID1ID2", 8075, this.f20654m.readShort());
        this.f20654m.skip(8L);
        if (((B >> 2) & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f20654m.O0(2L);
            if (z10) {
                e(this.f20654m.f20683m, 0L, 2L);
            }
            long E0 = this.f20654m.f20683m.E0();
            this.f20654m.O0(E0);
            if (z10) {
                e(this.f20654m.f20683m, 0L, E0);
            }
            this.f20654m.skip(E0);
        }
        if (((B >> 3) & 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            long b10 = this.f20654m.b((byte) 0);
            if (b10 != -1) {
                if (z10) {
                    e(this.f20654m.f20683m, 0L, b10 + 1);
                }
                this.f20654m.skip(b10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((B >> 4) & 1) != 1) {
            z13 = false;
        }
        if (z13) {
            long b11 = this.f20654m.b((byte) 0);
            if (b11 != -1) {
                if (z10) {
                    e(this.f20654m.f20683m, 0L, b11 + 1);
                }
                this.f20654m.skip(b11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            b("FHCRC", this.f20654m.E0(), (short) this.f20657r.getValue());
            this.f20657r.reset();
        }
    }

    private final void d() throws IOException {
        b("CRC", this.f20654m.u0(), (int) this.f20657r.getValue());
        b("ISIZE", this.f20654m.u0(), (int) this.f20655p.getBytesWritten());
    }

    private final void e(c cVar, long j10, long j11) {
        v0 v0Var = cVar.f20602f;
        qc.q.f(v0Var);
        while (true) {
            int i10 = v0Var.f20689c;
            int i11 = v0Var.f20688b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            v0Var = v0Var.f20692f;
            qc.q.f(v0Var);
        }
        while (j11 > 0) {
            int min = (int) Math.min(v0Var.f20689c - r7, j11);
            this.f20657r.update(v0Var.f20687a, (int) (v0Var.f20688b + j10), min);
            j11 -= min;
            v0Var = v0Var.f20692f;
            qc.q.f(v0Var);
            j10 = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20656q.close();
    }

    @Override // okio.Source
    public long read(c cVar, long j10) throws IOException {
        boolean z10;
        qc.q.i(cVar, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f20653f == 0) {
                c();
                this.f20653f = (byte) 1;
            }
            if (this.f20653f == 1) {
                long s02 = cVar.s0();
                long read = this.f20656q.read(cVar, j10);
                if (read != -1) {
                    e(cVar, s02, read);
                    return read;
                }
                this.f20653f = (byte) 2;
            }
            if (this.f20653f == 2) {
                d();
                this.f20653f = (byte) 3;
                if (!this.f20654m.C()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // okio.Source
    public a1 timeout() {
        return this.f20654m.timeout();
    }
}
