package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.models.notifications.ChallengeWonData;
import com.habitrpg.common.habitica.views.PixelArtView;
import pc.p;
import qc.q;

/* compiled from: WonChallengeDialog.kt */
/* loaded from: classes4.dex */
public final class WonChallengeDialog extends HabiticaAlertDialog {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WonChallengeDialog(Context context) {
        super(context);
        LayoutInflater layoutInflater;
        q.i(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            layoutInflater = (LayoutInflater) systemService;
        } else {
            layoutInflater = null;
        }
        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.dialog_won_challenge, (ViewGroup) null) : null;
        setTitle(R.string.you_won_challenge);
        setAdditionalContentView(inflate);
    }

    public final void configure(ChallengeWonData challengeWonData) {
        PixelArtView pixelArtView;
        String str;
        int i10;
        Integer num;
        ImageView imageView;
        Integer prize;
        TextView textView;
        View additionalContentView$Habitica_2311256681_prodRelease = getAdditionalContentView$Habitica_2311256681_prodRelease();
        ImageView imageView2 = null;
        if (additionalContentView$Habitica_2311256681_prodRelease != null) {
            pixelArtView = (PixelArtView) additionalContentView$Habitica_2311256681_prodRelease.findViewById(R.id.achievement_view);
        } else {
            pixelArtView = null;
        }
        if (pixelArtView != null) {
            DataBindingUtilsKt.loadImage$default(pixelArtView, "achievement-karaoke-2x", null, 2, null);
        }
        if (challengeWonData != null) {
            str = challengeWonData.getName();
        } else {
            str = null;
        }
        if (str != null) {
            View additionalContentView$Habitica_2311256681_prodRelease2 = getAdditionalContentView$Habitica_2311256681_prodRelease();
            if (additionalContentView$Habitica_2311256681_prodRelease2 != null) {
                textView = (TextView) additionalContentView$Habitica_2311256681_prodRelease2.findViewById(R.id.description_view);
            } else {
                textView = null;
            }
            if (textView != null) {
                String string = getContext().getString(R.string.won_achievement_description, challengeWonData.getName());
                q.h(string, "getString(...)");
                textView.setText(StringExtensionsKt.fromHtml(string));
            }
        }
        if (challengeWonData != null && (prize = challengeWonData.getPrize()) != null) {
            i10 = prize.intValue();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            Context context = getContext();
            Object[] objArr = new Object[1];
            if (challengeWonData != null) {
                num = challengeWonData.getPrize();
            } else {
                num = null;
            }
            objArr[0] = num;
            String string2 = context.getString(R.string.claim_x_gems, objArr);
            q.h(string2, "getString(...)");
            HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, string2, true, false, false, (p) null, 28, (Object) null);
            View additionalContentView$Habitica_2311256681_prodRelease3 = getAdditionalContentView$Habitica_2311256681_prodRelease();
            if (additionalContentView$Habitica_2311256681_prodRelease3 != null) {
                imageView = (ImageView) additionalContentView$Habitica_2311256681_prodRelease3.findViewById(R.id.achievement_confetti_left);
            } else {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View additionalContentView$Habitica_2311256681_prodRelease4 = getAdditionalContentView$Habitica_2311256681_prodRelease();
            if (additionalContentView$Habitica_2311256681_prodRelease4 != null) {
                imageView2 = (ImageView) additionalContentView$Habitica_2311256681_prodRelease4.findViewById(R.id.achievement_confetti_right);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.hurray, true, false, false, (p) null, 28, (Object) null);
        View additionalContentView$Habitica_2311256681_prodRelease5 = getAdditionalContentView$Habitica_2311256681_prodRelease();
        if (additionalContentView$Habitica_2311256681_prodRelease5 != null) {
            imageView2 = (ImageView) additionalContentView$Habitica_2311256681_prodRelease5.findViewById(R.id.achievement_confetti_view);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }
}
