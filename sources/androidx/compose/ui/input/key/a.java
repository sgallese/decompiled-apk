package androidx.compose.ui.input.key;

import androidx.compose.ui.e;
import pc.l;
import qc.q;

/* compiled from: KeyInputModifier.kt */
/* loaded from: classes.dex */
public final class a {
    public static final e a(e eVar, l<? super i1.b, Boolean> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "onKeyEvent");
        return eVar.a(new KeyInputElement(lVar, null));
    }

    public static final e b(e eVar, l<? super i1.b, Boolean> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "onPreviewKeyEvent");
        return eVar.a(new KeyInputElement(null, lVar));
    }
}
