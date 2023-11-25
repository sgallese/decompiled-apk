package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.ValueBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class QuestProgressOldBinding implements a {
    public final ValueBar bossHealthView;
    public final LinearLayout bossHealthWrapper;
    public final TextView bossNameView;
    public final TextView bossRageNameView;
    public final ValueBar bossRageView;
    public final LinearLayout bossRageWrapper;
    public final LinearLayout collectionContainer;
    private final View rootView;

    private QuestProgressOldBinding(View view, ValueBar valueBar, LinearLayout linearLayout, TextView textView, TextView textView2, ValueBar valueBar2, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.rootView = view;
        this.bossHealthView = valueBar;
        this.bossHealthWrapper = linearLayout;
        this.bossNameView = textView;
        this.bossRageNameView = textView2;
        this.bossRageView = valueBar2;
        this.bossRageWrapper = linearLayout2;
        this.collectionContainer = linearLayout3;
    }

    public static QuestProgressOldBinding bind(View view) {
        int i10 = R.id.bossHealthView;
        ValueBar valueBar = (ValueBar) b.a(view, R.id.bossHealthView);
        if (valueBar != null) {
            i10 = R.id.boss_health_wrapper;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.boss_health_wrapper);
            if (linearLayout != null) {
                i10 = R.id.bossNameView;
                TextView textView = (TextView) b.a(view, R.id.bossNameView);
                if (textView != null) {
                    i10 = R.id.boss_rage_name_view;
                    TextView textView2 = (TextView) b.a(view, R.id.boss_rage_name_view);
                    if (textView2 != null) {
                        i10 = R.id.bossRageView;
                        ValueBar valueBar2 = (ValueBar) b.a(view, R.id.bossRageView);
                        if (valueBar2 != null) {
                            i10 = R.id.boss_rage_wrapper;
                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.boss_rage_wrapper);
                            if (linearLayout2 != null) {
                                i10 = R.id.collectionContainer;
                                LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.collectionContainer);
                                if (linearLayout3 != null) {
                                    return new QuestProgressOldBinding(view, valueBar, linearLayout, textView, textView2, valueBar2, linearLayout2, linearLayout3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuestProgressOldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.quest_progress_old, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
