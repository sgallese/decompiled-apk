package z1;

import d2.r;
import d2.s;
import dc.w;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: LruCache.kt */
/* loaded from: classes.dex */
public class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final s f26381a = r.a();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<K, V> f26382b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<K> f26383c;

    /* renamed from: d  reason: collision with root package name */
    private int f26384d;

    /* renamed from: e  reason: collision with root package name */
    private int f26385e;

    /* renamed from: f  reason: collision with root package name */
    private int f26386f;

    /* renamed from: g  reason: collision with root package name */
    private int f26387g;

    /* renamed from: h  reason: collision with root package name */
    private int f26388h;

    /* renamed from: i  reason: collision with root package name */
    private int f26389i;

    /* renamed from: j  reason: collision with root package name */
    private int f26390j;

    public b(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f26385e = i10;
            this.f26382b = new HashMap<>(0, 0.75f);
            this.f26383c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int g(K k10, V v10) {
        boolean z10;
        int i10 = i(k10, v10);
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + k10 + '=' + v10).toString());
    }

    protected V b(K k10) {
        return null;
    }

    public final V d(K k10) {
        synchronized (this.f26381a) {
            V v10 = this.f26382b.get(k10);
            if (v10 != null) {
                this.f26383c.remove(k10);
                this.f26383c.add(k10);
                this.f26389i++;
                return v10;
            }
            this.f26390j++;
            V b10 = b(k10);
            if (b10 == null) {
                return null;
            }
            synchronized (this.f26381a) {
                this.f26387g++;
                V put = this.f26382b.put(k10, b10);
                this.f26383c.remove(k10);
                this.f26383c.add(k10);
                if (put != null) {
                    this.f26382b.put(k10, put);
                    v10 = put;
                } else {
                    this.f26384d = h() + g(k10, b10);
                }
                w wVar = w.f13270a;
            }
            if (v10 != null) {
                c(false, k10, b10, v10);
                return v10;
            }
            j(this.f26385e);
            return b10;
        }
    }

    public final V e(K k10, V v10) {
        V put;
        if (k10 != null && v10 != null) {
            synchronized (this.f26381a) {
                this.f26386f++;
                this.f26384d = h() + g(k10, v10);
                put = this.f26382b.put(k10, v10);
                if (put != null) {
                    this.f26384d = h() - g(k10, put);
                }
                if (this.f26383c.contains(k10)) {
                    this.f26383c.remove(k10);
                }
                this.f26383c.add(k10);
            }
            if (put != null) {
                c(false, k10, put, v10);
            }
            j(this.f26385e);
            return put;
        }
        throw null;
    }

    public final V f(K k10) {
        V remove;
        k10.getClass();
        synchronized (this.f26381a) {
            remove = this.f26382b.remove(k10);
            this.f26383c.remove(k10);
            if (remove != null) {
                this.f26384d = h() - g(k10, remove);
            }
            w wVar = w.f13270a;
        }
        if (remove != null) {
            c(false, k10, remove, null);
        }
        return remove;
    }

    public final int h() {
        int i10;
        synchronized (this.f26381a) {
            i10 = this.f26384d;
        }
        return i10;
    }

    protected int i(K k10, V v10) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            d2.s r0 = r7.f26381a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            if (r1 < 0) goto L89
            java.util.HashMap<K, V> r1 = r7.f26382b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L17
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
        L17:
            java.util.HashMap<K, V> r1 = r7.f26382b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r2 = r7.f26383c     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != r2) goto L89
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L74
            java.util.HashMap<K, V> r1 = r7.f26382b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L74
            java.util.LinkedHashSet<K> r1 = r7.f26383c     // Catch: java.lang.Throwable -> L91
            java.lang.Object r1 = ec.r.Z(r1)     // Catch: java.lang.Throwable -> L91
            java.util.HashMap<K, V> r4 = r7.f26382b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L6c
            java.util.HashMap<K, V> r5 = r7.f26382b     // Catch: java.lang.Throwable -> L91
            java.util.Map r5 = qc.k0.d(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r5 = r7.f26383c     // Catch: java.lang.Throwable -> L91
            java.util.Collection r5 = qc.k0.a(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L91
            qc.q.f(r1)     // Catch: java.lang.Throwable -> L91
            qc.q.f(r4)     // Catch: java.lang.Throwable -> L91
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L91
            int r5 = r5 - r6
            r7.f26384d = r5     // Catch: java.lang.Throwable -> L91
            int r5 = r7.f26388h     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + r2
            r7.f26388h = r5     // Catch: java.lang.Throwable -> L91
            goto L76
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L74:
            r1 = r3
            r4 = r1
        L76:
            dc.w r5 = dc.w.f13270a     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            if (r1 != 0) goto L7e
            if (r4 != 0) goto L7e
            return
        L7e:
            qc.q.f(r1)
            qc.q.f(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L89:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.b.j(int):void");
    }

    public String toString() {
        int i10;
        String str;
        synchronized (this.f26381a) {
            int i11 = this.f26389i;
            int i12 = this.f26390j + i11;
            if (i12 != 0) {
                i10 = (i11 * 100) / i12;
            } else {
                i10 = 0;
            }
            str = "LruCache[maxSize=" + this.f26385e + ",hits=" + this.f26389i + ",misses=" + this.f26390j + ",hitRate=" + i10 + "%]";
        }
        return str;
    }

    protected void c(boolean z10, K k10, V v10, V v11) {
    }
}
