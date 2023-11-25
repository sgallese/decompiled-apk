package com.habitrpg.android.habitica.helpers;

import ad.k0;
import android.content.Intent;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationOpenHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.NotificationOpenHandler$Companion$handleOpenedByNotification$1", f = "NotificationOpenHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NotificationOpenHandler$Companion$handleOpenedByNotification$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $identifier;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOpenHandler$Companion$handleOpenedByNotification$1(String str, Intent intent, Continuation<? super NotificationOpenHandler$Companion$handleOpenedByNotification$1> continuation) {
        super(2, continuation);
        this.$identifier = str;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new NotificationOpenHandler$Companion$handleOpenedByNotification$1(this.$identifier, this.$intent, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((NotificationOpenHandler$Companion$handleOpenedByNotification$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.NotificationOpenHandler$Companion$handleOpenedByNotification$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
