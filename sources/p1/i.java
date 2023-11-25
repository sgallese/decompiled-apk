package p1;

import com.google.android.gms.common.internal.ImagesContract;

/* compiled from: CompositionLocalConsumerModifierNode.kt */
/* loaded from: classes.dex */
public final class i {
    public static final <T> T a(h hVar, j0.t<T> tVar) {
        qc.q.i(hVar, "<this>");
        qc.q.i(tVar, ImagesContract.LOCAL);
        if (hVar.getNode().p1()) {
            return (T) k.k(hVar).H().a(tVar);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
    }
}
