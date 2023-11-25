package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.members.Member;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$updateView$4", f = "FullProfileActivity.kt", l = {450}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullProfileActivity$updateView$4 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Member $user;
    int label;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$updateView$4(FullProfileActivity fullProfileActivity, Member member, Continuation<? super FullProfileActivity$updateView$4> continuation) {
        super(2, continuation);
        this.this$0 = fullProfileActivity;
        this.$user = member;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new FullProfileActivity$updateView$4(this.this$0, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((FullProfileActivity$updateView$4) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        dd.g loadItemDataByOutfit;
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
            loadItemDataByOutfit = this.this$0.loadItemDataByOutfit(this.$user.getCostume());
            final FullProfileActivity fullProfileActivity = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$updateView$4.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(List<? extends Equipment> list, Continuation<? super dc.w> continuation) {
                    FullProfileActivity.this.gotCostume(list);
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (loadItemDataByOutfit.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
