package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import dc.w;
import ec.b0;
import ec.s;
import ec.t;
import ec.u;
import ec.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qc.r;
import yc.v;

/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: q  reason: collision with root package name */
    private static final b f5219q = new b(null);

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f5220r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f5221s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a  reason: collision with root package name */
    private final String f5222a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5223b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5224c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f5225d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private String f5226e;

    /* renamed from: f  reason: collision with root package name */
    private final dc.f f5227f;

    /* renamed from: g  reason: collision with root package name */
    private final dc.f f5228g;

    /* renamed from: h  reason: collision with root package name */
    private final dc.f f5229h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5230i;

    /* renamed from: j  reason: collision with root package name */
    private final dc.f f5231j;

    /* renamed from: k  reason: collision with root package name */
    private final dc.f f5232k;

    /* renamed from: l  reason: collision with root package name */
    private final dc.f f5233l;

    /* renamed from: m  reason: collision with root package name */
    private final dc.f f5234m;

    /* renamed from: n  reason: collision with root package name */
    private String f5235n;

    /* renamed from: o  reason: collision with root package name */
    private final dc.f f5236o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5237p;

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0112a f5238d = new C0112a(null);

        /* renamed from: a  reason: collision with root package name */
        private String f5239a;

        /* renamed from: b  reason: collision with root package name */
        private String f5240b;

        /* renamed from: c  reason: collision with root package name */
        private String f5241c;

        /* compiled from: NavDeepLink.kt */
        /* renamed from: androidx.navigation.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0112a {
            private C0112a() {
            }

            public /* synthetic */ C0112a(qc.h hVar) {
                this();
            }
        }

        public final f a() {
            return new f(this.f5239a, this.f5240b, this.f5241c);
        }

        public final a b(String str) {
            boolean z10;
            qc.q.i(str, "action");
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f5240b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        public final a c(String str) {
            qc.q.i(str, "mimeType");
            this.f5241c = str;
            return this;
        }

        public final a d(String str) {
            qc.q.i(str, "uriPattern");
            this.f5239a = str;
            return this;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: f  reason: collision with root package name */
        private String f5242f;

        /* renamed from: m  reason: collision with root package name */
        private String f5243m;

        public c(String str) {
            List i10;
            boolean z10;
            qc.q.i(str, "mimeType");
            List<String> i11 = new yc.j("/").i(str, 0);
            if (!i11.isEmpty()) {
                ListIterator<String> listIterator = i11.listIterator(i11.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        i10 = b0.y0(i11, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            i10 = t.i();
            this.f5242f = (String) i10.get(0);
            this.f5243m = (String) i10.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10;
            qc.q.i(cVar, TaskSetupFragment.TYPE_OTHER);
            if (qc.q.d(this.f5242f, cVar.f5242f)) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (qc.q.d(this.f5243m, cVar.f5243m)) {
                return i10 + 1;
            }
            return i10;
        }

        public final String d() {
            return this.f5243m;
        }

        public final String f() {
            return this.f5242f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f5244a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f5245b = new ArrayList();

        public final void a(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f5245b.add(str);
        }

        public final List<String> b() {
            return this.f5245b;
        }

        public final String c() {
            return this.f5244a;
        }

        public final void d(String str) {
            this.f5244a = str;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class e extends r implements pc.a<List<String>> {
        e() {
            super(0);
        }

        @Override // pc.a
        public final List<String> invoke() {
            List<String> list;
            dc.l l10 = f.this.l();
            return (l10 == null || (list = (List) l10.c()) == null) ? new ArrayList() : list;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* renamed from: androidx.navigation.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0113f extends r implements pc.a<dc.l<? extends List<String>, ? extends String>> {
        C0113f() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final dc.l<List<String>, String> invoke() {
            return f.this.D();
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class g extends r implements pc.a<Pattern> {
        g() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String n10 = f.this.n();
            if (n10 != null) {
                return Pattern.compile(n10, 2);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class h extends r implements pc.a<String> {
        h() {
            super(0);
        }

        @Override // pc.a
        public final String invoke() {
            dc.l l10 = f.this.l();
            if (l10 != null) {
                return (String) l10.d();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    public static final class i extends r implements pc.l<String, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bundle f5250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f5250f = bundle;
        }

        @Override // pc.l
        public final Boolean invoke(String str) {
            qc.q.i(str, "argName");
            return Boolean.valueOf(!this.f5250f.containsKey(str));
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class j extends r implements pc.a<Boolean> {
        j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf((f.this.y() == null || Uri.parse(f.this.y()).getQuery() == null) ? false : true);
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class k extends r implements pc.a<Pattern> {
        k() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = f.this.f5235n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class l extends r implements pc.a<Pattern> {
        l() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = f.this.f5226e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    /* loaded from: classes.dex */
    static final class m extends r implements pc.a<Map<String, d>> {
        m() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Map<String, d> invoke() {
            return f.this.H();
        }
    }

    public f(String str, String str2, String str3) {
        dc.f b10;
        dc.f b11;
        dc.f a10;
        dc.f a11;
        dc.f a12;
        dc.f a13;
        dc.f b12;
        dc.f b13;
        this.f5222a = str;
        this.f5223b = str2;
        this.f5224c = str3;
        b10 = dc.h.b(new l());
        this.f5227f = b10;
        b11 = dc.h.b(new j());
        this.f5228g = b11;
        dc.j jVar = dc.j.NONE;
        a10 = dc.h.a(jVar, new m());
        this.f5229h = a10;
        a11 = dc.h.a(jVar, new C0113f());
        this.f5231j = a11;
        a12 = dc.h.a(jVar, new e());
        this.f5232k = a12;
        a13 = dc.h.a(jVar, new h());
        this.f5233l = a13;
        b12 = dc.h.b(new g());
        this.f5234m = b12;
        b13 = dc.h.b(new k());
        this.f5236o = b13;
        G();
        F();
    }

    private final boolean A() {
        return ((Boolean) this.f5228g.getValue()).booleanValue();
    }

    private final boolean B(Bundle bundle, String str, String str2, androidx.navigation.b bVar) {
        if (bVar != null) {
            bVar.a().d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    private final boolean C(Bundle bundle, String str, String str2, androidx.navigation.b bVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (bVar != null) {
            o<Object> a10 = bVar.a();
            a10.e(bundle, str, str2, a10.a(bundle, str));
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dc.l<List<String>, String> D() {
        String str = this.f5222a;
        if (str != null && Uri.parse(str).getFragment() != null) {
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(this.f5222a).getFragment();
            StringBuilder sb2 = new StringBuilder();
            qc.q.f(fragment);
            g(fragment, arrayList, sb2);
            String sb3 = sb2.toString();
            qc.q.h(sb3, "fragRegex.toString()");
            return dc.r.a(arrayList, sb3);
        }
        return null;
    }

    private final boolean E(List<String> list, d dVar, Bundle bundle, Map<String, androidx.navigation.b> map) {
        Matcher matcher;
        int s10;
        if (list != null) {
            for (String str : list) {
                String c10 = dVar.c();
                if (c10 != null) {
                    matcher = Pattern.compile(c10, 32).matcher(str);
                } else {
                    matcher = null;
                }
                if (matcher == null || !matcher.matches()) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                try {
                    List<String> b10 = dVar.b();
                    s10 = u.s(b10, 10);
                    ArrayList arrayList = new ArrayList(s10);
                    int i10 = 0;
                    for (Object obj : b10) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            t.r();
                        }
                        String str2 = (String) obj;
                        String group = matcher.group(i11);
                        if (group == null) {
                            group = "";
                        } else {
                            qc.q.h(group, "argMatcher.group(index + 1) ?: \"\"");
                        }
                        androidx.navigation.b bVar = map.get(str2);
                        if (C(bundle, str2, group, bVar)) {
                            if (!qc.q.d(group, '{' + str2 + '}') && B(bundle2, str2, group, bVar)) {
                                return false;
                            }
                        }
                        arrayList.add(w.f13270a);
                        i10 = i11;
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused) {
                }
            }
            return true;
        }
        return true;
    }

    private final void F() {
        String B;
        if (this.f5224c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f5224c).matches()) {
            c cVar = new c(this.f5224c);
            B = v.B("^(" + cVar.f() + "|[*]+)/(" + cVar.d() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
            this.f5235n = B;
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.f5224c + " does not match to required \"type/subtype\" format").toString());
    }

    private final void G() {
        boolean K;
        String B;
        boolean K2;
        if (this.f5222a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f5220r.matcher(this.f5222a).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f5222a);
        matcher.find();
        boolean z10 = false;
        String substring = this.f5222a.substring(0, matcher.start());
        qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        g(substring, this.f5225d, sb2);
        K = yc.w.K(sb2, ".*", false, 2, null);
        if (!K) {
            K2 = yc.w.K(sb2, "([^/]+?)", false, 2, null);
            if (!K2) {
                z10 = true;
            }
        }
        this.f5237p = z10;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb3 = sb2.toString();
        qc.q.h(sb3, "uriRegex.toString()");
        B = v.B(sb3, ".*", "\\E.*\\Q", false, 4, null);
        this.f5226e = B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, d> H() {
        boolean z10;
        Object c02;
        String B;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.f5222a);
        for (String str : parse.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParameters = parse.getQueryParameters(str);
            int i10 = 0;
            if (queryParameters.size() <= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                qc.q.h(queryParameters, "queryParams");
                c02 = b0.c0(queryParameters);
                String str2 = (String) c02;
                if (str2 == null) {
                    this.f5230i = true;
                    str2 = str;
                }
                Matcher matcher = f5221s.matcher(str2);
                d dVar = new d();
                while (matcher.find()) {
                    String group = matcher.group(1);
                    qc.q.g(group, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(group);
                    qc.q.h(str2, "queryParam");
                    String substring = str2.substring(i10, matcher.start());
                    qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(Pattern.quote(substring));
                    sb2.append("(.+?)?");
                    i10 = matcher.end();
                }
                if (i10 < str2.length()) {
                    qc.q.h(str2, "queryParam");
                    String substring2 = str2.substring(i10);
                    qc.q.h(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(Pattern.quote(substring2));
                }
                String sb3 = sb2.toString();
                qc.q.h(sb3, "argRegex.toString()");
                B = v.B(sb3, ".*", "\\E.*\\Q", false, 4, null);
                dVar.d(B);
                qc.q.h(str, "paramName");
                linkedHashMap.put(str, dVar);
            } else {
                throw new IllegalArgumentException(("Query parameter " + str + " must only be present once in " + this.f5222a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    private final void g(String str, List<String> list, StringBuilder sb2) {
        Matcher matcher = f5221s.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            qc.q.g(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i10) {
                String substring = str.substring(i10, matcher.start());
                qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append("([^/]+?)");
            i10 = matcher.end();
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            qc.q.h(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    private final List<String> k() {
        return (List) this.f5232k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dc.l<List<String>, String> l() {
        return (dc.l) this.f5231j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.f5234m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.f5233l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map<String, androidx.navigation.b> map) {
        int s10;
        List<String> list = this.f5225d;
        s10 = u.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                t.r();
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i11));
            androidx.navigation.b bVar = map.get(str);
            try {
                qc.q.h(decode, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (B(bundle, str, decode, bVar)) {
                    return false;
                }
                arrayList.add(w.f13270a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map<String, androidx.navigation.b> map) {
        String query;
        for (Map.Entry<String, d> entry : x().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.f5230i && (query = uri.getQuery()) != null && !qc.q.d(query, uri.toString())) {
                queryParameters = s.d(query);
            }
            if (!E(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map<String, androidx.navigation.b> map) {
        Matcher matcher;
        int s10;
        Pattern m10 = m();
        if (m10 != null) {
            matcher = m10.matcher(String.valueOf(str));
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return;
        }
        List<String> k10 = k();
        s10 = u.s(k10, 10);
        ArrayList arrayList = new ArrayList(s10);
        int i10 = 0;
        for (Object obj : k10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                t.r();
            }
            String str2 = (String) obj;
            String decode = Uri.decode(matcher.group(i11));
            androidx.navigation.b bVar = map.get(str2);
            try {
                qc.q.h(decode, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (B(bundle, str2, decode, bVar)) {
                    return;
                }
                arrayList.add(w.f13270a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.f5236o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f5227f.getValue();
    }

    private final Map<String, d> x() {
        return (Map) this.f5229h.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!qc.q.d(this.f5222a, fVar.f5222a) || !qc.q.d(this.f5223b, fVar.f5223b) || !qc.q.d(this.f5224c, fVar.f5224c)) {
            return false;
        }
        return true;
    }

    public final int h(Uri uri) {
        Set g02;
        if (uri != null && this.f5222a != null) {
            List<String> pathSegments = uri.getPathSegments();
            List<String> pathSegments2 = Uri.parse(this.f5222a).getPathSegments();
            qc.q.h(pathSegments, "requestedPathSegments");
            qc.q.h(pathSegments2, "uriPathSegments");
            g02 = b0.g0(pathSegments, pathSegments2);
            return g02.size();
        }
        return 0;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f5222a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + 0) * 31;
        String str2 = this.f5223b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f5224c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public final String i() {
        return this.f5223b;
    }

    public final List<String> j() {
        List r02;
        List<String> r03;
        List<String> list = this.f5225d;
        Collection<d> values = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            y.w(arrayList, ((d) it.next()).b());
        }
        r02 = b0.r0(list, arrayList);
        r03 = b0.r0(r02, k());
        return r03;
    }

    public final Bundle o(Uri uri, Map<String, androidx.navigation.b> map) {
        Matcher matcher;
        qc.q.i(uri, "deepLink");
        qc.q.i(map, "arguments");
        Pattern w10 = w();
        if (w10 != null) {
            matcher = w10.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, map)) {
            return null;
        }
        if (A() && !r(uri, bundle, map)) {
            return null;
        }
        s(uri.getFragment(), bundle, map);
        if ((!k3.i.a(map, new i(bundle)).isEmpty()) != false) {
            return null;
        }
        return bundle;
    }

    public final Bundle p(Uri uri, Map<String, androidx.navigation.b> map) {
        Matcher matcher;
        qc.q.i(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w10 = w();
        if (w10 != null) {
            matcher = w10.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null) {
            return bundle;
        }
        if (!matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, map);
        if (A()) {
            r(uri, bundle, map);
        }
        return bundle;
    }

    public final String t() {
        return this.f5224c;
    }

    public final int u(String str) {
        qc.q.i(str, "mimeType");
        if (this.f5224c != null) {
            Pattern v10 = v();
            qc.q.f(v10);
            if (v10.matcher(str).matches()) {
                return new c(this.f5224c).compareTo(new c(str));
            }
        }
        return -1;
    }

    public final String y() {
        return this.f5222a;
    }

    public final boolean z() {
        return this.f5237p;
    }
}
