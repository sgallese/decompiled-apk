package yc;

import java.nio.charset.Charset;

/* compiled from: Charsets.kt */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f26302a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f26303b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f26304c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f26305d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f26306e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f26307f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f26308g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Charset f26309h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Charset f26310i;

    static {
        Charset forName = Charset.forName("UTF-8");
        qc.q.h(forName, "forName(\"UTF-8\")");
        f26303b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        qc.q.h(forName2, "forName(\"UTF-16\")");
        f26304c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        qc.q.h(forName3, "forName(\"UTF-16BE\")");
        f26305d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        qc.q.h(forName4, "forName(\"UTF-16LE\")");
        f26306e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        qc.q.h(forName5, "forName(\"US-ASCII\")");
        f26307f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        qc.q.h(forName6, "forName(\"ISO-8859-1\")");
        f26308g = forName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f26310i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            qc.q.h(forName, "forName(\"UTF-32BE\")");
            f26310i = forName;
            return forName;
        }
        return charset;
    }

    public final Charset b() {
        Charset charset = f26309h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            qc.q.h(forName, "forName(\"UTF-32LE\")");
            f26309h = forName;
            return forName;
        }
        return charset;
    }
}
