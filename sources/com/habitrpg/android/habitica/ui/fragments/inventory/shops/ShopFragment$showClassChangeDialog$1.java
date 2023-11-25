package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import dc.n;
import dc.r;
import dc.w;
import ec.m0;
import ic.d;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$showClassChangeDialog$1", f = "ShopFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShopFragment$showClassChangeDialog$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $classIdentifier;
    int label;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$showClassChangeDialog$1(ShopFragment shopFragment, String str, Continuation<? super ShopFragment$showClassChangeDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = shopFragment;
        this.$classIdentifier = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShopFragment$showClassChangeDialog$1(this.this$0, this.$classIdentifier, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShopFragment$showClassChangeDialog$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        InsufficientGemsDialog insufficientGemsDialog;
        Map e10;
        d.d();
        if (this.label == 0) {
            n.b(obj);
            User f10 = this.this$0.getUserViewModel().getUser().f();
            if (f10 == null) {
                return w.f13270a;
            }
            Context context = this.this$0.getContext();
            if (context != null) {
                ShopFragment shopFragment = this.this$0;
                String str = this.$classIdentifier;
                if (f10.getGemCount() <= 2) {
                    MainActivity mainActivity = shopFragment.getMainActivity();
                    if (mainActivity != null) {
                        insufficientGemsDialog = new InsufficientGemsDialog(mainActivity, 3);
                    } else {
                        insufficientGemsDialog = null;
                    }
                    Analytics analytics = Analytics.INSTANCE;
                    EventCategory eventCategory = EventCategory.BEHAVIOUR;
                    HitType hitType = HitType.EVENT;
                    e10 = m0.e(r.a("reason", "class change"));
                    Analytics.sendEvent$default(analytics, "show insufficient gems modal", eventCategory, hitType, e10, null, 16, null);
                    if (insufficientGemsDialog != null) {
                        insufficientGemsDialog.show();
                    }
                    return w.f13270a;
                }
                Flags flags = f10.getFlags();
                if (flags != null && flags.getClassSelected()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Preferences preferences = f10.getPreferences();
                    if (preferences != null && !preferences.getDisableClasses()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
                        habiticaAlertDialog.setTitle(shopFragment.getString(R.string.change_class_selected_confirmation, str));
                        habiticaAlertDialog.setMessage(shopFragment.getString(R.string.change_class_equipment_warning));
                        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.choose_class, true, false, false, (p) new ShopFragment$showClassChangeDialog$1$1$1(context, shopFragment, str), 12, (Object) null);
                        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
                        habiticaAlertDialog.show();
                    }
                }
                HabiticaAlertDialog habiticaAlertDialog2 = new HabiticaAlertDialog(context);
                habiticaAlertDialog2.setTitle(shopFragment.getString(R.string.class_confirmation, str));
                HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.choose_class, true, false, false, (p) new ShopFragment$showClassChangeDialog$1$1$2(context, shopFragment, str), 12, (Object) null);
                HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
                habiticaAlertDialog2.show();
            }
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
