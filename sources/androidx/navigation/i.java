package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.f;
import androidx.navigation.h;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import dc.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qc.k0;
import qc.r;
import yc.v;

/* compiled from: NavDestination.kt */
/* loaded from: classes.dex */
public class i {

    /* renamed from: w  reason: collision with root package name */
    public static final a f5309w = new a(null);

    /* renamed from: x  reason: collision with root package name */
    private static final Map<String, Class<?>> f5310x = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final String f5311f;

    /* renamed from: m  reason: collision with root package name */
    private j f5312m;

    /* renamed from: p  reason: collision with root package name */
    private String f5313p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f5314q;

    /* renamed from: r  reason: collision with root package name */
    private final List<f> f5315r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.collection.h<k3.e> f5316s;

    /* renamed from: t  reason: collision with root package name */
    private Map<String, androidx.navigation.b> f5317t;

    /* renamed from: u  reason: collision with root package name */
    private int f5318u;

    /* renamed from: v  reason: collision with root package name */
    private String f5319v;

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: NavDestination.kt */
        /* renamed from: androidx.navigation.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0116a extends r implements pc.l<i, i> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0116a f5320f = new C0116a();

            C0116a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final i invoke(i iVar) {
                qc.q.i(iVar, "it");
                return iVar.r();
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final String a(String str) {
            if (str != null) {
                return "android-app://androidx.navigation/" + str;
            }
            return "";
        }

        public final String b(Context context, int i10) {
            String valueOf;
            qc.q.i(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                valueOf = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i10);
            }
            qc.q.h(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        public final xc.g<i> c(i iVar) {
            qc.q.i(iVar, "<this>");
            return xc.j.f(iVar, C0116a.f5320f);
        }
    }

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: f  reason: collision with root package name */
        private final i f5321f;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f5322m;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f5323p;

        /* renamed from: q  reason: collision with root package name */
        private final int f5324q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f5325r;

        /* renamed from: s  reason: collision with root package name */
        private final int f5326s;

