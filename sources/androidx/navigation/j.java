package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.i;
import dc.w;
import ec.b0;
import ec.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import qc.r;
import yc.v;

/* compiled from: NavGraph.kt */
/* loaded from: classes.dex */
public class j extends i implements Iterable<i>, rc.a {
    public static final a C = new a(null);
    private String A;
    private String B;

    /* renamed from: y  reason: collision with root package name */
    private final androidx.collection.h<i> f5329y;

    /* renamed from: z  reason: collision with root package name */
    private int f5330z;

    /* compiled from: NavGraph.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NavGraph.kt */
        /* renamed from: androidx.navigation.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0117a extends r implements pc.l<i, i> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0117a f5331f = new C0117a();

            C0117a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final i invoke(i iVar) {
                qc.q.i(iVar, "it");
                if (iVar instanceof j) {
                    j jVar = (j) iVar;
                    return jVar.I(jVar.P());
                }
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final i a(j jVar) {
            xc.g f10;
            Object u10;
            qc.q.i(jVar, "<this>");
            f10 = xc.m.f(jVar.I(jVar.P()), C0117a.f5331f);
            u10 = xc.o.u(f10);
            return (i) u10;
        }
    }

    /* compiled from: NavGraph.kt */
    /* loaded from: classes.dex */
    public static final class b implements Iterator<i>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f5332f = -1;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5333m;

        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public i next() {
            if (hasNext()) {
                this.f5333m = true;
                androidx.collection.h<i> N = j.this.N();
                int i10 = this.f5332f + 1;
                this.f5332f = i10;
                i r10 = N.r(i10);
                qc.q.h(r10, "nodes.valueAt(++index)");
                return r10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5332f + 1 < j.this.N().q()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f5333m) {
                androidx.collection.h<i> N = j.this.N();
                N.r(this.f5332f).E(null);
                N.o(this.f5332f);
                this.f5332f--;
                this.f5333m = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p<? extends j> pVar) {
        super(pVar);
        qc.q.i(pVar, "navGraphNavigator");
        this.f5329y = new androidx.collection.h<>();
    }

    private final void S(int i10) {
        boolean z10;
        if (i10 != n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.B != null) {
                U(null);
            }
            this.f5330z = i10;
            this.A = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void U(String str) {
        boolean u10;
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if ((!qc.q.d(str, s())) != false) {
            u10 = v.u(str);
            if ((!u10) != false) {
                hashCode = i.f5309w.a(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        }
        this.f5330z = hashCode;
        this.B = str;
    }

    public final void H(i iVar) {
        boolean z10;
        boolean z11;
        qc.q.i(iVar, "node");
        int n10 = iVar.n();
        String s10 = iVar.s();
        boolean z12 = false;
        if (n10 == 0 && s10 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (s() != null && (!qc.q.d(s10, s())) == false) {
                throw new IllegalArgumentException(("Destination " + iVar + " cannot have the same route as graph " + this).toString());
            }
            if (n10 != n()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i g10 = this.f5329y.g(n10);
                if (g10 == iVar) {
                    return;
                }
                if (iVar.r() == null) {
                    z12 = true;
                }
                if (z12) {
                    if (g10 != null) {
                        g10.E(null);
                    }
                    iVar.E(this);
                    this.f5329y.n(iVar.n(), iVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + iVar + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final i I(int i10) {
        return J(i10, true);
    }

    public final i J(int i10, boolean z10) {
        i g10 = this.f5329y.g(i10);
        if (g10 == null) {
            if (z10 && r() != null) {
                j r10 = r();
                qc.q.f(r10);
                return r10.I(i10);
            }
            return null;
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.navigation.i K(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = yc.m.u(r3)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            if (r1 != 0) goto L14
            androidx.navigation.i r3 = r2.M(r3, r0)
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.j.K(java.lang.String):androidx.navigation.i");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public final i M(String str, boolean z10) {
        xc.g c10;
        ?? r22;
        boolean z11;
        qc.q.i(str, "route");
        i g10 = this.f5329y.g(i.f5309w.a(str).hashCode());
        if (g10 == null) {
            c10 = xc.m.c(androidx.collection.i.a(this.f5329y));
            Iterator it = c10.iterator();
            while (true) {
                if (it.hasNext()) {
                    r22 = it.next();
                    if (((i) r22).x(str) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    r22 = 0;
                    break;
                }
            }
            g10 = r22;
        }
        if (g10 == null) {
            if (!z10 || r() == null) {
                return null;
            }
            j r10 = r();
            qc.q.f(r10);
            return r10.K(str);
        }
        return g10;
    }

    public final androidx.collection.h<i> N() {
        return this.f5329y;
    }

    public final String O() {
        if (this.A == null) {
            String str = this.B;
            if (str == null) {
                str = String.valueOf(this.f5330z);
            }
            this.A = str;
        }
        String str2 = this.A;
        qc.q.f(str2);
        return str2;
    }

    public final int P() {
        return this.f5330z;
    }

    public final String Q() {
        return this.B;
    }

    public final i.b R(h hVar) {
        qc.q.i(hVar, "request");
        return super.w(hVar);
    }

    @Override // androidx.navigation.i
    public boolean equals(Object obj) {
        xc.g c10;
        List E;
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        c10 = xc.m.c(androidx.collection.i.a(this.f5329y));
        E = xc.o.E(c10);
        j jVar = (j) obj;
        Iterator a10 = androidx.collection.i.a(jVar.f5329y);
        while (a10.hasNext()) {
            E.remove((i) a10.next());
        }
        if (!super.equals(obj) || this.f5329y.q() != jVar.f5329y.q() || P() != jVar.P() || !E.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.navigation.i
    public int hashCode() {
        int P = P();
        androidx.collection.h<i> hVar = this.f5329y;
        int q10 = hVar.q();
        for (int i10 = 0; i10 < q10; i10++) {
            P = (((P * 31) + hVar.l(i10)) * 31) + hVar.r(i10).hashCode();
        }
        return P;
    }

    @Override // java.lang.Iterable
    public final Iterator<i> iterator() {
        return new b();
    }

    @Override // androidx.navigation.i
    public String m() {
        if (n() != 0) {
            return super.m();
        }
        return "the root navigation";
    }

    @Override // androidx.navigation.i
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        i K = K(this.B);
        if (K == null) {
            K = I(P());
        }
        sb2.append(" startDestination=");
        if (K == null) {
            String str = this.B;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.A;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f5330z));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(K.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }

    @Override // androidx.navigation.i
    public i.b w(h hVar) {
        Comparable o02;
        List m10;
        Comparable o03;
        qc.q.i(hVar, "navDeepLinkRequest");
        i.b w10 = super.w(hVar);
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = iterator();
        while (it.hasNext()) {
            i.b w11 = it.next().w(hVar);
            if (w11 != null) {
                arrayList.add(w11);
            }
        }
        o02 = b0.o0(arrayList);
        m10 = t.m(w10, (i.b) o02);
        o03 = b0.o0(m10);
        return (i.b) o03;
    }

    @Override // androidx.navigation.i
    public void y(Context context, AttributeSet attributeSet) {
        qc.q.i(context, "context");
        qc.q.i(attributeSet, "attrs");
        super.y(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l3.a.f19520v);
        qc.q.h(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        S(obtainAttributes.getResourceId(l3.a.f19521w, 0));
        this.A = i.f5309w.b(context, this.f5330z);
        w wVar = w.f13270a;
        obtainAttributes.recycle();
    }
}
