package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import qc.h;

/* compiled from: ForEachGesture.kt */
/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GestureCancellationException() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.GestureCancellationException.<init>():void");
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
