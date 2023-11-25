package okio;

import okio.c;

/* compiled from: -Util.kt */
/* loaded from: classes4.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f20626a = new c.a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f20627b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        qc.q.i(bArr, "a");
        qc.q.i(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
    }

    public static final int c() {
        return f20627b;
    }

    public static final c.a d() {
        return f20626a;
    }

    public static final int e(f fVar, int i10) {
        qc.q.i(fVar, "<this>");
        if (i10 == f20627b) {
            return fVar.D();
        }
        return i10;
    }

    public static final int f(byte[] bArr, int i10) {
        qc.q.i(bArr, "<this>");
        if (i10 == f20627b) {
            return bArr.length;
        }
        return i10;
    }

    public static final c.a g(c.a aVar) {
        qc.q.i(aVar, "unsafeCursor");
        if (aVar == f20626a) {
            return new c.a();
        }
        return aVar;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long i(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short j(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final String k(byte b10) {
        String n10;
        n10 = yc.v.n(new char[]{ld.g.f()[(b10 >> 4) & 15], ld.g.f()[b10 & 15]});
        return n10;
    }

    public static final String l(int i10) {
        String o10;
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {ld.g.f()[(i10 >> 28) & 15], ld.g.f()[(i10 >> 24) & 15], ld.g.f()[(i10 >> 20) & 15], ld.g.f()[(i10 >> 16) & 15], ld.g.f()[(i10 >> 12) & 15], ld.g.f()[(i10 >> 8) & 15], ld.g.f()[(i10 >> 4) & 15], ld.g.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        o10 = yc.v.o(cArr, i11, 8);
        return o10;
    }
}
