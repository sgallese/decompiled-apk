package com.habitrpg.android.habitica.ui.views.stats;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.DialogBulkAllocateBinding;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BulkAllocateStatsDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.stats.BulkAllocateStatsDialog$saveChanges$1", f = "BulkAllocateStatsDialog.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BulkAllocateStatsDialog$saveChanges$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ BulkAllocateStatsDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkAllocateStatsDialog$saveChanges$1(BulkAllocateStatsDialog bulkAllocateStatsDialog, Continuation<? super BulkAllocateStatsDialog$saveChanges$1> continuation) {
        super(2, continuation);
        this.this$0 = bulkAllocateStatsDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BulkAllocateStatsDialog$saveChanges$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BulkAllocateStatsDialog$saveChanges$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        UserRepository userRepository;
        DialogBulkAllocateBinding dialogBulkAllocateBinding;
        DialogBulkAllocateBinding dialogBulkAllocateBinding2;
        DialogBulkAllocateBinding dialogBulkAllocateBinding3;
        DialogBulkAllocateBinding dialogBulkAllocateBinding4;
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
            userRepository = this.this$0.userRepository;
            dialogBulkAllocateBinding = this.this$0.binding;
            int currentValue = dialogBulkAllocateBinding.strengthSliderView.getCurrentValue();
            dialogBulkAllocateBinding2 = this.this$0.binding;
            int currentValue2 = dialogBulkAllocateBinding2.intelligenceSliderView.getCurrentValue();
            dialogBulkAllocateBinding3 = this.this$0.binding;
            int currentValue3 = dialogBulkAllocateBinding3.constitutionSliderView.getCurrentValue();
            dialogBulkAllocateBinding4 = this.this$0.binding;
            int currentValue4 = dialogBulkAllocateBinding4.perceptionSliderView.getCurrentValue();
            this.label = 1;
            if (userRepository.bulkAllocatePoints(currentValue, currentValue2, currentValue3, currentValue4, this) == d10) {
                return d10;
            }
        }
        this.this$0.dismiss();
        return w.f13270a;
    }
}
