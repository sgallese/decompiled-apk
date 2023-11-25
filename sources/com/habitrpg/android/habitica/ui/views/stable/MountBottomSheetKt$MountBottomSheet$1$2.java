package com.habitrpg.android.habitica.ui.views.stable;

import ad.k0;
import ad.l0;
import android.content.Context;
import com.habitrpg.android.habitica.interactors.ShareMountUseCase;
import com.habitrpg.android.habitica.models.inventory.Mount;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.a;
import pc.p;
import qc.r;

/* compiled from: MountBottomSheet.kt */
/* loaded from: classes4.dex */
final class MountBottomSheetKt$MountBottomSheet$1$2 extends r implements a<w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Mount $mount;
    final /* synthetic */ a<w> $onDismiss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MountBottomSheet.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.stable.MountBottomSheetKt$MountBottomSheet$1$2$1", f = "MountBottomSheet.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.stable.MountBottomSheetKt$MountBottomSheet$1$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Mount $mount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Mount mount, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mount = mount;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$mount, this.$context, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                ShareMountUseCase shareMountUseCase = new ShareMountUseCase();
                ShareMountUseCase.RequestValues requestValues = new ShareMountUseCase.RequestValues(this.$mount.getKey(), "", this.$context);
                this.label = 1;
                if (shareMountUseCase.callInteractor(requestValues, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountBottomSheetKt$MountBottomSheet$1$2(a<w> aVar, Mount mount, Context context) {
        super(0);
        this.$onDismiss = aVar;
        this.$mount = mount;
        this.$context = context;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(this.$mount, this.$context, null), 1, null);
        this.$onDismiss.invoke();
    }
}
