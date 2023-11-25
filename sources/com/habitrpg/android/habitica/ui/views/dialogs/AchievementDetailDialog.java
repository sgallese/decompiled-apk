package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.habitrpg.android.habitica.databinding.DialogAchievementDetailBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;

/* compiled from: AchievementDetailDialog.kt */
/* loaded from: classes4.dex */
public final class AchievementDetailDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private final Achievement achievement;
    private TextView descriptionView;
    private PixelArtView iconView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchievementDetailDialog(Achievement achievement, Context context) {
        super(context);
        String str;
        CharSequence charSequence;
        q.i(achievement, "achievement");
        q.i(context, "context");
        this.achievement = achievement;
        Object systemService = context.getSystemService("layout_inflater");
        q.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        DialogAchievementDetailBinding inflate = DialogAchievementDetailBinding.inflate((LayoutInflater) systemService);
        q.h(inflate, "inflate(...)");
        inflate.onboardingDoneIcon.setVisibility(8);
        this.iconView = inflate.iconView;
        this.descriptionView = inflate.descriptionView;
        setAdditionalContentView(inflate.getRoot());
        setTitle(achievement.getTitle());
        TextView textView = this.descriptionView;
        if (textView != null) {
            String text = achievement.getText();
            if (text != null) {
                charSequence = StringExtensionsKt.fromHtml(text);
            } else {
                charSequence = null;
            }
            textView.setText(charSequence, TextView.BufferType.SPANNABLE);
        }
        if (achievement.getEarned()) {
            str = achievement.getIcon() + "2x";
        } else {
            str = "achievement-unearned2x";
        }
        PixelArtView pixelArtView = this.iconView;
        if (pixelArtView != null) {
            DataBindingUtilsKt.loadImage$default(pixelArtView, str, null, 2, null);
        }
        AlertDialogExtensionsKt.addCloseButton$default(this, true, null, 2, null);
    }

    public final Achievement getAchievement() {
        return this.achievement;
    }
}
