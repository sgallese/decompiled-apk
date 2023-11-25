package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.e;
import j1.b;
import j1.c;
import qc.q;

/* compiled from: NestedScrollModifier.kt */
/* loaded from: classes.dex */
public final class a {
    public static final e a(e eVar, b bVar, c cVar) {
        q.i(eVar, "<this>");
        q.i(bVar, "connection");
        return eVar.a(new NestedScrollElement(bVar, cVar));
    }

    public static /* synthetic */ e b(e eVar, b bVar, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return a(eVar, bVar, cVar);
    }
}
