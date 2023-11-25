package com.habitrpg.android.habitica.ui.views.stats;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.DialogBulkAllocateBinding;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: BulkAllocateStatsDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.stats.BulkAllocateStatsDialog$onCreate$1", f = "BulkAllocateStatsDialog.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BulkAllocateStatsDialog$onCreate$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ BulkAllocateStatsDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkAllocateStatsDialog$onCreate$1(BulkAllocateStatsDialog bulkAllocateStatsDialog, Continuation<? super BulkAllocateStatsDialog$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = bulkAllocateStatsDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BulkAllocateStatsDialog$onCreate$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BulkAllocateStatsDialog$onCreate$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        UserRepository userRepository;
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
            g u10 = i.u(userRepository.getUser());
            final BulkAllocateStatsDialog bulkAllocateStatsDialog = this.this$0;
            h hVar = new h() { // from class: com.habitrpg.android.habitica.ui.views.stats.BulkAllocateStatsDialog$onCreate$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((User) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(User user, Continuation<? super w> continuation) {
                    DialogBulkAllocateBinding dialogBulkAllocateBinding;
                    DialogBulkAllocateBinding dialogBulkAllocateBinding2;
                    DialogBulkAllocateBinding dialogBulkAllocateBinding3;
                    DialogBulkAllocateBinding dialogBulkAllocateBinding4;
                    Integer per;
                    Integer constitution;
                    Integer intelligence;
                    Integer strength;
                    Integer points;
                    BulkAllocateStatsDialog bulkAllocateStatsDialog2 = BulkAllocateStatsDialog.this;
                    Stats stats = user.getStats();
                    int i11 = 0;
                    bulkAllocateStatsDialog2.setPointsToAllocate((stats == null || (points = stats.getPoints()) == null) ? 0 : points.intValue());
                    dialogBulkAllocateBinding = BulkAllocateStatsDialog.this.binding;
                    StatsSliderView statsSliderView = dialogBulkAllocateBinding.strengthSliderView;
                    Stats stats2 = user.getStats();
                    statsSliderView.setPreviousValue((stats2 == null || (strength = stats2.getStrength()) == null) ? 0 : strength.intValue());
                    dialogBulkAllocateBinding2 = BulkAllocateStatsDialog.this.binding;
                    StatsSliderView statsSliderView2 = dialogBulkAllocateBinding2.intelligenceSliderView;
                    Stats stats3 = user.getStats();
                    statsSliderView2.setPreviousValue((stats3 == null || (intelligence = stats3.getIntelligence()) == null) ? 0 : intelligence.intValue());
                    dialogBulkAllocateBinding3 = BulkAllocateStatsDialog.this.binding;
                    StatsSliderView statsSliderView3 = dialogBulkAllocateBinding3.constitutionSliderView;
                    Stats stats4 = user.getStats();
                    statsSliderView3.setPreviousValue((stats4 == null || (constitution = stats4.getConstitution()) == null) ? 0 : constitution.intValue());
                    dialogBulkAllocateBinding4 = BulkAllocateStatsDialog.this.binding;
                    StatsSliderView statsSliderView4 = dialogBulkAllocateBinding4.perceptionSliderView;
                    Stats stats5 = user.getStats();
                    if (stats5 != null && (per = stats5.getPer()) != null) {
                        i11 = per.intValue();
                    }
                    statsSliderView4.setPreviousValue(i11);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (u10.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
