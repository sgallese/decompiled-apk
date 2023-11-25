package v1;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: AnnotatedString.kt */
/* loaded from: classes.dex */
public final class d implements CharSequence {

    /* renamed from: f  reason: collision with root package name */
    private final String f24414f;

    /* renamed from: m  reason: collision with root package name */
    private final List<b<b0>> f24415m;

    /* renamed from: p  reason: collision with root package name */
    private final List<b<s>> f24416p;

    /* renamed from: q  reason: collision with root package name */
    private final List<b<? extends Object>> f24417q;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Integer.valueOf(((b) t10).f()), Integer.valueOf(((b) t11).f()));
            return d10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        r5 = ec.b0.x0(r7, new v1.d.c());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r5, java.util.List<v1.d.b<v1.b0>> r6, java.util.List<v1.d.b<v1.s>> r7, java.util.List<? extends v1.d.b<? extends java.lang.Object>> r8) {
        /*
            r4 = this;
            java.lang.String r0 = "text"
            qc.q.i(r5, r0)
            r4.<init>()
            r4.f24414f = r5
            r4.f24415m = r6
            r4.f24416p = r7
            r4.f24417q = r8
            if (r7 == 0) goto L8d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            v1.d$c r5 = new v1.d$c
            r5.<init>()
            java.util.List r5 = ec.r.x0(r7, r5)
            if (r5 == 0) goto L8d
            int r6 = r5.size()
            r7 = 0
            r8 = -1
            r0 = 0
        L26:
            if (r0 >= r6) goto L8d
            java.lang.Object r1 = r5.get(r0)
            v1.d$b r1 = (v1.d.b) r1
            int r2 = r1.f()
            r3 = 1
            if (r2 < r8) goto L37
            r8 = 1
            goto L38
        L37:
            r8 = 0
        L38:
            if (r8 == 0) goto L81
            int r8 = r1.d()
            java.lang.String r2 = r4.f24414f
            int r2 = r2.length()
            if (r8 > r2) goto L47
            goto L48
        L47:
            r3 = 0
        L48:
            if (r3 == 0) goto L51
            int r8 = r1.d()
            int r0 = r0 + 1
            goto L26
        L51:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ParagraphStyle range ["
            r5.append(r6)
            int r6 = r1.f()
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            int r6 = r1.d()
            r5.append(r6)
            java.lang.String r6 = ") is out of boundary"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L81:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "ParagraphStyle should not overlap"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.<init>(java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    public char a(int i10) {
        return this.f24414f.charAt(i10);
    }

    public final List<b<? extends Object>> b() {
        return this.f24417q;
    }

    public int c() {
        return this.f24414f.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List<b<s>> d() {
        List<b<s>> i10;
        List<b<s>> list = this.f24416p;
        if (list == null) {
            i10 = ec.t.i();
            return i10;
        }
        return list;
    }

    public final List<b<s>> e() {
        return this.f24416p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (qc.q.d(this.f24414f, dVar.f24414f) && qc.q.d(this.f24415m, dVar.f24415m) && qc.q.d(this.f24416p, dVar.f24416p) && qc.q.d(this.f24417q, dVar.f24417q)) {
            return true;
        }
        return false;
    }

    public final List<b<b0>> f() {
        List<b<b0>> i10;
        List<b<b0>> list = this.f24415m;
        if (list == null) {
            i10 = ec.t.i();
            return i10;
        }
        return list;
    }

    public final List<b<b0>> g() {
        return this.f24415m;
    }

    public final List<b<String>> h(String str, int i10, int i11) {
        List i12;
        boolean z10;
        qc.q.i(str, "tag");
        List<b<? extends Object>> list = this.f24417q;
        if (list == null) {
            i12 = ec.t.i();
        } else {
            i12 = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                b<? extends Object> bVar = list.get(i13);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof String) && qc.q.d(str, bVar2.g()) && e.l(i10, i11, bVar2.f(), bVar2.d())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12.add(bVar);
                }
            }
        }
        qc.q.g(i12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return i12;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f24414f.hashCode() * 31;
        List<b<b0>> list = this.f24415m;
        int i12 = 0;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List<b<s>> list2 = this.f24416p;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        List<b<? extends Object>> list3 = this.f24417q;
        if (list3 != null) {
            i12 = list3.hashCode();
        }
        return i14 + i12;
    }

    public final String i() {
        return this.f24414f;
    }

    public final List<b<m0>> j(int i10, int i11) {
        List i12;
        boolean z10;
        List<b<? extends Object>> list = this.f24417q;
        if (list == null) {
            i12 = ec.t.i();
        } else {
            i12 = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                b<? extends Object> bVar = list.get(i13);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof m0) && e.l(i10, i11, bVar2.f(), bVar2.d())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12.add(bVar);
                }
            }
        }
        qc.q.g(i12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return i12;
    }

    public final List<b<n0>> k(int i10, int i11) {
        List i12;
        boolean z10;
        List<b<? extends Object>> list = this.f24417q;
        if (list == null) {
            i12 = ec.t.i();
        } else {
            i12 = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                b<? extends Object> bVar = list.get(i13);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.e() instanceof n0) && e.l(i10, i11, bVar2.f(), bVar2.d())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12.add(bVar);
                }
            }
        }
        qc.q.g(i12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return i12;
    }

    public final boolean l(String str, int i10, int i11) {
        boolean z10;
        qc.q.i(str, "tag");
        List<b<? extends Object>> list = this.f24417q;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            b<? extends Object> bVar = list.get(i12);
            if ((bVar.e() instanceof String) && qc.q.d(str, bVar.g()) && e.l(i10, i11, bVar.f(), bVar.d())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final d m(d dVar) {
        qc.q.i(dVar, TaskSetupFragment.TYPE_OTHER);
        a aVar = new a(this);
        aVar.g(dVar);
        return aVar.l();
    }

    @Override // java.lang.CharSequence
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public d subSequence(int i10, int i11) {
        boolean z10;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0 && i11 == this.f24414f.length()) {
                return this;
            }
            String substring = this.f24414f.substring(i10, i11);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new d(substring, e.a(this.f24415m, i10, i11), e.a(this.f24416p, i10, i11), e.a(this.f24417q, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    public final d o(long j10) {
        return subSequence(i0.l(j10), i0.k(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f24414f;
    }

    /* compiled from: AnnotatedString.kt */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f24427a;

        /* renamed from: b  reason: collision with root package name */
        private final int f24428b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24429c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24430d;

        public b(T t10, int i10, int i11, String str) {
            qc.q.i(str, "tag");
            this.f24427a = t10;
            this.f24428b = i10;
            this.f24429c = i11;
            this.f24430d = str;
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final T a() {
            return this.f24427a;
        }

        public final int b() {
            return this.f24428b;
        }

        public final int c() {
            return this.f24429c;
        }

        public final int d() {
            return this.f24429c;
        }

        public final T e() {
            return this.f24427a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (qc.q.d(this.f24427a, bVar.f24427a) && this.f24428b == bVar.f24428b && this.f24429c == bVar.f24429c && qc.q.d(this.f24430d, bVar.f24430d)) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f24428b;
        }

        public final String g() {
            return this.f24430d;
        }

        public int hashCode() {
            int hashCode;
            T t10 = this.f24427a;
            if (t10 == null) {
                hashCode = 0;
            } else {
                hashCode = t10.hashCode();
            }
            return (((((hashCode * 31) + this.f24428b) * 31) + this.f24429c) * 31) + this.f24430d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f24427a + ", start=" + this.f24428b + ", end=" + this.f24429c + ", tag=" + this.f24430d + ')';
        }

        public b(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    /* compiled from: AnnotatedString.kt */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: f  reason: collision with root package name */
        private final StringBuilder f24418f;

        /* renamed from: m  reason: collision with root package name */
        private final List<C0574a<b0>> f24419m;

        /* renamed from: p  reason: collision with root package name */
        private final List<C0574a<s>> f24420p;

        /* renamed from: q  reason: collision with root package name */
        private final List<C0574a<? extends Object>> f24421q;

        /* renamed from: r  reason: collision with root package name */
        private final List<C0574a<? extends Object>> f24422r;

        public a(int i10) {
            this.f24418f = new StringBuilder(i10);
            this.f24419m = new ArrayList();
            this.f24420p = new ArrayList();
            this.f24421q = new ArrayList();
            this.f24422r = new ArrayList();
        }

        public final void a(s sVar, int i10, int i11) {
            qc.q.i(sVar, "style");
            this.f24420p.add(new C0574a<>(sVar, i10, i11, null, 8, null));
        }

        public final void b(b0 b0Var, int i10, int i11) {
            qc.q.i(b0Var, "style");
            this.f24419m.add(new C0574a<>(b0Var, i10, i11, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public a append(char c10) {
            this.f24418f.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence) {
            if (charSequence instanceof d) {
                g((d) charSequence);
            } else {
                this.f24418f.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof d) {
                h((d) charSequence, i10, i11);
            } else {
                this.f24418f.append(charSequence, i10, i11);
            }
            return this;
        }

        public final void f(String str) {
            qc.q.i(str, "text");
            this.f24418f.append(str);
        }

        public final void g(d dVar) {
            qc.q.i(dVar, "text");
            int length = this.f24418f.length();
            this.f24418f.append(dVar.i());
            List<b<b0>> g10 = dVar.g();
            if (g10 != null) {
                int size = g10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b<b0> bVar = g10.get(i10);
                    b(bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List<b<s>> e10 = dVar.e();
            if (e10 != null) {
                int size2 = e10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b<s> bVar2 = e10.get(i11);
                    a(bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List<b<? extends Object>> b10 = dVar.b();
            if (b10 != null) {
                int size3 = b10.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    b<? extends Object> bVar3 = b10.get(i12);
                    this.f24421q.add(new C0574a<>(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void h(d dVar, int i10, int i11) {
            qc.q.i(dVar, "text");
            int length = this.f24418f.length();
            this.f24418f.append((CharSequence) dVar.i(), i10, i11);
            List d10 = e.d(dVar, i10, i11);
            if (d10 != null) {
                int size = d10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    b bVar = (b) d10.get(i12);
                    b((b0) bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List c10 = e.c(dVar, i10, i11);
            if (c10 != null) {
                int size2 = c10.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    b bVar2 = (b) c10.get(i13);
                    a((s) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List b10 = e.b(dVar, i10, i11);
            if (b10 != null) {
                int size3 = b10.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    b bVar3 = (b) b10.get(i14);
                    this.f24421q.add(new C0574a<>(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void i() {
            if ((!this.f24422r.isEmpty()) != false) {
                this.f24422r.remove(r0.size() - 1).a(this.f24418f.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final void j(int i10) {
            boolean z10;
            if (i10 < this.f24422r.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                while (this.f24422r.size() - 1 >= i10) {
                    i();
                }
                return;
            }
            throw new IllegalStateException((i10 + " should be less than " + this.f24422r.size()).toString());
        }

        public final int k(b0 b0Var) {
            qc.q.i(b0Var, "style");
            C0574a<b0> c0574a = new C0574a<>(b0Var, this.f24418f.length(), 0, null, 12, null);
            this.f24422r.add(c0574a);
            this.f24419m.add(c0574a);
            return this.f24422r.size() - 1;
        }

        public final d l() {
            String sb2 = this.f24418f.toString();
            qc.q.h(sb2, "text.toString()");
            List<C0574a<b0>> list = this.f24419m;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).b(this.f24418f.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C0574a<s>> list2 = this.f24420p;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(list2.get(i11).b(this.f24418f.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List<C0574a<? extends Object>> list3 = this.f24421q;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList4.add(list3.get(i12).b(this.f24418f.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new d(sb2, arrayList, arrayList3, arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: AnnotatedString.kt */
        /* renamed from: v1.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0574a<T> {

            /* renamed from: a  reason: collision with root package name */
            private final T f24423a;

            /* renamed from: b  reason: collision with root package name */
            private final int f24424b;

            /* renamed from: c  reason: collision with root package name */
            private int f24425c;

            /* renamed from: d  reason: collision with root package name */
            private final String f24426d;

            public C0574a(T t10, int i10, int i11, String str) {
                qc.q.i(str, "tag");
                this.f24423a = t10;
                this.f24424b = i10;
                this.f24425c = i11;
                this.f24426d = str;
            }

            public final void a(int i10) {
                this.f24425c = i10;
            }

            public final b<T> b(int i10) {
                boolean z10;
                int i11 = this.f24425c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return new b<>(this.f24423a, this.f24424b, i10, this.f24426d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0574a)) {
                    return false;
                }
                C0574a c0574a = (C0574a) obj;
                if (qc.q.d(this.f24423a, c0574a.f24423a) && this.f24424b == c0574a.f24424b && this.f24425c == c0574a.f24425c && qc.q.d(this.f24426d, c0574a.f24426d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                T t10 = this.f24423a;
                if (t10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = t10.hashCode();
                }
                return (((((hashCode * 31) + this.f24424b) * 31) + this.f24425c) * 31) + this.f24426d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f24423a + ", start=" + this.f24424b + ", end=" + this.f24425c + ", tag=" + this.f24426d + ')';
            }

            public /* synthetic */ C0574a(Object obj, int i10, int i11, String str, int i12, qc.h hVar) {
                this(obj, i10, (i12 & 4) != 0 ? RecyclerView.UNDEFINED_DURATION : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ a(int i10, int i11, qc.h hVar) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            this(0, 1, null);
            qc.q.i(dVar, "text");
            g(dVar);
        }
    }

    public /* synthetic */ d(String str, List list, List list2, List list3, int i10, qc.h hVar) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ d(String str, List list, List list2, int i10, qc.h hVar) {
        this(str, (i10 & 2) != 0 ? ec.t.i() : list, (i10 & 4) != 0 ? ec.t.i() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r3, java.util.List<v1.d.b<v1.b0>> r4, java.util.List<v1.d.b<v1.s>> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "text"
            qc.q.i(r3, r0)
            java.lang.String r0 = "spanStyles"
            qc.q.i(r4, r0)
            java.lang.String r0 = "paragraphStyles"
            qc.q.i(r5, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L19
            r4 = r1
        L19:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L24
            r5 = r1
        L24:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
