package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import kotlin.coroutines.Continuation;

/* compiled from: BaseDialogFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment$showTutorialIfNeeded$1$1", f = "BaseDialogFragment.kt", l = {57, 58}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseDialogFragment$showTutorialIfNeeded$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $identifier;
    Object L$0;
    int label;
    final /* synthetic */ BaseDialogFragment<VB> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDialogFragment$showTutorialIfNeeded$1$1(BaseDialogFragment<VB> baseDialogFragment, String str, Continuation<? super BaseDialogFragment$showTutorialIfNeeded$1$1> continuation) {
        super(2, continuation);
        this.this$0 = baseDialogFragment;
        this.$identifier = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new BaseDialogFragment$showTutorialIfNeeded$1$1(this.this$0, this.$identifier, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((BaseDialogFragment$showTutorialIfNeeded$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.L$0
            com.habitrpg.android.habitica.models.TutorialStep r0 = (com.habitrpg.android.habitica.models.TutorialStep) r0
            dc.n.b(r7)
            goto L4e
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            dc.n.b(r7)
            goto L3a
        L22:
            dc.n.b(r7)
            com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment<VB> r7 = r6.this$0
            com.habitrpg.android.habitica.data.TutorialRepository r7 = r7.getTutorialRepository()
            java.lang.String r1 = r6.$identifier
            dd.g r7 = r7.getTutorialStep(r1)
            r6.label = r3
            java.lang.Object r7 = dd.i.x(r7, r6)
            if (r7 != r0) goto L3a
            return r0
        L3a:
            com.habitrpg.android.habitica.models.TutorialStep r7 = (com.habitrpg.android.habitica.models.TutorialStep) r7
            zc.d r1 = zc.d.SECONDS
            long r4 = zc.c.o(r3, r1)
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r1 = ad.u0.b(r4, r6)
            if (r1 != r0) goto L4d
            return r0
        L4d:
            r0 = r7
        L4e:
            r7 = 0
            if (r0 == 0) goto L58
            boolean r1 = r0.isValid()
            if (r1 != r3) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            if (r3 == 0) goto L89
            boolean r7 = r0.isManaged()
            if (r7 == 0) goto L89
            boolean r7 = r0.getShouldDisplay()
            if (r7 == 0) goto L89
            com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment<VB> r7 = r6.this$0
            androidx.fragment.app.q r7 = r7.getActivity()
            boolean r1 = r7 instanceof com.habitrpg.android.habitica.ui.activities.MainActivity
            if (r1 == 0) goto L74
            com.habitrpg.android.habitica.ui.activities.MainActivity r7 = (com.habitrpg.android.habitica.ui.activities.MainActivity) r7
            goto L75
        L74:
            r7 = 0
        L75:
            if (r7 != 0) goto L7a
            dc.w r7 = dc.w.f13270a
            return r7
        L7a:
            com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment<VB> r1 = r6.this$0
            java.util.List r1 = r1.getTutorialTexts()
            com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment<VB> r2 = r6.this$0
            boolean r2 = r2.getTutorialCanBeDeferred()
            r7.displayTutorialStep(r0, r1, r2)
        L89:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment$showTutorialIfNeeded$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
