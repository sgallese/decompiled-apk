package ld;

import dc.w;
import ec.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.c1;
import okio.l0;
import okio.r0;
import pc.l;
import pc.p;
import qc.b0;
import qc.e0;
import qc.f0;
import qc.q;
import qc.r;
import yc.v;

/* compiled from: zip.kt */
/* loaded from: classes4.dex */
public final class e {

    /* compiled from: Comparisons.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(((d) t10).a(), ((d) t11).a());
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: zip.kt */
    /* loaded from: classes4.dex */
    public static final class b extends r implements p<Integer, Long, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b0 f19670f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f19671m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e0 f19672p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ okio.e f19673q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ e0 f19674r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ e0 f19675s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, long j10, e0 e0Var, okio.e eVar, e0 e0Var2, e0 e0Var3) {
            super(2);
            this.f19670f = b0Var;
            this.f19671m = j10;
            this.f19672p = e0Var;
            this.f19673q = eVar;
            this.f19674r = e0Var2;
            this.f19675s = e0Var3;
        }

        public final void a(int i10, long j10) {
            long j11;
            if (i10 == 1) {
                b0 b0Var = this.f19670f;
                if (!b0Var.f21657f) {
                    b0Var.f21657f = true;
                    if (j10 >= this.f19671m) {
                        e0 e0Var = this.f19672p;
                        long j12 = e0Var.f21668f;
                        if (j12 == 4294967295L) {
                            j12 = this.f19673q.G0();
                        }
                        e0Var.f21668f = j12;
                        e0 e0Var2 = this.f19674r;
                        long j13 = 0;
                        if (e0Var2.f21668f == 4294967295L) {
                            j11 = this.f19673q.G0();
                        } else {
                            j11 = 0;
                        }
                        e0Var2.f21668f = j11;
                        e0 e0Var3 = this.f19675s;
                        if (e0Var3.f21668f == 4294967295L) {
                            j13 = this.f19673q.G0();
                        }
                        e0Var3.f21668f = j13;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(Integer num, Long l10) {
            a(num.intValue(), l10.longValue());
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: zip.kt */
    /* loaded from: classes4.dex */
    public static final class c extends r implements p<Integer, Long, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ okio.e f19676f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f0<Long> f19677m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f0<Long> f19678p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ f0<Long> f19679q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(okio.e eVar, f0<Long> f0Var, f0<Long> f0Var2, f0<Long> f0Var3) {
            super(2);
            this.f19676f = eVar;
            this.f19677m = f0Var;
            this.f19678p = f0Var2;
            this.f19679q = f0Var3;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Long] */
        public final void a(int i10, long j10) {
            boolean z10;
            boolean z11;
            if (i10 == 21589) {
                long j11 = 1;
                if (j10 >= 1) {
                    int readByte = this.f19676f.readByte() & 255;
                    boolean z12 = false;
                    if ((readByte & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((readByte & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z12 = true;
                    }
                    okio.e eVar = this.f19676f;
                    if (z10) {
                        j11 = 5;
                    }
                    if (z11) {
                        j11 += 4;
                    }
                    if (z12) {
                        j11 += 4;
                    }
                    if (j10 >= j11) {
                        if (z10) {
                            this.f19677m.f21676f = Long.valueOf(eVar.u0() * 1000);
                        }
                        if (z11) {
                            this.f19678p.f21676f = Long.valueOf(this.f19676f.u0() * 1000);
                        }
                        if (z12) {
                            this.f19679q.f21676f = Long.valueOf(this.f19676f.u0() * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(Integer num, Long l10) {
            a(num.intValue(), l10.longValue());
            return w.f13270a;
        }
    }

    private static final Map<r0, d> a(List<d> list) {
        Map<r0, d> l10;
        List<d> x02;
        r0 e10 = r0.a.e(r0.f20670m, "/", false, 1, null);
        l10 = n0.l(dc.r.a(e10, new d(e10, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        x02 = ec.b0.x0(list, new a());
        for (d dVar : x02) {
            if (l10.put(dVar.a(), dVar) == null) {
                while (true) {
                    r0 l11 = dVar.a().l();
                    if (l11 != null) {
                        d dVar2 = l10.get(l11);
                        if (dVar2 != null) {
                            dVar2.b().add(dVar.a());
                            break;
                        }
                        d dVar3 = new d(l11, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        l10.put(l11, dVar3);
                        dVar3.b().add(dVar.a());
                        dVar = dVar3;
                    }
                }
            }
        }
        return l10;
    }

    private static final Long b(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i10) {
        int a10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        a10 = yc.b.a(16);
        String num = Integer.toString(i10, a10);
        q.h(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    public static final c1 d(r0 r0Var, okio.j jVar, l<? super d, Boolean> lVar) throws IOException {
        okio.e d10;
        q.i(r0Var, "zipPath");
        q.i(jVar, "fileSystem");
        q.i(lVar, "predicate");
        okio.h n10 = jVar.n(r0Var);
        try {
            long B = n10.B() - 22;
            if (B >= 0) {
                long max = Math.max(B - 65536, 0L);
                do {
                    okio.e d11 = l0.d(n10.E(B));
                    try {
                        if (d11.u0() == 101010256) {
                            ld.a f10 = f(d11);
                            String h10 = d11.h(f10.b());
                            d11.close();
                            long j10 = B - 20;
                            if (j10 > 0) {
                                d10 = l0.d(n10.E(j10));
                                try {
                                    if (d10.u0() == 117853008) {
                                        int u02 = d10.u0();
                                        long G0 = d10.G0();
                                        if (d10.u0() == 1 && u02 == 0) {
                                            d10 = l0.d(n10.E(G0));
                                            try {
                                                int u03 = d10.u0();
                                                if (u03 == 101075792) {
                                                    f10 = j(d10, f10);
                                                    w wVar = w.f13270a;
                                                    nc.b.a(d10, null);
                                                } else {
                                                    throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(u03));
                                                }
                                            } finally {
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    }
                                    w wVar2 = w.f13270a;
                                    nc.b.a(d10, null);
                                } finally {
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            d10 = l0.d(n10.E(f10.a()));
                            try {
                                long c10 = f10.c();
                                for (long j11 = 0; j11 < c10; j11++) {
                                    d e10 = e(d10);
                                    if (e10.f() < f10.a()) {
                                        if (lVar.invoke(e10).booleanValue()) {
                                            arrayList.add(e10);
                                        }
                                    } else {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                }
                                w wVar3 = w.f13270a;
                                nc.b.a(d10, null);
                                c1 c1Var = new c1(r0Var, jVar, a(arrayList), h10);
                                nc.b.a(n10, null);
                                return c1Var;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                    nc.b.a(d10, th);
                                }
                            }
                        }
                        d11.close();
                        B--;
                    } catch (Throwable th) {
                        d11.close();
                        throw th;
                    }
                } while (B >= max);
                throw new IOException("not a zip: end of central directory signature not found");
            }
            throw new IOException("not a zip: size=" + n10.B());
        } finally {
        }
    }

    public static final d e(okio.e eVar) throws IOException {
        boolean J;
        int i10;
        Long l10;
        long j10;
        boolean q10;
        q.i(eVar, "<this>");
        int u02 = eVar.u0();
        if (u02 == 33639248) {
            eVar.skip(4L);
            int E0 = eVar.E0() & 65535;
            if ((E0 & 1) == 0) {
                int E02 = eVar.E0() & 65535;
                Long b10 = b(eVar.E0() & 65535, eVar.E0() & 65535);
                long u03 = eVar.u0() & 4294967295L;
                e0 e0Var = new e0();
                e0Var.f21668f = eVar.u0() & 4294967295L;
                e0 e0Var2 = new e0();
                e0Var2.f21668f = eVar.u0() & 4294967295L;
                int E03 = eVar.E0() & 65535;
                int E04 = eVar.E0() & 65535;
                int E05 = eVar.E0() & 65535;
                eVar.skip(8L);
                e0 e0Var3 = new e0();
                e0Var3.f21668f = eVar.u0() & 4294967295L;
                String h10 = eVar.h(E03);
                J = yc.w.J(h10, (char) 0, false, 2, null);
                if (!J) {
                    if (e0Var2.f21668f == 4294967295L) {
                        j10 = 8 + 0;
                        i10 = E02;
                        l10 = b10;
                    } else {
                        i10 = E02;
                        l10 = b10;
                        j10 = 0;
                    }
                    if (e0Var.f21668f == 4294967295L) {
                        j10 += 8;
                    }
                    if (e0Var3.f21668f == 4294967295L) {
                        j10 += 8;
                    }
                    long j11 = j10;
                    b0 b0Var = new b0();
                    g(eVar, E04, new b(b0Var, j11, e0Var2, eVar, e0Var, e0Var3));
                    if (j11 > 0 && !b0Var.f21657f) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String h11 = eVar.h(E05);
                    r0 n10 = r0.a.e(r0.f20670m, "/", false, 1, null).n(h10);
                    q10 = v.q(h10, "/", false, 2, null);
                    return new d(n10, q10, h11, u03, e0Var.f21668f, e0Var2.f21668f, i10, l10, e0Var3.f21668f);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(E0));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(u02));
    }

    private static final ld.a f(okio.e eVar) throws IOException {
        int E0 = eVar.E0() & 65535;
        int E02 = eVar.E0() & 65535;
        long E03 = eVar.E0() & 65535;
        if (E03 == (eVar.E0() & 65535) && E0 == 0 && E02 == 0) {
            eVar.skip(4L);
            return new ld.a(E03, 4294967295L & eVar.u0(), eVar.E0() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    private static final void g(okio.e eVar, int i10, p<? super Integer, ? super Long, w> pVar) {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 >= 4) {
                int E0 = eVar.E0() & 65535;
                long E02 = eVar.E0() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j11 = j10 - 4;
                if (j11 >= E02) {
                    eVar.O0(E02);
                    long s02 = eVar.a().s0();
                    pVar.invoke(Integer.valueOf(E0), Long.valueOf(E02));
                    long s03 = (eVar.a().s0() + E02) - s02;
                    if (s03 >= 0) {
                        if (s03 > 0) {
                            eVar.a().skip(s03);
                        }
                        j10 = j11 - E02;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + E0);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final okio.i h(okio.e eVar, okio.i iVar) {
        q.i(eVar, "<this>");
        q.i(iVar, "basicMetadata");
        okio.i i10 = i(eVar, iVar);
        q.f(i10);
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final okio.i i(okio.e eVar, okio.i iVar) {
        T t10;
        f0 f0Var = new f0();
        if (iVar != null) {
            t10 = iVar.c();
        } else {
            t10 = 0;
        }
        f0Var.f21676f = t10;
        f0 f0Var2 = new f0();
        f0 f0Var3 = new f0();
        int u02 = eVar.u0();
        if (u02 == 67324752) {
            eVar.skip(2L);
            int E0 = eVar.E0() & 65535;
            if ((E0 & 1) == 0) {
                eVar.skip(18L);
                long E02 = eVar.E0() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int E03 = eVar.E0() & 65535;
                eVar.skip(E02);
                if (iVar == null) {
                    eVar.skip(E03);
                    return null;
                }
                g(eVar, E03, new c(eVar, f0Var, f0Var2, f0Var3));
                return new okio.i(iVar.g(), iVar.f(), null, iVar.d(), (Long) f0Var3.f21676f, (Long) f0Var.f21676f, (Long) f0Var2.f21676f, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(E0));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(u02));
    }

    private static final ld.a j(okio.e eVar, ld.a aVar) throws IOException {
        eVar.skip(12L);
        int u02 = eVar.u0();
        int u03 = eVar.u0();
        long G0 = eVar.G0();
        if (G0 == eVar.G0() && u02 == 0 && u03 == 0) {
            eVar.skip(8L);
            return new ld.a(G0, eVar.G0(), aVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(okio.e eVar) {
        q.i(eVar, "<this>");
        i(eVar, null);
    }
}
