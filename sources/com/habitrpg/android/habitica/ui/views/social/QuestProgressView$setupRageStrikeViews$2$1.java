package com.habitrpg.android.habitica.ui.views.social;

import ad.k0;
import ad.l0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$2$1;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuestProgressView.kt */
/* loaded from: classes4.dex */
public final class QuestProgressView$setupRageStrikeViews$2$1 extends r implements pc.l<Drawable, w> {
    final /* synthetic */ ImageView $iconView;
    final /* synthetic */ QuestRageStrike $strike;
    final /* synthetic */ QuestProgressView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuestProgressView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$2$1$1", f = "QuestProgressView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$2$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ ImageView $iconView;
        final /* synthetic */ Drawable $it;
        final /* synthetic */ QuestRageStrike $strike;
        int label;
        final /* synthetic */ QuestProgressView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Drawable drawable, QuestProgressView questProgressView, ImageView imageView, QuestRageStrike questRageStrike, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = drawable;
            this.this$0 = questProgressView;
            this.$iconView = imageView;
            this.$strike = questRageStrike;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(QuestProgressView questProgressView, QuestRageStrike questRageStrike, View view) {
            questProgressView.showActiveStrikeAlert(questRageStrike.getKey());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, this.this$0, this.$iconView, this.$strike, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                Bitmap b10 = androidx.core.graphics.drawable.b.b(this.$it, 0, 0, null, 7, null);
                float f10 = this.this$0.getResources().getDisplayMetrics().density;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(b10, (int) (b10.getWidth() * f10), (int) (b10.getHeight() * f10), false);
                q.h(createScaledBitmap, "createScaledBitmap(...)");
                this.$iconView.setImageBitmap(HabiticaIconsHelper.imageOfRageStrikeActive(this.this$0.getContext(), createScaledBitmap));
                ImageView imageView = this.$iconView;
                final QuestProgressView questProgressView = this.this$0;
                final QuestRageStrike questRageStrike = this.$strike;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        QuestProgressView$setupRageStrikeViews$2$1.AnonymousClass1.invokeSuspend$lambda$0(QuestProgressView.this, questRageStrike, view);
                    }
                });
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestProgressView$setupRageStrikeViews$2$1(QuestProgressView questProgressView, ImageView imageView, QuestRageStrike questRageStrike) {
        super(1);
        this.this$0 = questProgressView;
        this.$iconView = imageView;
        this.$strike = questRageStrike;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        q.i(drawable, "it");
        ExceptionHandlerKt.launchCatching$default(l0.b(), null, new AnonymousClass1(drawable, this.this$0, this.$iconView, this.$strike, null), 1, null);
    }
}
