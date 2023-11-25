package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.a1;
import ad.i;
import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$showClassChangeDialog$1$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ String $classIdentifier;
    final /* synthetic */ Context $context;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShopFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$showClassChangeDialog$1$1$1$1", f = "ShopFragment.kt", l = {264}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$showClassChangeDialog$1$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $classIdentifier;
        final /* synthetic */ HabiticaProgressDialog $dialog;
        int label;
        final /* synthetic */ ShopFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShopFragment shopFragment, String str, HabiticaProgressDialog habiticaProgressDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = shopFragment;
            this.$classIdentifier = str;
            this.$dialog = habiticaProgressDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$classIdentifier, this.$dialog, continuation);
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
                UserRepository userRepository = this.this$0.getUserRepository();
                String str = this.$classIdentifier;
                this.label = 1;
                if (userRepository.changeClass(str, this) == d10) {
                    return d10;
                }
            }
            this.$dialog.dismiss();
            this.this$0.displayClassChanged(this.$classIdentifier);
            this.this$0.loadMarketGear();
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$showClassChangeDialog$1$1$1(Context context, ShopFragment shopFragment, String str) {
        super(2);
        this.$context = context;
        this.this$0 = shopFragment;
        this.$classIdentifier = str;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        HabiticaProgressDialog.Companion companion = HabiticaProgressDialog.Companion;
        Context context = this.$context;
        q.h(context, "$context");
        i.d(androidx.lifecycle.w.a(this.this$0), a1.c(), null, new AnonymousClass1(this.this$0, this.$classIdentifier, companion.show(context, this.this$0.getString(R.string.changing_class_progress), 300), null), 2, null);
    }
}
