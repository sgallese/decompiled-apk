package okio;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: FileMetadata.kt */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20638a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20639b;

    /* renamed from: c  reason: collision with root package name */
    private final r0 f20640c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f20641d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f20642e;

    /* renamed from: f  reason: collision with root package name */
    private final Long f20643f;

    /* renamed from: g  reason: collision with root package name */
    private final Long f20644g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<wc.b<?>, Object> f20645h;

    public i(boolean z10, boolean z11, r0 r0Var, Long l10, Long l11, Long l12, Long l13, Map<wc.b<?>, ? extends Object> map) {
        Map<wc.b<?>, Object> r10;
        qc.q.i(map, "extras");
        this.f20638a = z10;
        this.f20639b = z11;
        this.f20640c = r0Var;
        this.f20641d = l10;
        this.f20642e = l11;
        this.f20643f = l12;
        this.f20644g = l13;
        r10 = ec.n0.r(map);
        this.f20645h = r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i b(i iVar, boolean z10, boolean z11, r0 r0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        boolean z12;
        boolean z13;
        r0 r0Var2;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Map<wc.b<?>, ? extends Object> map2;
        if ((i10 & 1) != 0) {
            z12 = iVar.f20638a;
        } else {
            z12 = z10;
        }
        if ((i10 & 2) != 0) {
            z13 = iVar.f20639b;
        } else {
            z13 = z11;
        }
        if ((i10 & 4) != 0) {
            r0Var2 = iVar.f20640c;
        } else {
            r0Var2 = r0Var;
        }
        if ((i10 & 8) != 0) {
            l14 = iVar.f20641d;
        } else {
            l14 = l10;
        }
        if ((i10 & 16) != 0) {
            l15 = iVar.f20642e;
        } else {
            l15 = l11;
        }
        if ((i10 & 32) != 0) {
            l16 = iVar.f20643f;
        } else {
            l16 = l12;
        }
        if ((i10 & 64) != 0) {
            l17 = iVar.f20644g;
        } else {
            l17 = l13;
        }
        if ((i10 & 128) != 0) {
            map2 = iVar.f20645h;
        } else {
            map2 = map;
        }
        return iVar.a(z12, z13, r0Var2, l14, l15, l16, l17, map2);
    }

    public final i a(boolean z10, boolean z11, r0 r0Var, Long l10, Long l11, Long l12, Long l13, Map<wc.b<?>, ? extends Object> map) {
        qc.q.i(map, "extras");
        return new i(z10, z11, r0Var, l10, l11, l12, l13, map);
    }

    public final Long c() {
        return this.f20643f;
    }

    public final Long d() {
        return this.f20641d;
    }

    public final r0 e() {
        return this.f20640c;
    }

    public final boolean f() {
        return this.f20639b;
    }

    public final boolean g() {
        return this.f20638a;
    }

    public String toString() {
        String k02;
        ArrayList arrayList = new ArrayList();
        if (this.f20638a) {
            arrayList.add("isRegularFile");
        }
        if (this.f20639b) {
            arrayList.add("isDirectory");
        }
        if (this.f20641d != null) {
            arrayList.add("byteCount=" + this.f20641d);
        }
        if (this.f20642e != null) {
            arrayList.add("createdAt=" + this.f20642e);
        }
        if (this.f20643f != null) {
            arrayList.add("lastModifiedAt=" + this.f20643f);
        }
        if (this.f20644g != null) {
            arrayList.add("lastAccessedAt=" + this.f20644g);
        }
        if ((!this.f20645h.isEmpty()) != false) {
            arrayList.add("extras=" + this.f20645h);
        }
        k02 = ec.b0.k0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
        return k02;
    }

    public /* synthetic */ i(boolean z10, boolean z11, r0 r0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : r0Var, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) == 0 ? l13 : null, (i10 & 128) != 0 ? ec.n0.h() : map);
    }
}
