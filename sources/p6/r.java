package p6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j$.util.Objects;
import j6.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import l6.c;
import r6.a;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f21141a;

    /* renamed from: b  reason: collision with root package name */
    private final j6.e f21142b;

    /* renamed from: c  reason: collision with root package name */
    private final q6.d f21143c;

    /* renamed from: d  reason: collision with root package name */
    private final x f21144d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f21145e;

    /* renamed from: f  reason: collision with root package name */
    private final r6.a f21146f;

    /* renamed from: g  reason: collision with root package name */
    private final s6.a f21147g;

    /* renamed from: h  reason: collision with root package name */
    private final s6.a f21148h;

    /* renamed from: i  reason: collision with root package name */
    private final q6.c f21149i;

    public r(Context context, j6.e eVar, q6.d dVar, x xVar, Executor executor, r6.a aVar, s6.a aVar2, s6.a aVar3, q6.c cVar) {
        this.f21141a = context;
        this.f21142b = eVar;
        this.f21143c = dVar;
        this.f21144d = xVar;
        this.f21145e = executor;
        this.f21146f = aVar;
        this.f21147g = aVar2;
        this.f21148h = aVar3;
        this.f21149i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(i6.p pVar) {
        return Boolean.valueOf(this.f21143c.s(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(i6.p pVar) {
        return this.f21143c.o0(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, i6.p pVar, long j10) {
        this.f21143c.M0(iterable);
        this.f21143c.G(pVar, this.f21147g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f21143c.i(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f21149i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f21149i.c(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(i6.p pVar, long j10) {
        this.f21143c.G(pVar, this.f21147g.a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(i6.p pVar, int i10) {
        this.f21144d.a(pVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final i6.p pVar, final int i10, Runnable runnable) {
        try {
            try {
                r6.a aVar = this.f21146f;
                final q6.d dVar = this.f21143c;
                Objects.requireNonNull(dVar);
                aVar.d(new a.InterfaceC0500a() { // from class: p6.i
                    @Override // r6.a.InterfaceC0500a
                    public final Object execute() {
                        return Integer.valueOf(q6.d.this.f());
                    }
                });
                if (!k()) {
                    this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.j
                        @Override // r6.a.InterfaceC0500a
                        public final Object execute() {
                            Object s10;
                            s10 = r.this.s(pVar, i10);
                            return s10;
                        }
                    });
                } else {
                    u(pVar, i10);
                }
            } catch (SynchronizationException unused) {
                this.f21144d.a(pVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public i6.i j(j6.m mVar) {
        r6.a aVar = this.f21146f;
        final q6.c cVar = this.f21149i;
        Objects.requireNonNull(cVar);
        return mVar.b(i6.i.a().i(this.f21147g.a()).k(this.f21148h.a()).j("GDT_CLIENT_METRICS").h(new i6.h(g6.b.b("proto"), ((l6.a) aVar.d(new a.InterfaceC0500a() { // from class: p6.h
            @Override // r6.a.InterfaceC0500a
            public final Object execute() {
                return q6.c.this.e();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f21141a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public j6.g u(final i6.p pVar, int i10) {
        j6.g a10;
        j6.m a11 = this.f21142b.a(pVar.b());
        long j10 = 0;
        j6.g e10 = j6.g.e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.k
                @Override // r6.a.InterfaceC0500a
                public final Object execute() {
                    Boolean l10;
                    l10 = r.this.l(pVar);
                    return l10;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.l
                    @Override // r6.a.InterfaceC0500a
                    public final Object execute() {
                        Iterable m10;
                        m10 = r.this.m(pVar);
                        return m10;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e10;
                }
                if (a11 == null) {
                    m6.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    a10 = j6.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((q6.k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(a11));
                    }
                    a10 = a11.a(j6.f.a().b(arrayList).c(pVar.c()).a());
                }
                e10 = a10;
                if (e10.c() == g.a.TRANSIENT_ERROR) {
                    this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.m
                        @Override // r6.a.InterfaceC0500a
                        public final Object execute() {
                            Object n10;
                            n10 = r.this.n(iterable, pVar, j11);
                            return n10;
                        }
                    });
                    this.f21144d.b(pVar, i10 + 1, true);
                    return e10;
                }
                this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.n
                    @Override // r6.a.InterfaceC0500a
                    public final Object execute() {
                        Object o10;
                        o10 = r.this.o(iterable);
                        return o10;
                    }
                });
                if (e10.c() == g.a.OK) {
                    j10 = Math.max(j11, e10.b());
                    if (pVar.e()) {
                        this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.o
                            @Override // r6.a.InterfaceC0500a
                            public final Object execute() {
                                Object p10;
                                p10 = r.this.p();
                                return p10;
                            }
                        });
                    }
                } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String j12 = ((q6.k) it2.next()).b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.p
                        @Override // r6.a.InterfaceC0500a
                        public final Object execute() {
                            Object q10;
                            q10 = r.this.q(hashMap);
                            return q10;
                        }
                    });
                }
            }
            this.f21146f.d(new a.InterfaceC0500a() { // from class: p6.q
                @Override // r6.a.InterfaceC0500a
                public final Object execute() {
                    Object r10;
                    r10 = r.this.r(pVar, j11);
                    return r10;
                }
            });
            return e10;
        }
    }

    public void v(final i6.p pVar, final int i10, final Runnable runnable) {
        this.f21145e.execute(new Runnable() { // from class: p6.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(pVar, i10, runnable);
            }
        });
    }
}
