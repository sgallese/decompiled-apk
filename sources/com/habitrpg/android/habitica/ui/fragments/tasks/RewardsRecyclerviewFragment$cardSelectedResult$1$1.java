package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RewardsRecyclerviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$cardSelectedResult$1$1", f = "RewardsRecyclerviewFragment.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RewardsRecyclerviewFragment$cardSelectedResult$1$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ActivityResult $it;
    int label;
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$cardSelectedResult$1$1(RewardsRecyclerviewFragment rewardsRecyclerviewFragment, ActivityResult activityResult, Continuation<? super RewardsRecyclerviewFragment$cardSelectedResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardsRecyclerviewFragment;
        this.$it = activityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new RewardsRecyclerviewFragment$cardSelectedResult$1$1(this.this$0, this.$it, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((RewardsRecyclerviewFragment$cardSelectedResult$1$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ShopItem shopItem;
        String str;
        String stringExtra;
        MainActivity mainActivity;
        ShopItem shopItem2;
        d10 = ic.d.d();
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
            shopItem = this.this$0.selectedCard;
            String str2 = "";
            if (shopItem == null || (str = shopItem.getKey()) == null) {
                str = "";
            }
            Intent a10 = this.$it.a();
            if (a10 != null && (stringExtra = a10.getStringExtra("member_id")) != null) {
                str2 = stringExtra;
            }
            this.label = 1;
            if (userRepository.useSkill(str, "member", str2, this) == d10) {
                return d10;
            }
        }
        q activity = this.this$0.getActivity();
        String str3 = null;
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        if (mainActivity == null) {
            return w.f13270a;
        }
        HabiticaSnackbar.Companion companion = HabiticaSnackbar.Companion;
        ViewGroup snackbarContainer = mainActivity.getSnackbarContainer();
        Context context = this.this$0.getContext();
        if (context != null) {
            Object[] objArr = new Object[1];
            shopItem2 = this.this$0.selectedCard;
            if (shopItem2 != null) {
                str3 = shopItem2.getText();
            }
            objArr[0] = str3;
            str3 = context.getString(R.string.sent_card, objArr);
        }
        companion.showSnackbar(snackbarContainer, str3, HabiticaSnackbar.SnackbarDisplayType.BLUE, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
        return w.f13270a;
    }
}
