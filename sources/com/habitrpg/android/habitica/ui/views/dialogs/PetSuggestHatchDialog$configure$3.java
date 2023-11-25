package com.habitrpg.android.habitica.ui.views.dialogs;

import ad.k0;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.habitrpg.android.habitica.databinding.DialogPetSuggestHatchBinding;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetSuggestHatchDialog.kt */
/* loaded from: classes4.dex */
public final class PetSuggestHatchDialog$configure$3 extends r implements l<Drawable, w> {
    final /* synthetic */ boolean $hasMount;
    final /* synthetic */ PetSuggestHatchDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PetSuggestHatchDialog.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog$configure$3$1", f = "PetSuggestHatchDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog$configure$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Drawable $drawable;
        int label;
        final /* synthetic */ PetSuggestHatchDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PetSuggestHatchDialog petSuggestHatchDialog, Drawable drawable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = petSuggestHatchDialog;
            this.$drawable = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$drawable, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DialogPetSuggestHatchBinding dialogPetSuggestHatchBinding;
            d.d();
            if (this.label == 0) {
                n.b(obj);
                dialogPetSuggestHatchBinding = this.this$0.binding;
                if (dialogPetSuggestHatchBinding == null) {
                    q.z("binding");
                    dialogPetSuggestHatchBinding = null;
                }
                dialogPetSuggestHatchBinding.petView.setBitmap(androidx.core.graphics.drawable.b.b(this.$drawable, 0, 0, null, 7, null));
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetSuggestHatchDialog$configure$3(PetSuggestHatchDialog petSuggestHatchDialog, boolean z10) {
        super(1);
        this.this$0 = petSuggestHatchDialog;
        this.$hasMount = z10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        q.i(drawable, "it");
        Resources resources = this.this$0.getContext().getResources();
        if (resources == null) {
            return;
        }
        if (!this.$hasMount) {
            drawable = new BitmapDrawable(resources, androidx.core.graphics.drawable.b.b(drawable, 0, 0, null, 7, null).extractAlpha());
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, drawable, null), 1, null);
    }
}
