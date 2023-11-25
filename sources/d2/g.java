package d2;

import v1.y;

/* compiled from: AndroidStringDelegate.android.kt */
/* loaded from: classes.dex */
public final class g implements y {
    @Override // v1.y
    public String a(String str, c2.j jVar) {
        qc.q.i(str, "string");
        qc.q.i(jVar, "locale");
        String upperCase = str.toUpperCase(((c2.a) jVar).b());
        qc.q.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
