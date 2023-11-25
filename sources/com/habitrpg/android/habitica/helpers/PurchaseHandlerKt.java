package com.habitrpg.android.habitica.helpers;

import kotlin.coroutines.Continuation;
import pc.l;

/* compiled from: PurchaseHandler.kt */
/* loaded from: classes4.dex */
public final class PurchaseHandlerKt {
    /* JADX WARN: Removed duplicated region for block: B:43:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00c3 -> B:46:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object retryUntil(int r19, long r20, long r22, double r24, pc.l<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r26, kotlin.coroutines.Continuation<? super dc.w> r27) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandlerKt.retryUntil(int, long, long, double, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object retryUntil$default(int i10, long j10, long j11, double d10, l lVar, Continuation continuation, int i11, Object obj) {
        int i12;
        long j12;
        long j13;
        double d11;
        if ((i11 & 1) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            j12 = 100;
        } else {
            j12 = j10;
        }
        if ((i11 & 4) != 0) {
            j13 = 1000;
        } else {
            j13 = j11;
        }
        if ((i11 & 8) != 0) {
            d11 = 2.0d;
        } else {
            d11 = d10;
        }
        return retryUntil(i12, j12, j13, d11, lVar, continuation);
    }
}
