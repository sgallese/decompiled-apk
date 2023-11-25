package com.habitrpg.android.habitica.interactors;

import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogLevelup10Binding;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.CheckClassSelectionUseCase;
import com.habitrpg.android.habitica.interactors.UseCase;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.SuppressedModals;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.views.AvatarView;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import pc.p;
import qc.q;

/* compiled from: LevelUpUseCase.kt */
/* loaded from: classes4.dex */
public final class LevelUpUseCase extends UseCase<RequestValues, Stats> {
    public static final int $stable = CheckClassSelectionUseCase.$stable | SoundManager.$stable;
    private final CheckClassSelectionUseCase checkClassSelectionUseCase;
    private final SoundManager soundManager;

    /* compiled from: LevelUpUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final BaseActivity activity;
        private final Integer level;
        private final int newLevel;
        private final ViewGroup snackbarTargetView;
        private final User user;

        public RequestValues(User user, Integer num, BaseActivity baseActivity, ViewGroup viewGroup) {
            int i10;
            q.i(user, "user");
            q.i(baseActivity, "activity");
            q.i(viewGroup, "snackbarTargetView");
            this.user = user;
            this.level = num;
            this.activity = baseActivity;
            this.snackbarTargetView = viewGroup;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            this.newLevel = i10;
        }

        public final BaseActivity getActivity() {
            return this.activity;
        }

        public final Integer getLevel() {
            return this.level;
        }

        public final int getNewLevel() {
            return this.newLevel;
        }

        public final ViewGroup getSnackbarTargetView() {
            return this.snackbarTargetView;
        }

        public final User getUser() {
            return this.user;
        }
    }

    public LevelUpUseCase(SoundManager soundManager, CheckClassSelectionUseCase checkClassSelectionUseCase) {
        q.i(soundManager, "soundManager");
        q.i(checkClassSelectionUseCase, "checkClassSelectionUseCase");
        this.soundManager = soundManager;
        this.checkClassSelectionUseCase = checkClassSelectionUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showClassSelection(RequestValues requestValues, Continuation<? super w> continuation) {
        Object d10;
        Object callInteractor = this.checkClassSelectionUseCase.callInteractor(new CheckClassSelectionUseCase.RequestValues(requestValues.getUser(), true, null, requestValues.getActivity()), continuation);
        d10 = d.d();
        if (callInteractor == d10) {
            return callInteractor;
        }
        return w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    public Object run(RequestValues requestValues, Continuation<? super Stats> continuation) {
        this.soundManager.loadAndPlayAudio(SoundManager.SoundLevelUp);
        Preferences preferences = requestValues.getUser().getPreferences();
        SuppressedModals suppressModals = preferences != null ? preferences.getSuppressModals() : null;
        if (requestValues.getNewLevel() == 10) {
            DialogLevelup10Binding inflate = DialogLevelup10Binding.inflate(requestValues.getActivity().getLayoutInflater());
            q.h(inflate, "inflate(...)");
            inflate.healerIconView.setImageBitmap(HabiticaIconsHelper.imageOfHealerLightBg());
            inflate.mageIconView.setImageBitmap(HabiticaIconsHelper.imageOfMageLightBg());
            inflate.rogueIconView.setImageBitmap(HabiticaIconsHelper.imageOfRogueLightBg());
            inflate.warriorIconView.setImageBitmap(HabiticaIconsHelper.imageOfWarriorLightBg());
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(requestValues.getActivity());
            habiticaAlertDialog.setTitle(requestValues.getActivity().getString(R.string.levelup_header, b.d(requestValues.getNewLevel())));
            habiticaAlertDialog.setAdditionalContentView(inflate.getRoot());
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.select_class, true, false, false, (p) new LevelUpUseCase$run$2(this, requestValues), 12, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.not_now, false, false, false, (p) null, 28, (Object) null);
            habiticaAlertDialog.setCelebratory(true);
            if (!requestValues.getActivity().isFinishing()) {
                habiticaAlertDialog.enqueue();
            }
        } else {
            if (suppressModals != null ? q.d(suppressModals.getLevelUp(), b.a(true)) : false) {
                HabiticaSnackbar.Companion.showSnackbar(requestValues.getSnackbarTargetView(), requestValues.getActivity().getString(R.string.levelup_header, b.d(requestValues.getNewLevel())), HabiticaSnackbar.SnackbarDisplayType.SUCCESS, (r16 & 8) != 0 ? false : true, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
                return requestValues.getUser().getStats();
            }
            View inflate2 = requestValues.getActivity().getLayoutInflater().inflate(R.layout.dialog_levelup, (ViewGroup) null);
            if (inflate2 != null) {
                AvatarView avatarView = (AvatarView) inflate2.findViewById(R.id.avatarView);
                q.f(avatarView);
                AvatarView.setAvatar$default(avatarView, requestValues.getUser(), null, 2, null);
            }
            HabiticaAlertDialog habiticaAlertDialog2 = new HabiticaAlertDialog(requestValues.getActivity());
            habiticaAlertDialog2.setTitle(requestValues.getActivity().getString(R.string.levelup_header, b.d(requestValues.getNewLevel())));
            habiticaAlertDialog2.setAdditionalContentView(inflate2);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.onwards, true, false, false, (p) new LevelUpUseCase$run$3(this, requestValues), 12, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.share, false, false, false, (p) new LevelUpUseCase$run$4(requestValues), 12, (Object) null);
            habiticaAlertDialog2.setCelebratory(true);
            if (!requestValues.getActivity().isFinishing()) {
                habiticaAlertDialog2.enqueue();
            }
        }
        return requestValues.getUser().getStats();
    }
}
