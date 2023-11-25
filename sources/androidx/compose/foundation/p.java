package androidx.compose.foundation;

/* compiled from: Hoverable.kt */
/* loaded from: classes.dex */
public final class p {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, v.m mVar, boolean z10) {
        androidx.compose.ui.e eVar2;
        qc.q.i(eVar, "<this>");
        qc.q.i(mVar, "interactionSource");
        if (z10) {
            eVar2 = new HoverableElement(mVar);
        } else {
            eVar2 = androidx.compose.ui.e.f2335a;
        }
        return eVar.a(eVar2);
    }
}
