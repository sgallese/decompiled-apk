package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import android.content.Context;
import android.widget.Toast;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentReportMessageBinding;
import ec.n0;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportBottomSheetFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment$reportUser$1", f = "ReportBottomSheetFragment.kt", l = {158, 159}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ReportBottomSheetFragment$reportUser$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $userIdBeingReported;
    int label;
    final /* synthetic */ ReportBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportBottomSheetFragment$reportUser$1(ReportBottomSheetFragment reportBottomSheetFragment, String str, Continuation<? super ReportBottomSheetFragment$reportUser$1> continuation) {
        super(2, continuation);
        this.this$0 = reportBottomSheetFragment;
        this.$userIdBeingReported = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ReportBottomSheetFragment$reportUser$1(this.this$0, this.$userIdBeingReported, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ReportBottomSheetFragment$reportUser$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        FragmentReportMessageBinding fragmentReportMessageBinding;
        String str;
        Map<String, String> k10;
        String str2;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dc.n.b(obj);
                    Context context = this.this$0.getContext();
                    str2 = this.this$0.profileName;
                    Toast.makeText(context, str2 + " Reported", 0).show();
                    this.this$0.dismiss();
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            fragmentReportMessageBinding = this.this$0.binding;
            if (fragmentReportMessageBinding == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding = null;
            }
            dc.l[] lVarArr = new dc.l[2];
            lVarArr[0] = dc.r.a("comment", String.valueOf(fragmentReportMessageBinding.additionalInfoEdittext.getText()));
            str = this.this$0.source;
            if (str == null) {
                str = "";
            }
            lVarArr[1] = dc.r.a("source", str);
            k10 = n0.k(lVarArr);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String str3 = this.$userIdBeingReported;
            this.label = 1;
            if (socialRepository.reportMember(str3, k10, this) == d10) {
                return d10;
            }
        }
        SocialRepository socialRepository2 = this.this$0.getSocialRepository();
        String str4 = this.$userIdBeingReported;
        this.label = 2;
        if (socialRepository2.blockMember(str4, this) == d10) {
            return d10;
        }
        Context context2 = this.this$0.getContext();
        str2 = this.this$0.profileName;
        Toast.makeText(context2, str2 + " Reported", 0).show();
        this.this$0.dismiss();
        return dc.w.f13270a;
    }
}
