package yc;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversionsJVM.kt */
/* loaded from: classes4.dex */
public class t extends s {
    public static Double i(String str) {
        qc.q.i(str, "<this>");
        try {
            if (!l.f26337b.f(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
