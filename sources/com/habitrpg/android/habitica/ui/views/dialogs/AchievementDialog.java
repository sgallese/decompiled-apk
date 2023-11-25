package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogAchievementDetailBinding;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.views.PixelArtView;
import pc.p;
import qc.q;

/* compiled from: AchievementDialog.kt */
/* loaded from: classes4.dex */
public final class AchievementDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private final DialogAchievementDetailBinding binding;
    private boolean isLastOnboardingAchievement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchievementDialog(Context context) {
        super(context);
        q.i(context, "context");
        DialogAchievementDetailBinding inflate = DialogAchievementDetailBinding.inflate(ContextExtensionsKt.getLayoutInflater(context));
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        inflate.titleView.setVisibility(0);
        setAdditionalContentView(inflate.getRoot());
    }

    private final void configure(int i10, int i11, String str) {
        String string = getContext().getString(i10);
        q.h(string, "getString(...)");
        String string2 = getContext().getString(i11);
        q.h(string2, "getString(...)");
        configure(string, string2, str);
    }

    public final boolean isLastOnboardingAchievement() {
        return this.isLastOnboardingAchievement;
    }

    public final void setLastOnboardingAchievement(boolean z10) {
        this.isLastOnboardingAchievement = z10;
    }

    public final void setType(String str, String str2, String str3) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        if (q.d(str, Notification.Type.ACHIEVEMENT_PARTY_UP.getType())) {
            configure(R.string.partyUpTitle, R.string.partyUpDescription, "partyUp");
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_PARTY_ON.getType())) {
            configure(R.string.partyOnTitle, R.string.partyOnDescription, "partyOn");
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_BEAST_MASTER.getType())) {
            configure(R.string.beastMasterTitle, R.string.beastMasterDescription, "rat");
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_MOUNT_MASTER.getType())) {
            configure(R.string.mountMasterTitle, R.string.mountMasterDescription, "wolf");
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_TRIAD_BINGO.getType())) {
            configure(R.string.triadBingoTitle, R.string.triadBingoDescription, "triadbingo");
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_GUILD_JOINED.getType())) {
            configure(R.string.joinedGuildTitle, R.string.joinedGuildDescription, "guild");
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_CHALLENGE_JOINED.getType())) {
            configure(R.string.joinedChallengeTitle, R.string.joinedChallengeDescription, ClientData.KEY_CHALLENGE);
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_INVITED_FRIEND.getType())) {
            configure(R.string.inviteFriendTitle, R.string.inviteFriendDescription, "friends");
        } else if (q.d(str, "createdTask")) {
            configure(R.string.createdTaskTitle, R.string.createdTaskDescription, str);
        } else if (q.d(str, "completedTask")) {
            configure(R.string.completedTaskTitle, R.string.completedTaskDescription, str);
        } else if (q.d(str, "hatchedPet")) {
            configure(R.string.hatchedPetTitle, R.string.hatchedPetDescription, str);
        } else if (q.d(str, "fedPet")) {
            configure(R.string.fedPetTitle, R.string.fedPetDescription, str);
        } else if (q.d(str, "purchasedEquipment")) {
            configure(R.string.purchasedEquipmentTitle, R.string.purchasedEquipmentDescription, str);
        } else if (q.d(str, Notification.Type.ACHIEVEMENT_ONBOARDING_COMPLETE.getType())) {
            configure(R.string.onboardingCompleteTitle, R.string.onboardingCompleteDescription, "onboardingComplete");
        } else {
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            configure(str2, str3, str);
        }
    }

    private final void configure(String str, String str2, String str3) {
        this.binding.titleView.setText(str);
        this.binding.descriptionView.setText(StringExtensionsKt.fromHtml(str2), TextView.BufferType.SPANNABLE);
        PixelArtView pixelArtView = this.binding.iconView;
        q.h(pixelArtView, "iconView");
        DataBindingUtilsKt.loadImage$default(pixelArtView, "achievement-" + str3 + "2x", null, 2, null);
        if (q.d(str3, "onboardingComplete")) {
            setTitle(R.string.onboardingComplete_achievement_title);
            this.binding.titleView.setTextSize(2, 14.0f);
            this.binding.achievementWrapper.setVisibility(8);
            this.binding.onboardingDoneIcon.setVisibility(0);
            this.binding.titleView.setTypeface(Typeface.DEFAULT);
            this.binding.titleView.setText(StringExtensionsKt.fromHtml(str), TextView.BufferType.SPANNABLE);
        } else {
            setTitle(R.string.achievement_title);
            this.binding.achievementWrapper.setVisibility(0);
            this.binding.onboardingDoneIcon.setVisibility(8);
        }
        if (User.Companion.getONBOARDING_ACHIEVEMENT_KEYS().contains(str3)) {
            HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.onwards, true, false, false, (p) AchievementDialog$configure$1.INSTANCE, 8, (Object) null);
            if (this.isLastOnboardingAchievement) {
                return;
            }
            HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.view_onboarding_tasks, false, false, false, (p) AchievementDialog$configure$2.INSTANCE, 8, (Object) null);
            return;
        }
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.view_achievements, true, false, false, (p) AchievementDialog$configure$3.INSTANCE, 8, (Object) null);
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
    }
}
