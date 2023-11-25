package com.habitrpg.android.habitica.ui.fragments.setup;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import qc.r;

/* compiled from: WelcomeFragment.kt */
/* loaded from: classes4.dex */
final class WelcomeFragment$checkmarkIcon$2 extends r implements pc.a<Drawable> {
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$checkmarkIcon$2(WelcomeFragment welcomeFragment) {
        super(0);
        this.this$0 = welcomeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final Drawable invoke() {
        Context context = this.this$0.getContext();
        if (context != null) {
            return new BitmapDrawable(this.this$0.getResources(), HabiticaIconsHelper.imageOfCheckmark(androidx.core.content.a.c(context, R.color.green_50), 1.0f));
        }
        return new VectorDrawable();
    }
}
