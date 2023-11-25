package com.habitrpg.android.habitica.ui.views.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import java.util.List;
import qc.q;

/* compiled from: StarView.kt */
/* loaded from: classes4.dex */
public final class StarView extends AppCompatImageView {
    public static final int $stable = 8;
    private List<Integer> blinkDurations;
    private int blinkIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runBlink() {
        int i10;
        long j10;
        int i11 = this.blinkIndex;
        List<Integer> list = this.blinkDurations;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i11 >= i10) {
            this.blinkIndex = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f);
        ofFloat.setDuration(1000L);
        List<Integer> list2 = this.blinkDurations;
        if (list2 != null) {
            j10 = list2.get(this.blinkIndex).intValue();
        } else {
            j10 = 0;
        }
        ofFloat.setStartDelay(j10);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.habitrpg.android.habitica.ui.views.login.StarView$runBlink$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i12;
                q.i(animator, "animation");
                StarView starView = StarView.this;
                i12 = starView.blinkIndex;
                starView.blinkIndex = i12 + 1;
                StarView.this.runBlink();
            }
        });
        try {
            ofFloat.start();
        } catch (NullPointerException unused) {
        }
    }

    public final void setBlinkDurations(List<Integer> list) {
        q.i(list, "blinkDurations");
        this.blinkDurations = list;
        runBlink();
    }

    public final void setStarSize(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    setImageBitmap(HabiticaIconsHelper.imageOfStarLarge());
                    return;
                }
                return;
            }
            setImageBitmap(HabiticaIconsHelper.imageOfStarMedium());
            return;
        }
        setImageBitmap(HabiticaIconsHelper.imageOfStarSmall());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarView(Context context) {
        super(context);
        q.i(context, "context");
        setScaleType(ImageView.ScaleType.CENTER);
    }
}
