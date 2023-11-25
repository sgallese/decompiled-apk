package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentReportMessageBinding;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportBottomSheetFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment$reportMessage$1$2", f = "ReportBottomSheetFragment.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ReportBottomSheetFragment$reportMessage$1$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ ReportBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportBottomSheetFragment$reportMessage$1$2(ReportBottomSheetFragment reportBottomSheetFragment, Continuation<? super ReportBottomSheetFragment$reportMessage$1$2> continuation) {
        super(2, continuation);
        this.this$0 = reportBottomSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ReportBottomSheetFragment$reportMessage$1$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ReportBottomSheetFragment$reportMessage$1$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        FragmentReportMessageBinding fragmentReportMessageBinding;
        String str2;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            str = this.this$0.messageID;
            if (str == null) {
                str = "";
            }
            fragmentReportMessageBinding = this.this$0.binding;
            if (fragmentReportMessageBinding == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding = null;
            }
            String valueOf = String.valueOf(fragmentReportMessageBinding.additionalInfoEdittext.getText());
            str2 = this.this$0.groupID;
            this.label = 1;
            if (socialRepository.flagMessage(str, valueOf, str2, this) == d10) {
                return d10;
            }
        }
        this.this$0.dismiss();
        return dc.w.f13270a;
    }
}
