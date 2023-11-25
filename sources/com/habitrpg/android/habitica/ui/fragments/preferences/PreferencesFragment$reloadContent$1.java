package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import android.content.Context;
import androidx.fragment.app.q;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferencesFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$reloadContent$1", f = "PreferencesFragment.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PreferencesFragment$reloadContent$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ boolean $withConfirmation;
    int label;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$reloadContent$1(PreferencesFragment preferencesFragment, boolean z10, Continuation<? super PreferencesFragment$reloadContent$1> continuation) {
        super(2, continuation);
        this.this$0 = preferencesFragment;
        this.$withConfirmation = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PreferencesFragment$reloadContent$1(this.this$0, this.$withConfirmation, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PreferencesFragment$reloadContent$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SnackbarActivity snackbarActivity;
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
            ContentRepository contentRepository = this.this$0.getContentRepository();
            this.label = 1;
            if (contentRepository.retrieveContent(true, this) == d10) {
                return d10;
            }
        }
        if (this.$withConfirmation) {
            q activity = this.this$0.getActivity();
            String str = null;
            if (activity instanceof SnackbarActivity) {
                snackbarActivity = (SnackbarActivity) activity;
            } else {
                snackbarActivity = null;
            }
            if (snackbarActivity != null) {
                Context context = this.this$0.getContext();
                if (context != null) {
                    str = context.getString(R.string.reloaded_content);
                }
                SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity, null, null, str, null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.SUCCESS, false, 379, null);
            }
        }
        return w.f13270a;
    }
}
