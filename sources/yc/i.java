package yc;

import ec.b0;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Matcher f26323a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f26324b;

    /* renamed from: c  reason: collision with root package name */
    private final g f26325c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f26326d;

    /* compiled from: Regex.kt */
    /* loaded from: classes4.dex */
    public static final class a extends ec.c<String> {
        a() {
        }

        @Override // ec.a
        public int a() {
            return i.this.d().groupCount() + 1;
        }

        @Override // ec.a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return e((String) obj);
        }

        public /* bridge */ boolean e(String str) {
            return super.contains(str);
        }

        @Override // ec.c, java.util.List
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String group = i.this.d().group(i10);
            if (group == null) {
                return "";
            }
            return group;
        }

        public /* bridge */ int h(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int i(String str) {
            return super.lastIndexOf(str);
        }

        @Override // ec.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return h((String) obj);
        }

        @Override // ec.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return i((String) obj);
        }
    }

    /* compiled from: Regex.kt */
    /* loaded from: classes4.dex */
    public static final class b extends ec.a<f> implements g {

        /* compiled from: Regex.kt */
        /* loaded from: classes4.dex */
        static final class a extends qc.r implements pc.l<Integer, f> {
            a() {
                super(1);
            }

            public final f a(int i10) {
                return b.this.f(i10);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ f invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        @Override // ec.a
        public int a() {
            return i.this.d().groupCount() + 1;
        }

        @Override // ec.a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            boolean z10;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = obj instanceof f;
            }
            if (!z10) {
                return false;
            }
            return e((f) obj);
        }

        public /* bridge */ boolean e(f fVar) {
            return super.contains(fVar);
        }

        public f f(int i10) {
            vc.f f10;
            f10 = k.f(i.this.d(), i10);
            if (f10.a().intValue() >= 0) {
                String group = i.this.d().group(i10);
                qc.q.h(group, "matchResult.group(index)");
                return new f(group, f10);
            }
            return null;
        }

        @Override // ec.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<f> iterator() {
            vc.f j10;
            xc.g R;
            xc.g w10;
            j10 = ec.t.j(this);
            R = b0.R(j10);
            w10 = xc.o.w(R, new a());
            return w10.iterator();
        }
    }

    public i(Matcher matcher, CharSequence charSequence) {
        qc.q.i(matcher, "matcher");
        qc.q.i(charSequence, "input");
        this.f26323a = matcher;
        this.f26324b = charSequence;
        this.f26325c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f26323a;
    }

    @Override // yc.h
    public List<String> a() {
        if (this.f26326d == null) {
            this.f26326d = new a();
        }
        List<String> list = this.f26326d;
        qc.q.f(list);
        return list;
    }

    @Override // yc.h
    public vc.f b() {
        vc.f e10;
        e10 = k.e(d());
        return e10;
    }

    @Override // yc.h
    public String getValue() {
        String group = d().group();
        qc.q.h(group, "matchResult.group()");
        return group;
    }

    @Override // yc.h
    public h next() {
        int i10;
        h d10;
        int end = d().end();
        if (d().end() == d().start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = end + i10;
        if (i11 <= this.f26324b.length()) {
            Matcher matcher = this.f26323a.pattern().matcher(this.f26324b);
            qc.q.h(matcher, "matcher.pattern().matcher(input)");
            d10 = k.d(matcher, i11, this.f26324b);
            return d10;
        }
        return null;
    }
}