        public b(i iVar, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            qc.q.i(iVar, "destination");
            this.f5321f = iVar;
            this.f5322m = bundle;
            this.f5323p = z10;
            this.f5324q = i10;
            this.f5325r = z11;
            this.f5326s = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            qc.q.i(bVar, TaskSetupFragment.TYPE_OTHER);
            boolean z10 = this.f5323p;
            if (z10 && !bVar.f5323p) {
                return 1;
            }
            if (!z10 && bVar.f5323p) {
                return -1;
            }
            int i10 = this.f5324q - bVar.f5324q;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f5322m;
            if (bundle != null && bVar.f5322m == null) {
                return 1;
            }
            if (bundle == null && bVar.f5322m != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f5322m;
                qc.q.f(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f5325r;
            if (z11 && !bVar.f5325r) {
                return 1;
            }
            if (!z11 && bVar.f5325r) {
                return -1;
            }
            return this.f5326s - bVar.f5326s;
        }

        public final i d() {
            return this.f5321f;
        }

        public final Bundle f() {
            return this.f5322m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.l<String, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f5327f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.f5327f = fVar;
        }

        @Override // pc.l
        public final Boolean invoke(String str) {
            qc.q.i(str, "key");
            return Boolean.valueOf(!this.f5327f.j().contains(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.l<String, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bundle f5328f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f5328f = bundle;
        }

        @Override // pc.l
        public final Boolean invoke(String str) {
            qc.q.i(str, "key");
            return Boolean.valueOf(!this.f5328f.containsKey(str));
        }
    }

    public i(String str) {
        qc.q.i(str, "navigatorName");
        this.f5311f = str;
        this.f5315r = new ArrayList();
        this.f5316s = new androidx.collection.h<>();
        this.f5317t = new LinkedHashMap();
    }

    public static /* synthetic */ int[] j(i iVar, i iVar2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                iVar2 = null;
            }
            return iVar.i(iVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    private final boolean v(f fVar, Uri uri, Map<String, androidx.navigation.b> map) {
        return k3.i.a(map, new d(fVar.p(uri, map))).isEmpty();
    }

    public final void A(int i10, k3.e eVar) {
        boolean z10;
        qc.q.i(eVar, "action");
        if (G()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f5316s.n(i10, eVar);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void C(int i10) {
        this.f5318u = i10;
        this.f5313p = null;
    }

    public final void D(CharSequence charSequence) {
        this.f5314q = charSequence;
    }

    public final void E(j jVar) {
        this.f5312m = jVar;
    }

    public final void F(String str) {
        boolean u10;
        Object obj;
        if (str != null) {
            u10 = v.u(str);
            if ((!u10) != false) {
                String a10 = f5309w.a(str);
                C(a10.hashCode());
                f(a10);
            } else {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
        } else {
            C(0);
        }
        List<f> list = this.f5315r;
        List<f> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (qc.q.d(((f) obj).y(), f5309w.a(this.f5319v))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        k0.a(list2).remove(obj);
        this.f5319v = str;
    }

    public boolean G() {
        return true;
    }

    public final void a(String str, androidx.navigation.b bVar) {
        qc.q.i(str, "argumentName");
        qc.q.i(bVar, "argument");
        this.f5317t.put(str, bVar);
    }

    public final void e(f fVar) {
        qc.q.i(fVar, "navDeepLink");
        List<String> a10 = k3.i.a(l(), new c(fVar));
        if (a10.isEmpty()) {
            this.f5315r.add(fVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + fVar.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a10).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.i.equals(java.lang.Object):boolean");
    }

    public final void f(String str) {
        qc.q.i(str, "uriPattern");
        e(new f.a().d(str).a());
    }

    public final Bundle h(Bundle bundle) {
        boolean z10;
        if (bundle == null) {
            Map<String, androidx.navigation.b> map = this.f5317t;
            if (map != null && !map.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, androidx.navigation.b> entry : this.f5317t.entrySet()) {
            entry.getValue().d(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, androidx.navigation.b> entry2 : this.f5317t.entrySet()) {
                String key = entry2.getKey();
                androidx.navigation.b value = entry2.getValue();
                if (!value.e(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        Set<String> keySet;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f5318u * 31;
        String str = this.f5319v;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = i17 + i10;
        for (f fVar : this.f5315r) {
            int i19 = i18 * 31;
            String y10 = fVar.y();
            if (y10 != null) {
                i14 = y10.hashCode();
            } else {
                i14 = 0;
            }
            int i20 = (i19 + i14) * 31;
            String i21 = fVar.i();
            if (i21 != null) {
                i15 = i21.hashCode();
            } else {
                i15 = 0;
            }
            int i22 = (i20 + i15) * 31;
            String t10 = fVar.t();
            if (t10 != null) {
                i16 = t10.hashCode();
            } else {
                i16 = 0;
            }
            i18 = i22 + i16;
        }
        Iterator a10 = androidx.collection.i.a(this.f5316s);
        while (a10.hasNext()) {
            k3.e eVar = (k3.e) a10.next();
            int b10 = ((i18 * 31) + eVar.b()) * 31;
            m c10 = eVar.c();
            if (c10 != null) {
                i12 = c10.hashCode();
            } else {
                i12 = 0;
            }
            i18 = b10 + i12;
            Bundle a11 = eVar.a();
            if (a11 != null && (keySet = a11.keySet()) != null) {
                qc.q.h(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i23 = i18 * 31;
                    Bundle a12 = eVar.a();
                    qc.q.f(a12);
                    Object obj = a12.get(str2);
                    if (obj != null) {
                        i13 = obj.hashCode();
                    } else {
                        i13 = 0;
                    }
                    i18 = i23 + i13;
                }
            }
        }
        for (String str3 : l().keySet()) {
            int hashCode = ((i18 * 31) + str3.hashCode()) * 31;
            androidx.navigation.b bVar = l().get(str3);
            if (bVar != null) {
                i11 = bVar.hashCode();
            } else {
                i11 = 0;
            }
            i18 = hashCode + i11;
        }
        return i18;
    }

    public final int[] i(i iVar) {
        j jVar;
        ec.k kVar = new ec.k();
        j jVar2 = this;
        while (true) {
            qc.q.f(jVar2);
            j jVar3 = jVar2.f5312m;
            if (iVar != null) {
                jVar = iVar.f5312m;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                j jVar4 = iVar.f5312m;
                qc.q.f(jVar4);
                if (jVar4.I(jVar2.f5318u) == jVar2) {
                    kVar.f(jVar2);
                    break;
                }
            }
            if (jVar3 == null || jVar3.P() != jVar2.f5318u) {
                kVar.f(jVar2);
            }
            if (qc.q.d(jVar3, iVar) || jVar3 == null) {
                break;
            }
            jVar2 = jVar3;
        }
        List C0 = ec.r.C0(kVar);
        ArrayList arrayList = new ArrayList(ec.r.s(C0, 10));
        Iterator it = C0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((i) it.next()).f5318u));
        }
        return ec.r.B0(arrayList);
    }

    public final k3.e k(int i10) {
        k3.e g10;
        if (this.f5316s.k()) {
            g10 = null;
        } else {
            g10 = this.f5316s.g(i10);
        }
        if (g10 == null) {
            j jVar = this.f5312m;
            if (jVar == null) {
                return null;
            }
            return jVar.k(i10);
        }
        return g10;
    }

    public final Map<String, androidx.navigation.b> l() {
        return ec.k0.r(this.f5317t);
    }

    public String m() {
        String str = this.f5313p;
        if (str == null) {
            return String.valueOf(this.f5318u);
        }
        return str;
    }

    public final int n() {
        return this.f5318u;
    }

    public final CharSequence o() {
        return this.f5314q;
    }

    public final String p() {
        return this.f5311f;
    }

    public final j r() {
        return this.f5312m;
    }

    public final String s() {
        return this.f5319v;
    }

    public boolean t(Uri uri) {
        qc.q.i(uri, "deepLink");
        return u(new h(uri, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.f5313p
            if (r1 != 0) goto L28
            java.lang.String r1 = "0x"
            r0.append(r1)
            int r1 = r2.f5318u
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            goto L2b
        L28:
            r0.append(r1)
        L2b:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r1 = r2.f5319v
            if (r1 == 0) goto L3d
            boolean r1 = yc.m.u(r1)
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r1 = 0
            goto L3e
        L3d:
            r1 = 1
        L3e:
            if (r1 != 0) goto L4a
            java.lang.String r1 = " route="
            r0.append(r1)
            java.lang.String r1 = r2.f5319v
            r0.append(r1)
        L4a:
            java.lang.CharSequence r1 = r2.f5314q
            if (r1 == 0) goto L58
            java.lang.String r1 = " label="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.f5314q
            r0.append(r1)
        L58:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sb.toString()"
            qc.q.h(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.i.toString():java.lang.String");
    }

    public boolean u(h hVar) {
        qc.q.i(hVar, "deepLinkRequest");
        if (w(hVar) != null) {
            return true;
        }
        return false;
    }

    public b w(h hVar) {
        Bundle bundle;
        boolean z10;
        int i10;
        qc.q.i(hVar, "navDeepLinkRequest");
        if (this.f5315r.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (f fVar : this.f5315r) {
            Uri c10 = hVar.c();
            if (c10 != null) {
                bundle = fVar.o(c10, l());
            } else {
                bundle = null;
            }
            int h10 = fVar.h(c10);
            String a10 = hVar.a();
            if (a10 != null && qc.q.d(a10, fVar.i())) {
                z10 = true;
            } else {
                z10 = false;
            }
            String b10 = hVar.b();
            if (b10 != null) {
                i10 = fVar.u(b10);
            } else {
                i10 = -1;
            }
            if (bundle == null) {
                if (z10 || i10 > -1) {
                    if (v(fVar, c10, l())) {
                    }
                }
            }
            b bVar2 = new b(this, bundle, fVar.z(), h10, z10, i10);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public final b x(String str) {
        qc.q.i(str, "route");
        h.a.C0115a c0115a = h.a.f5305d;
        Uri parse = Uri.parse(f5309w.a(str));
        qc.q.e(parse, "Uri.parse(this)");
        h a10 = c0115a.a(parse).a();
        if (this instanceof j) {
            return ((j) this).R(a10);
        }
        return w(a10);
    }

    public void y(Context context, AttributeSet attributeSet) {
        qc.q.i(context, "context");
        qc.q.i(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l3.a.f19522x);
        qc.q.h(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        F(obtainAttributes.getString(l3.a.A));
        int i10 = l3.a.f19524z;
        if (obtainAttributes.hasValue(i10)) {
            C(obtainAttributes.getResourceId(i10, 0));
            this.f5313p = f5309w.b(context, this.f5318u);
        }
        this.f5314q = obtainAttributes.getText(l3.a.f19523y);
        w wVar = w.f13270a;
        obtainAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(p<? extends i> pVar) {
        this(q.f5392b.a(pVar.getClass()));
        qc.q.i(pVar, "navigator");
    }
}
