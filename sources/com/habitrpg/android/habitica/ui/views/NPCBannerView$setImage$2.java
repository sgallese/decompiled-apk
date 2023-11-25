package com.habitrpg.android.habitica.ui.views;

import ad.k0;
import ad.l0;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.NpcBannerBinding;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NPCBannerView.kt */
/* loaded from: classes4.dex */
public final class NPCBannerView$setImage$2 extends r implements pc.l<Drawable, w> {
    final /* synthetic */ NPCBannerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NPCBannerView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.NPCBannerView$setImage$2$1", f = "NPCBannerView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.NPCBannerView$setImage$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ BitmapDrawable $drawable;
        int label;
        final /* synthetic */ NPCBannerView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NPCBannerView nPCBannerView, BitmapDrawable bitmapDrawable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nPCBannerView;
            this.$drawable = bitmapDrawable;
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
            NpcBannerBinding npcBannerBinding;
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                npcBannerBinding = this.this$0.binding;
                npcBannerBinding.backgroundView.setBackground(this.$drawable);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPCBannerView$setImage$2(NPCBannerView nPCBannerView) {
        super(1);
        this.this$0 = nPCBannerView;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        int d10;
        q.i(drawable, "it");
        int dimension = (int) this.this$0.getContext().getResources().getDimension(R.dimen.shop_height);
        d10 = sc.c.d(dimension * (drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.this$0.getContext().getResources(), Bitmap.createScaledBitmap(androidx.core.graphics.drawable.b.b(drawable, 0, 0, null, 7, null), d10, dimension, false));
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        ad.i.d(l0.b(), null, null, new AnonymousClass1(this.this$0, bitmapDrawable, null), 3, null);
    }
}
