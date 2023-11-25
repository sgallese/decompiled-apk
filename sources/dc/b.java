package dc;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
/* loaded from: classes4.dex */
public class b {
    public static void a(Throwable th, Throwable th2) {
        qc.q.i(th, "<this>");
        qc.q.i(th2, "exception");
        if (th != th2) {
            kc.b.f19451a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        qc.q.i(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        qc.q.h(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
