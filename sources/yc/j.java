package yc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class j implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final a f26330m = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final Pattern f26331f;

    /* compiled from: Regex.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Regex.kt */
    /* loaded from: classes4.dex */
    public static final class b extends qc.r implements pc.a<h> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ CharSequence f26333m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f26334p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i10) {
            super(0);
            this.f26333m = charSequence;
            this.f26334p = i10;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return j.this.b(this.f26333m, this.f26334p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Regex.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends qc.n implements pc.l<h, h> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f26335w = new c();

        c() {
            super(1, h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // pc.l
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final h invoke(h hVar) {
            qc.q.i(hVar, "p0");
            return hVar.next();
        }
    }

    public j(Pattern pattern) {
        qc.q.i(pattern, "nativePattern");
        this.f26331f = pattern;
    }

    public static /* synthetic */ h c(j jVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return jVar.b(charSequence, i10);
    }

    public static /* synthetic */ xc.g e(j jVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return jVar.d(charSequence, i10);
    }

    public final boolean a(CharSequence charSequence) {
        qc.q.i(charSequence, "input");
        return this.f26331f.matcher(charSequence).find();
    }

    public final h b(CharSequence charSequence, int i10) {
        h d10;
        qc.q.i(charSequence, "input");
        Matcher matcher = this.f26331f.matcher(charSequence);
        qc.q.h(matcher, "nativePattern.matcher(input)");
        d10 = k.d(matcher, i10, charSequence);
        return d10;
    }

    public final xc.g<h> d(CharSequence charSequence, int i10) {
        xc.g<h> g10;
        qc.q.i(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            g10 = xc.m.g(new b(charSequence, i10), c.f26335w);
            return g10;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    public final boolean f(CharSequence charSequence) {
        qc.q.i(charSequence, "input");
        return this.f26331f.matcher(charSequence).matches();
    }

    public final String g(CharSequence charSequence, String str) {
        qc.q.i(charSequence, "input");
        qc.q.i(str, "replacement");
        String replaceAll = this.f26331f.matcher(charSequence).replaceAll(str);
        qc.q.h(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String h(CharSequence charSequence, pc.l<? super h, ? extends CharSequence> lVar) {
        qc.q.i(charSequence, "input");
        qc.q.i(lVar, "transform");
        int i10 = 0;
        h c10 = c(this, charSequence, 0, 2, null);
        if (c10 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i10, c10.b().a().intValue());
            sb2.append(lVar.invoke(c10));
            i10 = c10.b().f().intValue() + 1;
            c10 = c10.next();
            if (i10 >= length) {
                break;
            }
        } while (c10 != null);
        if (i10 < length) {
            sb2.append(charSequence, i10, length);
        }
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }

    public final List<String> i(CharSequence charSequence, int i10) {
        List<String> d10;
        qc.q.i(charSequence, "input");
        w.s0(i10);
        Matcher matcher = this.f26331f.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            d10 = ec.s.d(charSequence.toString());
            return d10;
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = vc.l.h(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int i13 = 0;
        do {
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f26331f.toString();
        qc.q.h(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            qc.q.i(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            qc.q.h(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.j.<init>(java.lang.String):void");
    }
}
