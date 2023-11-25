package okhttp3.logging;

import java.io.EOFException;
import okio.c;
import qc.q;
import vc.l;

/* compiled from: utf8.kt */
/* loaded from: classes4.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(c cVar) {
        long i10;
        q.i(cVar, "<this>");
        try {
            c cVar2 = new c();
            i10 = l.i(cVar.s0(), 64L);
            cVar.j(cVar2, 0L, i10);
            int i11 = 0;
            while (i11 < 16) {
                i11++;
                if (!cVar2.C()) {
                    int p02 = cVar2.p0();
                    if (Character.isISOControl(p02) && !Character.isWhitespace(p02)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
