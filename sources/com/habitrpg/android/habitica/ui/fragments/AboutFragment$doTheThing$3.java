package com.habitrpg.android.habitica.ui.fragments;

import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.widget.Space;
import com.habitrpg.android.habitica.databinding.FragmentAboutBinding;
import com.habitrpg.android.habitica.ui.activities.MainActivity;

/* compiled from: AboutFragment.kt */
/* loaded from: classes4.dex */
final class AboutFragment$doTheThing$3 extends qc.r implements pc.l<Drawable, dc.w> {
    final /* synthetic */ AboutFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutFragment$doTheThing$3(AboutFragment aboutFragment) {
        super(1);
        this.this$0 = aboutFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(AboutFragment aboutFragment, Drawable drawable) {
        Space space;
        qc.q.i(aboutFragment, "this$0");
        qc.q.i(drawable, "$bitmap");
        MainActivity mainActivity = aboutFragment.getMainActivity();
        if (mainActivity != null) {
            ma.d u10 = new ma.d(mainActivity, 50, drawable, 3000L).p(1.3E-4f, 90).x(-0.08f, 0.08f, 0.05f, 0.1f).r(200L, new AccelerateInterpolator()).u(100.0f);
            FragmentAboutBinding binding = aboutFragment.getBinding();
            if (binding != null) {
                space = binding.anchor;
            } else {
                space = null;
            }
            u10.l(space, 80, 20, 10000);
        }
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Drawable drawable) {
        invoke2(drawable);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final Drawable drawable) {
        qc.q.i(drawable, "bitmap");
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            final AboutFragment aboutFragment = this.this$0;
            mainActivity.runOnUiThread(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.m
                @Override // java.lang.Runnable
                public final void run() {
                    AboutFragment$doTheThing$3.invoke$lambda$1(AboutFragment.this, drawable);
                }
            });
        }
    }
}
