package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.models.PlayerTier;
import qc.q;

/* compiled from: UsernameLabel.kt */
/* loaded from: classes4.dex */
public final class UsernameLabel extends LinearLayout {
    public static final int $stable = 8;
    private boolean isNPC;
    private final TextView textView;
    private int tier;
    private final ImageView tierIconView;
    private String username;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UsernameLabel(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.UsernameLabel.<init>(android.content.Context):void");
    }

    public final int getTier() {
        return this.tier;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isNPC() {
        return this.isNPC;
    }

    public final void setNPC(boolean z10) {
        this.isNPC = z10;
        setTier(this.tier);
    }

    public final void setTier(int i10) {
        this.tier = i10;
        if (this.isNPC) {
            this.textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.contributor_npc));
        } else {
            TextView textView = this.textView;
            PlayerTier.Companion companion = PlayerTier.Companion;
            Context context = getContext();
            q.h(context, "getContext(...)");
            textView.setTextColor(companion.getColorForTier(context, i10));
        }
        if (i10 == 0) {
            this.tierIconView.setVisibility(8);
            return;
        }
        this.tierIconView.setVisibility(0);
        this.tierIconView.setImageBitmap(HabiticaIconsHelper.imageOfContributorBadge(i10, this.isNPC));
    }

    public final void setUsername(String str) {
        this.username = str;
        this.textView.setText(str);
    }

    public /* synthetic */ UsernameLabel(Context context, AttributeSet attributeSet, int i10, qc.h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface create;
        q.i(context, "context");
        TextView textView = new TextView(context);
        this.textView = textView;
        ImageView imageView = new ImageView(context);
        this.tierIconView = imageView;
        this.username = "";
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        layoutParams.weight = 1.0f;
        addView(textView, layoutParams);
        textView.setPadding(0, 0, (int) context.getResources().getDimension(R.dimen.spacing_small), 0);
        textView.setTextSize(2, 14.0f);
        if (Build.VERSION.SDK_INT >= 28) {
            create = Typeface.create(null, 600, false);
            textView.setTypeface(create);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(imageView, layoutParams2);
    }
}
