package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: g  reason: collision with root package name */
    private static final x7.f f11041g = new x7.f("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f11042a;

    /* renamed from: b  reason: collision with root package name */
    private final x7.b0 f11043b;

    /* renamed from: c  reason: collision with root package name */
    private final g1 f11044c;

    /* renamed from: d  reason: collision with root package name */
    private final x7.b0 f11045d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f11046e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f11047f = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(d0 d0Var, x7.b0 b0Var, g1 g1Var, x7.b0 b0Var2) {
        this.f11042a = d0Var;
        this.f11043b = b0Var;
        this.f11044c = g1Var;
        this.f11045d = b0Var2;
    }

    private final s1 o(int i10) {
        Map map = this.f11046e;
        Integer valueOf = Integer.valueOf(i10);
        s1 s1Var = (s1) map.get(valueOf);
        if (s1Var != null) {
            return s1Var;
        }
        throw new c1(String.format("Could not find session %d while trying to get it", valueOf), i10);
    }

    private final Object p(u1 u1Var) {
        try {
            this.f11047f.lock();
            return u1Var.zza();
        } finally {
            this.f11047f.unlock();
        }
    }

    private static String q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new c1("Session without pack received.");
    }

    private static List r(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private final Map s(final List list) {
        return (Map) p(new u1() { // from class: com.google.android.play.core.assetpacks.o1
            @Override // com.google.android.play.core.assetpacks.u1
            public final Object zza() {
                return v1.this.g(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        Map map = this.f11046e;
        Integer valueOf = Integer.valueOf(i10);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        if (((s1) this.f11046e.get(valueOf)).f10978c.f10968d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!c0.c(r0.f10978c.f10968d, bundle.getInt(v7.b.a("status", q(bundle)))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean b(Bundle bundle) {
        t1 t1Var;
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        Map map = this.f11046e;
        Integer valueOf = Integer.valueOf(i10);
        boolean z10 = true;
        if (map.containsKey(valueOf)) {
            s1 o10 = o(i10);
            int i11 = bundle.getInt(v7.b.a("status", o10.f10978c.f10965a));
            r1 r1Var = o10.f10978c;
            int i12 = r1Var.f10968d;
            if (c0.c(i12, i11)) {
                f11041g.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i12));
                r1 r1Var2 = o10.f10978c;
                String str = r1Var2.f10965a;
                int i13 = r1Var2.f10968d;
                if (i13 == 4) {
                    ((t3) this.f11043b.zza()).a(i10, str);
                } else if (i13 == 5) {
                    ((t3) this.f11043b.zza()).zzi(i10);
                } else if (i13 == 6) {
                    ((t3) this.f11043b.zza()).e(Arrays.asList(str));
                }
            } else {
                r1Var.f10968d = i11;
                if (c0.d(i11)) {
                    l(i10);
                    this.f11044c.c(o10.f10978c.f10965a);
                } else {
                    for (t1 t1Var2 : r1Var.f10970f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(v7.b.b("chunk_intents", o10.f10978c.f10965a, t1Var2.f10994a));
                        if (parcelableArrayList != null) {
                            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                                if (parcelableArrayList.get(i14) != null && ((Intent) parcelableArrayList.get(i14)).getData() != null) {
                                    ((p1) t1Var2.f10997d.get(i14)).f10943a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String q10 = q(bundle);
            long j10 = bundle.getLong(v7.b.a("pack_version", q10));
            String string = bundle.getString(v7.b.a("pack_version_tag", q10), "");
            int i15 = bundle.getInt(v7.b.a("status", q10));
            long j11 = bundle.getLong(v7.b.a("total_bytes_to_download", q10));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(v7.b.a("slice_ids", q10));
            ArrayList arrayList = new ArrayList();
            for (String str2 : r(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(v7.b.b("chunk_intents", q10, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = r(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z10 = false;
                    }
                    arrayList2.add(new p1(z10));
                    z10 = true;
                }
                String string2 = bundle.getString(v7.b.b("uncompressed_hash_sha256", q10, str2));
                long j12 = bundle.getLong(v7.b.b("uncompressed_size", q10, str2));
                int i16 = bundle.getInt(v7.b.b("patch_format", q10, str2), 0);
                if (i16 != 0) {
                    t1Var = new t1(str2, string2, j12, arrayList2, 0, i16);
                } else {
                    t1Var = new t1(str2, string2, j12, arrayList2, bundle.getInt(v7.b.b("compression_format", q10, str2), 0), 0);
                }
                arrayList.add(t1Var);
                z10 = true;
            }
            this.f11046e.put(Integer.valueOf(i10), new s1(i10, bundle.getInt("app_version_code"), new r1(q10, j10, i15, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object c(String str, int i10, long j10) {
        s1 s1Var = (s1) s(Arrays.asList(str)).get(str);
        if (s1Var == null || c0.d(s1Var.f10978c.f10968d)) {
            f11041g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f11042a.d(str, i10, j10);
        s1Var.f10978c.f10968d = 4;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object d(int i10, int i11) {
        o(i10).f10978c.f10968d = 5;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object e(int i10) {
        s1 o10 = o(i10);
        r1 r1Var = o10.f10978c;
        if (c0.d(r1Var.f10968d)) {
            this.f11042a.d(r1Var.f10965a, o10.f10977b, r1Var.f10966b);
            r1 r1Var2 = o10.f10978c;
            int i11 = r1Var2.f10968d;
            if (i11 == 5 || i11 == 6) {
                this.f11042a.e(r1Var2.f10965a, o10.f10977b, r1Var2.f10966b);
                return null;
            }
            return null;
        }
        throw new c1(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map f() {
        return this.f11046e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map g(List list) {
        int i10;
        HashMap hashMap = new HashMap();
        for (s1 s1Var : this.f11046e.values()) {
            String str = s1Var.f10978c.f10965a;
            if (list.contains(str)) {
                s1 s1Var2 = (s1) hashMap.get(str);
                if (s1Var2 == null) {
                    i10 = -1;
                } else {
                    i10 = s1Var2.f10976a;
                }
                if (i10 < s1Var.f10976a) {
                    hashMap.put(str, s1Var);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.f11047f.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(final String str, final int i10, final long j10) {
        p(new u1() { // from class: com.google.android.play.core.assetpacks.n1
            @Override // com.google.android.play.core.assetpacks.u1
            public final Object zza() {
                v1.this.c(str, i10, j10);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.f11047f.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(final int i10, int i11) {
        final int i12 = 5;
        p(new u1(i10, i12) { // from class: com.google.android.play.core.assetpacks.k1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f10866b;

            @Override // com.google.android.play.core.assetpacks.u1
            public final Object zza() {
                v1.this.d(this.f10866b, 5);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(final int i10) {
        p(new u1() { // from class: com.google.android.play.core.assetpacks.j1
            @Override // com.google.android.play.core.assetpacks.u1
            public final Object zza() {
                v1.this.e(i10);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(final Bundle bundle) {
        return ((Boolean) p(new u1() { // from class: com.google.android.play.core.assetpacks.l1
            @Override // com.google.android.play.core.assetpacks.u1
            public final Object zza() {
                return v1.this.a(bundle);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(final Bundle bundle) {
        return ((Boolean) p(new u1() { // from class: com.google.android.play.core.assetpacks.m1
            @Override // com.google.android.play.core.assetpacks.u1
            public final Object zza() {
                return v1.this.b(bundle);
            }
        })).booleanValue();
    }
}
