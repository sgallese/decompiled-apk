package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x;
import androidx.lifecycle.y0;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import qc.r;

/* compiled from: NavBackStackEntry.kt */
/* loaded from: classes.dex */
public final class c implements v, c1, androidx.lifecycle.o, w3.d {
    public static final a B = new a(null);
    private final y0.b A;

    /* renamed from: f */
    private final Context f5142f;

    /* renamed from: m */
    private i f5143m;

    /* renamed from: p */
    private final Bundle f5144p;

    /* renamed from: q */
    private p.b f5145q;

    /* renamed from: r */
    private final k3.n f5146r;

    /* renamed from: s */
    private final String f5147s;

    /* renamed from: t */
    private final Bundle f5148t;

    /* renamed from: u */
    private x f5149u;

    /* renamed from: v */
    private final w3.c f5150v;

    /* renamed from: w */
    private boolean f5151w;

    /* renamed from: x */
    private final dc.f f5152x;

    /* renamed from: y */
    private final dc.f f5153y;

    /* renamed from: z */
    private p.b f5154z;

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public static /* synthetic */ c b(a aVar, Context context, i iVar, Bundle bundle, p.b bVar, k3.n nVar, String str, Bundle bundle2, int i10, Object obj) {
            Bundle bundle3;
            p.b bVar2;
            k3.n nVar2;
            String str2;
            Bundle bundle4;
            if ((i10 & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i10 & 8) != 0) {
                bVar2 = p.b.CREATED;
            } else {
                bVar2 = bVar;
            }
            if ((i10 & 16) != 0) {
                nVar2 = null;
            } else {
                nVar2 = nVar;
            }
            if ((i10 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                qc.q.h(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i10 & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return aVar.a(context, iVar, bundle3, bVar2, nVar2, str2, bundle4);
        }

        public final c a(Context context, i iVar, Bundle bundle, p.b bVar, k3.n nVar, String str, Bundle bundle2) {
            qc.q.i(iVar, "destination");
            qc.q.i(bVar, "hostLifecycleState");
            qc.q.i(str, "id");
            return new c(context, iVar, bundle, bVar, nVar, str, bundle2, null);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w3.d dVar) {
            super(dVar, null);
            qc.q.i(dVar, "owner");
        }

        @Override // androidx.lifecycle.a
        protected <T extends v0> T e(String str, Class<T> cls, n0 n0Var) {
            qc.q.i(str, "key");
            qc.q.i(cls, "modelClass");
            qc.q.i(n0Var, "handle");
            return new C0110c(n0Var);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* renamed from: androidx.navigation.c$c */
    /* loaded from: classes.dex */
    public static final class C0110c extends v0 {

        /* renamed from: a */
        private final n0 f5155a;

        public C0110c(n0 n0Var) {
            qc.q.i(n0Var, "handle");
            this.f5155a = n0Var;
        }

        public final n0 b() {
            return this.f5155a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.a<r0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            c.this = r1;
        }

        @Override // pc.a
        /* renamed from: a */
        public final r0 invoke() {
            Context context;
            Context context2 = c.this.f5142f;
            Application application = null;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
            }
            c cVar = c.this;
            return new r0(application, cVar, cVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class e extends r implements pc.a<n0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            c.this = r1;
        }

        @Override // pc.a
        /* renamed from: a */
        public final n0 invoke() {
            boolean z10;
            if (c.this.f5151w) {
                if (c.this.getLifecycle().b() != p.b.DESTROYED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return ((C0110c) new y0(c.this, new b(c.this)).a(C0110c.class)).b();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public /* synthetic */ c(Context context, i iVar, Bundle bundle, p.b bVar, k3.n nVar, String str, Bundle bundle2, qc.h hVar) {
        this(context, iVar, bundle, bVar, nVar, str, bundle2);
    }

    private final r0 d() {
        return (r0) this.f5152x.getValue();
    }

    public final Bundle c() {
        if (this.f5144p == null) {
            return null;
        }
        return new Bundle(this.f5144p);
    }

    public final i e() {
        return this.f5143m;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L90
            boolean r1 = r7 instanceof androidx.navigation.c
            if (r1 != 0) goto L9
            goto L90
        L9:
            java.lang.String r1 = r6.f5147s
            androidx.navigation.c r7 = (androidx.navigation.c) r7
            java.lang.String r2 = r7.f5147s
            boolean r1 = qc.q.d(r1, r2)
            if (r1 == 0) goto L90
            androidx.navigation.i r1 = r6.f5143m
            androidx.navigation.i r2 = r7.f5143m
            boolean r1 = qc.q.d(r1, r2)
            if (r1 == 0) goto L90
            androidx.lifecycle.p r1 = r6.getLifecycle()
            androidx.lifecycle.p r2 = r7.getLifecycle()
            boolean r1 = qc.q.d(r1, r2)
            if (r1 == 0) goto L90
            androidx.savedstate.a r1 = r6.getSavedStateRegistry()
            androidx.savedstate.a r2 = r7.getSavedStateRegistry()
            boolean r1 = qc.q.d(r1, r2)
            if (r1 == 0) goto L90
            android.os.Bundle r1 = r6.f5144p
            android.os.Bundle r2 = r7.f5144p
            boolean r1 = qc.q.d(r1, r2)
            r2 = 1
            if (r1 != 0) goto L8f
            android.os.Bundle r1 = r6.f5144p
            if (r1 == 0) goto L8c
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L8c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L61
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
        L5f:
            r7 = 1
            goto L88
        L61:
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f5144p
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f5144p
            if (r5 == 0) goto L80
            java.lang.Object r3 = r5.get(r3)
            goto L81
        L80:
            r3 = 0
        L81:
            boolean r3 = qc.q.d(r4, r3)
            if (r3 != 0) goto L65
            r7 = 0
        L88:
            if (r7 != r2) goto L8c
            r7 = 1
            goto L8d
        L8c:
            r7 = 0
        L8d:
            if (r7 == 0) goto L90
        L8f:
            r0 = 1
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.c.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.f5147s;
    }

    public final p.b g() {
        return this.f5154z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [qc.h, j3.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // androidx.lifecycle.o
    public j3.a getDefaultViewModelCreationExtras() {
        Context context;
        ?? r22 = 0;
        j3.d dVar = new j3.d(r22, 1, r22);
        Context context2 = this.f5142f;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            r22 = (Application) context;
        }
        if (r22 != 0) {
            dVar.c(y0.a.f5079g, r22);
        }
        dVar.c(o0.f5025a, this);
        dVar.c(o0.f5026b, this);
        Bundle c10 = c();
        if (c10 != null) {
            dVar.c(o0.f5027c, c10);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.o
    public y0.b getDefaultViewModelProviderFactory() {
        return this.A;
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        return this.f5149u;
    }

    @Override // w3.d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f5150v.b();
    }

    @Override // androidx.lifecycle.c1
    public b1 getViewModelStore() {
        boolean z10;
        if (this.f5151w) {
            if (getLifecycle().b() != p.b.DESTROYED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                k3.n nVar = this.f5146r;
                if (nVar != null) {
                    return nVar.a(this.f5147s);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final void h(p.a aVar) {
        qc.q.i(aVar, "event");
        this.f5145q = aVar.getTargetState();
        l();
    }

    public int hashCode() {
        Set<String> keySet;
        int i10;
        int hashCode = (this.f5147s.hashCode() * 31) + this.f5143m.hashCode();
        Bundle bundle = this.f5144p;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i11 = hashCode * 31;
                Object obj = this.f5144p.get((String) it.next());
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                hashCode = i11 + i10;
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i(Bundle bundle) {
        qc.q.i(bundle, "outBundle");
        this.f5150v.e(bundle);
    }

    public final void j(i iVar) {
        qc.q.i(iVar, "<set-?>");
        this.f5143m = iVar;
    }

    public final void k(p.b bVar) {
        qc.q.i(bVar, "maxState");
        this.f5154z = bVar;
        l();
    }

    public final void l() {
        if (!this.f5151w) {
            this.f5150v.c();
            this.f5151w = true;
            if (this.f5146r != null) {
                o0.c(this);
            }
            this.f5150v.d(this.f5148t);
        }
        if (this.f5145q.ordinal() < this.f5154z.ordinal()) {
            this.f5149u.o(this.f5145q);
        } else {
            this.f5149u.o(this.f5154z);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c.class.getSimpleName());
        sb2.append('(' + this.f5147s + ')');
        sb2.append(" destination=");
        sb2.append(this.f5143m);
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }

    private c(Context context, i iVar, Bundle bundle, p.b bVar, k3.n nVar, String str, Bundle bundle2) {
        dc.f b10;
        dc.f b11;
        this.f5142f = context;
        this.f5143m = iVar;
        this.f5144p = bundle;
        this.f5145q = bVar;
        this.f5146r = nVar;
        this.f5147s = str;
        this.f5148t = bundle2;
        this.f5149u = new x(this);
        this.f5150v = w3.c.f25360d.a(this);
        b10 = dc.h.b(new d());
        this.f5152x = b10;
        b11 = dc.h.b(new e());
        this.f5153y = b11;
        this.f5154z = p.b.INITIALIZED;
        this.A = d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c cVar, Bundle bundle) {
        this(cVar.f5142f, cVar.f5143m, bundle, cVar.f5145q, cVar.f5146r, cVar.f5147s, cVar.f5148t);
        qc.q.i(cVar, "entry");
        this.f5145q = cVar.f5145q;
        k(cVar.f5154z);
    }
}
