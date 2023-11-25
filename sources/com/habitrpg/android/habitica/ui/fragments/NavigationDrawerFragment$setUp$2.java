package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationDrawerFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$setUp$2", f = "NavigationDrawerFragment.kt", l = {622}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NavigationDrawerFragment$setUp$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ NotificationsViewModel $viewModel;
    int label;
    final /* synthetic */ NavigationDrawerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$setUp$2(NotificationsViewModel notificationsViewModel, NavigationDrawerFragment navigationDrawerFragment, Continuation<? super NavigationDrawerFragment$setUp$2> continuation) {
        super(2, continuation);
        this.$viewModel = notificationsViewModel;
        this.this$0 = navigationDrawerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NavigationDrawerFragment$setUp$2(this.$viewModel, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NavigationDrawerFragment$setUp$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            dd.g<Boolean> allNotificationsSeen = this.$viewModel.allNotificationsSeen();
            final NavigationDrawerFragment navigationDrawerFragment = this.this$0;
            dd.h<? super Boolean> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$setUp$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object emit(boolean z10, Continuation<? super dc.w> continuation) {
                    NavigationDrawerFragment.this.setNotificationsSeen(z10);
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (allNotificationsSeen.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
