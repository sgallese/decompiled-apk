package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes3.dex */
public final class b extends ja.c {
    private static final Writer B = new a();
    private static final o C = new o("closed");
    private l A;

    /* renamed from: y  reason: collision with root package name */
    private final List<l> f12232y;

    /* renamed from: z  reason: collision with root package name */
    private String f12233z;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes3.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(B);
        this.f12232y = new ArrayList();
        this.A = m.f12237f;
    }

    private l C0() {
        return this.f12232y.get(r0.size() - 1);
    }

    private void D0(l lVar) {
        if (this.f12233z != null) {
            if (!lVar.n() || x()) {
                ((n) C0()).r(this.f12233z, lVar);
            }
            this.f12233z = null;
        } else if (this.f12232y.isEmpty()) {
            this.A = lVar;
        } else {
            l C0 = C0();
            if (C0 instanceof i) {
                ((i) C0).r(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public l A0() {
        if (this.f12232y.isEmpty()) {
            return this.A;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f12232y);
    }

    @Override // ja.c
    public ja.c E(String str) throws IOException {
        if (!this.f12232y.isEmpty() && this.f12233z == null) {
            if (C0() instanceof n) {
                this.f12233z = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // ja.c
    public ja.c L() throws IOException {
        D0(m.f12237f);
        return this;
    }

    @Override // ja.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f12232y.isEmpty()) {
            this.f12232y.add(C);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // ja.c
    public ja.c d() throws IOException {
        i iVar = new i();
        D0(iVar);
        this.f12232y.add(iVar);
        return this;
    }

    @Override // ja.c
    public ja.c e() throws IOException {
        n nVar = new n();
        D0(nVar);
        this.f12232y.add(nVar);
        return this;
    }

    @Override // ja.c
    public ja.c l0(long j10) throws IOException {
        D0(new o((Number) Long.valueOf(j10)));
        return this;
    }

    @Override // ja.c
    public ja.c m() throws IOException {
        if (!this.f12232y.isEmpty() && this.f12233z == null) {
            if (C0() instanceof i) {
                this.f12232y.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // ja.c
    public ja.c p0(Boolean bool) throws IOException {
        if (bool == null) {
            return L();
        }
        D0(new o(bool));
        return this;
    }

    @Override // ja.c
    public ja.c q() throws IOException {
        if (!this.f12232y.isEmpty() && this.f12233z == null) {
            if (C0() instanceof n) {
                this.f12232y.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // ja.c
    public ja.c q0(Number number) throws IOException {
        if (number == null) {
            return L();
        }
        if (!B()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        D0(new o(number));
        return this;
    }

    @Override // ja.c
    public ja.c s0(String str) throws IOException {
        if (str == null) {
            return L();
        }
        D0(new o(str));
        return this;
    }

    @Override // ja.c
    public ja.c x0(boolean z10) throws IOException {
        D0(new o(Boolean.valueOf(z10)));
        return this;
    }

    @Override // ja.c, java.io.Flushable
    public void flush() throws IOException {
    }
}
