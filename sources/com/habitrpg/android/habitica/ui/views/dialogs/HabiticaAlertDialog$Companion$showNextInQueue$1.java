package com.habitrpg.android.habitica.ui.views.dialogs;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaAlertDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog$Companion$showNextInQueue$1", f = "HabiticaAlertDialog.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HabiticaAlertDialog$Companion$showNextInQueue$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HabiticaAlertDialog$Companion$showNextInQueue$1(Continuation<? super HabiticaAlertDialog$Companion$showNextInQueue$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new HabiticaAlertDialog$Companion$showNextInQueue$1(continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((HabiticaAlertDialog$Companion$showNextInQueue$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r2 != false) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            dc.n.b(r6)
            goto L25
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            dc.n.b(r6)
            r5.label = r2
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r6 = ad.u0.a(r3, r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            java.util.List r6 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
            int r6 = r6.size()
            if (r6 <= 0) goto L92
            java.util.List r6 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r6 = (com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog) r6
            android.content.Context r6 = r6.getContext()
            boolean r1 = r6 instanceof android.app.Activity
            r3 = 0
            if (r1 == 0) goto L46
            android.app.Activity r6 = (android.app.Activity) r6
            goto L47
        L46:
            r6 = r3
        L47:
            if (r6 == 0) goto L51
            boolean r6 = r6.isFinishing()
            if (r6 != 0) goto L51
            r6 = 1
            goto L52
        L51:
            r6 = 0
        L52:
            if (r6 != 0) goto L85
            java.util.List r6 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
            java.lang.Object r6 = r6.get(r0)
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r6 = (com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog) r6
            android.content.Context r6 = r6.getContext()
            boolean r1 = r6 instanceof android.view.ContextThemeWrapper
            if (r1 == 0) goto L69
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6
            goto L6a
        L69:
            r6 = r3
        L6a:
            if (r6 == 0) goto L71
            android.content.Context r6 = r6.getBaseContext()
            goto L72
        L71:
            r6 = r3
        L72:
            boolean r1 = r6 instanceof android.app.Activity
            if (r1 == 0) goto L79
            r3 = r6
            android.app.Activity r3 = (android.app.Activity) r3
        L79:
            if (r3 == 0) goto L82
            boolean r6 = r3.isFinishing()
            if (r6 != 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            if (r2 == 0) goto L92
        L85:
            java.util.List r6 = com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog.access$getDialogQueue$cp()
            java.lang.Object r6 = r6.get(r0)
            com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog r6 = (com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog) r6
            r6.show()
        L92:
            dc.w r6 = dc.w.f13270a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog$Companion$showNextInQueue$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
