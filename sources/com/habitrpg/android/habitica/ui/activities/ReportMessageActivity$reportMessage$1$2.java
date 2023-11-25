package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityReportMessageBinding;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportMessageActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ReportMessageActivity$reportMessage$1$2", f = "ReportMessageActivity.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ReportMessageActivity$reportMessage$1$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ ReportMessageActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportMessageActivity$reportMessage$1$2(ReportMessageActivity reportMessageActivity, Continuation<? super ReportMessageActivity$reportMessage$1$2> continuation) {
        super(2, continuation);
        this.this$0 = reportMessageActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ReportMessageActivity$reportMessage$1$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ReportMessageActivity$reportMessage$1$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        ActivityReportMessageBinding activityReportMessageBinding;
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
            activityReportMessageBinding = this.this$0.binding;
            if (activityReportMessageBinding == null) {
                qc.q.z("binding");
                activityReportMessageBinding = null;
            }
            String valueOf = String.valueOf(activityReportMessageBinding.additionalInfoEdittext.getText());
            str2 = this.this$0.groupID;
            this.label = 1;
            if (socialRepository.flagMessage(str, valueOf, str2, this) == d10) {
                return d10;
            }
        }
        this.this$0.finish();
        return dc.w.f13270a;
    }
}
