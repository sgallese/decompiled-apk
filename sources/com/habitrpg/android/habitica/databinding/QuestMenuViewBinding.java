package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.HabiticaProgressBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class QuestMenuViewBinding implements a {
    public final TextView bossNameView;
    public final HabiticaProgressBar healthBarView;
    public final ImageView heartIconView;
    public final ImageView pendingDamageIconView;
    public final TextView pendingDamageTextView;
    public final HabiticaProgressBar rageBarView;
    public final ImageView rageIconView;
    public final LinearLayout rageView;
    private final View rootView;
    public final LinearLayout topView;
    public final TextView typeTextView;

    private QuestMenuViewBinding(View view, TextView textView, HabiticaProgressBar habiticaProgressBar, ImageView imageView, ImageView imageView2, TextView textView2, HabiticaProgressBar habiticaProgressBar2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView3) {
        this.rootView = view;
        this.bossNameView = textView;
        this.healthBarView = habiticaProgressBar;
        this.heartIconView = imageView;
        this.pendingDamageIconView = imageView2;
        this.pendingDamageTextView = textView2;
        this.rageBarView = habiticaProgressBar2;
        this.rageIconView = imageView3;
        this.rageView = linearLayout;
        this.topView = linearLayout2;
        this.typeTextView = textView3;
    }

    public static QuestMenuViewBinding bind(View view) {
        int i10 = R.id.bossNameView;
        TextView textView = (TextView) b.a(view, R.id.bossNameView);
        if (textView != null) {
            i10 = R.id.healthBarView;
            HabiticaProgressBar habiticaProgressBar = (HabiticaProgressBar) b.a(view, R.id.healthBarView);
            if (habiticaProgressBar != null) {
                i10 = R.id.heartIconView;
                ImageView imageView = (ImageView) b.a(view, R.id.heartIconView);
                if (imageView != null) {
                    i10 = R.id.pendingDamageIconView;
                    ImageView imageView2 = (ImageView) b.a(view, R.id.pendingDamageIconView);
                    if (imageView2 != null) {
                        i10 = R.id.pendingDamageTextView;
                        TextView textView2 = (TextView) b.a(view, R.id.pendingDamageTextView);
                        if (textView2 != null) {
                            i10 = R.id.rageBarView;
                            HabiticaProgressBar habiticaProgressBar2 = (HabiticaProgressBar) b.a(view, R.id.rageBarView);
                            if (habiticaProgressBar2 != null) {
                                i10 = R.id.rageIconView;
                                ImageView imageView3 = (ImageView) b.a(view, R.id.rageIconView);
                                if (imageView3 != null) {
                                    i10 = R.id.rage_view;
                                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.rage_view);
                                    if (linearLayout != null) {
                                        i10 = R.id.topView;
                                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.topView);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.typeTextView;
                                            TextView textView3 = (TextView) b.a(view, R.id.typeTextView);
                                            if (textView3 != null) {
                                                return new QuestMenuViewBinding(view, textView, habiticaProgressBar, imageView, imageView2, textView2, habiticaProgressBar2, imageView3, linearLayout, linearLayout2, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuestMenuViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.quest_menu_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
