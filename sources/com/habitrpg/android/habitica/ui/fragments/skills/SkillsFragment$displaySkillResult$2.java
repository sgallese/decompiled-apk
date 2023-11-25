package com.habitrpg.android.habitica.ui.fragments.skills;

import ad.k0;
import ad.u0;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.responses.SkillResponse;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import dc.n;
import dc.w;
import ic.d;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: SkillsFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment$displaySkillResult$2", f = "SkillsFragment.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SkillsFragment$displaySkillResult$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ MainActivity $activity;
    final /* synthetic */ SkillResponse $response;
    int label;
    final /* synthetic */ SkillsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsFragment$displaySkillResult$2(SkillsFragment skillsFragment, MainActivity mainActivity, SkillResponse skillResponse, Continuation<? super SkillsFragment$displaySkillResult$2> continuation) {
        super(2, continuation);
        this.this$0 = skillsFragment;
        this.$activity = mainActivity;
        this.$response = skillResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SkillsFragment$displaySkillResult$2(this.this$0, this.$activity, this.$response, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SkillsFragment$displaySkillResult$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
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
            this.label = 1;
            if (u0.a(2000L, this) == d10) {
                return d10;
            }
        }
        if (!this.this$0.isAdded()) {
            return w.f13270a;
        }
        HabiticaSnackbar.Companion companion = HabiticaSnackbar.Companion;
        ViewGroup snackbarContainer = this.$activity.getSnackbarContainer();
        Context context = this.this$0.getContext();
        if (context != null) {
            str = context.getString(R.string.caused_damage);
        } else {
            str = null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.this$0.getResources(), HabiticaIconsHelper.imageOfDamage());
        Integer d11 = kotlin.coroutines.jvm.internal.b.d(androidx.core.content.a.c(this.$activity, R.color.green_10));
        String format = String.format("+%.01f", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.c(this.$response.getDamage())}, 1));
        q.h(format, "format(this, *args)");
        companion.showSnackbar(snackbarContainer, null, str, bitmapDrawable, d11, format, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, (r25 & 128) != 0 ? false : false, (r25 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : false, (r25 & 512) != 0 ? 0 : 0);
        return w.f13270a;
    }
}
