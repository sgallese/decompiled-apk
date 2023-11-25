package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClassSelectionActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity$selectClass$1", f = "ClassSelectionActivity.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ClassSelectionActivity$selectClass$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $chosenClass;
    final /* synthetic */ HabiticaProgressDialog $dialog;
    int label;
    final /* synthetic */ ClassSelectionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassSelectionActivity$selectClass$1(ClassSelectionActivity classSelectionActivity, String str, HabiticaProgressDialog habiticaProgressDialog, Continuation<? super ClassSelectionActivity$selectClass$1> continuation) {
        super(2, continuation);
        this.this$0 = classSelectionActivity;
        this.$chosenClass = str;
        this.$dialog = habiticaProgressDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ClassSelectionActivity$selectClass$1(this.this$0, this.$chosenClass, this.$dialog, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ClassSelectionActivity$selectClass$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            String str = this.$chosenClass;
            this.label = 1;
            if (userRepository.changeClass(str, this) == d10) {
                return d10;
            }
        }
        this.$dialog.hide();
        this.this$0.displayClassChanged(this.$chosenClass);
        return dc.w.f13270a;
    }
}
