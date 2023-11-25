package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainUserViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$updateUser$1", f = "MainUserViewModel.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainUserViewModel$updateUser$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $path;
    final /* synthetic */ Object $value;
    int label;
    final /* synthetic */ MainUserViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainUserViewModel$updateUser$1(MainUserViewModel mainUserViewModel, String str, Object obj, Continuation<? super MainUserViewModel$updateUser$1> continuation) {
        super(2, continuation);
        this.this$0 = mainUserViewModel;
        this.$path = str;
        this.$value = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MainUserViewModel$updateUser$1(this.this$0, this.$path, this.$value, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MainUserViewModel$updateUser$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            String str = this.$path;
            Object obj2 = this.$value;
            this.label = 1;
            if (userRepository.updateUser(str, obj2, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
