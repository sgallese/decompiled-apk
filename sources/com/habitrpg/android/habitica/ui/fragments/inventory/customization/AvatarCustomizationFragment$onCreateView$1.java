package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: AvatarCustomizationFragment.kt */
/* loaded from: classes4.dex */
final class AvatarCustomizationFragment$onCreateView$1 extends r implements pc.l<Customization, w> {
    final /* synthetic */ AvatarCustomizationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarCustomizationFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$onCreateView$1$1", f = "AvatarCustomizationFragment.kt", l = {91, 93, 94, 96}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$onCreateView$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Customization $customization;
        int label;
        final /* synthetic */ AvatarCustomizationFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Customization customization, AvatarCustomizationFragment avatarCustomizationFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$customization = customization;
            this.this$0 = avatarCustomizationFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$customization, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$onCreateView$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationFragment$onCreateView$1(AvatarCustomizationFragment avatarCustomizationFragment) {
        super(1);
        this.this$0 = avatarCustomizationFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Customization customization) {
        invoke2(customization);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Customization customization) {
        q.i(customization, "customization");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(customization, this.this$0, null), 1, null);
    }
}
