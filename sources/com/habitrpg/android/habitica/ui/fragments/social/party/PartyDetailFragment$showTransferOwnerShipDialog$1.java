package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import android.view.ViewGroup;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import qc.j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment$showTransferOwnerShipDialog$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ String $displayName;
    final /* synthetic */ String $userID;
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartyDetailFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$showTransferOwnerShipDialog$1$1", f = "PartyDetailFragment.kt", l = {405}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$showTransferOwnerShipDialog$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ String $displayName;
        final /* synthetic */ String $userID;
        int label;
        final /* synthetic */ PartyDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PartyDetailFragment partyDetailFragment, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partyDetailFragment;
            this.$userID = str;
            this.$displayName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$userID, this.$displayName, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            MainActivity mainActivity;
            ViewGroup snackbarContainer;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                SocialRepository socialRepository = this.this$0.getSocialRepository();
                String groupID = this.this$0.getViewModel().getGroupID();
                if (groupID == null) {
                    groupID = "";
                }
                String str = this.$userID;
                this.label = 1;
                if (socialRepository.transferGroupOwnership(groupID, str, this) == d10) {
                    return d10;
                }
            }
            androidx.fragment.app.q activity = this.this$0.getActivity();
            if (activity instanceof MainActivity) {
                mainActivity = (MainActivity) activity;
            } else {
                mainActivity = null;
            }
            if (mainActivity != null && (snackbarContainer = mainActivity.getSnackbarContainer()) != null) {
                PartyDetailFragment partyDetailFragment = this.this$0;
                String str2 = this.$displayName;
                HabiticaSnackbar.Companion companion = HabiticaSnackbar.Companion;
                j0 j0Var = j0.f21683a;
                String string = partyDetailFragment.getString(R.string.transferred_ownership);
                qc.q.h(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
                qc.q.h(format, "format(format, *args)");
                companion.showSnackbar(snackbarContainer, format, HabiticaSnackbar.SnackbarDisplayType.NORMAL, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$showTransferOwnerShipDialog$1(PartyDetailFragment partyDetailFragment, String str, String str2) {
        super(2);
        this.this$0 = partyDetailFragment;
        this.$userID = str;
        this.$displayName = str2;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, this.$userID, this.$displayName, null), 2, null);
        androidx.fragment.app.q activity = this.this$0.getActivity();
        if (activity != null) {
            KeyboardUtilKt.dismissKeyboard(activity);
        }
    }
}
