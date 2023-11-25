package com.habitrpg.android.habitica.interactors;

import ad.k0;
import ad.l0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.interactors.ShareMountUseCase;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeedPetUseCase.kt */
/* loaded from: classes4.dex */
public final class FeedPetUseCase$run$3 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ FeedPetUseCase.RequestValues $requestValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedPetUseCase.kt */
    @f(c = "com.habitrpg.android.habitica.interactors.FeedPetUseCase$run$3$1", f = "FeedPetUseCase.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.interactors.FeedPetUseCase$run$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $message;
        final /* synthetic */ FeedPetUseCase.RequestValues $requestValues;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeedPetUseCase.RequestValues requestValues, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$requestValues = requestValues;
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$requestValues, this.$message, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ShareMountUseCase shareMountUseCase = new ShareMountUseCase();
                ShareMountUseCase.RequestValues requestValues = new ShareMountUseCase.RequestValues(this.$requestValues.getPet().getKey(), this.$message, this.$requestValues.getContext());
                this.label = 1;
                if (shareMountUseCase.callInteractor(requestValues, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedPetUseCase$run$3(FeedPetUseCase.RequestValues requestValues) {
        super(2);
        this.$requestValues = requestValues;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "hatchingDialog");
        String string = this.$requestValues.getContext().getString(R.string.share_raised, this.$requestValues.getPet().getText());
        q.h(string, "getString(...)");
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(this.$requestValues, string, null), 1, null);
        habiticaAlertDialog.dismiss();
    }
}
