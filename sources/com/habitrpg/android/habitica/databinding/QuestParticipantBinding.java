package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class QuestParticipantBinding implements a {
    public final ImageView avatarView;
    public final TextView participantName;
    private final LinearLayout rootView;
    public final TextView statusView;

    private QuestParticipantBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.avatarView = imageView;
        this.participantName = textView;
        this.statusView = textView2;
    }

    public static QuestParticipantBinding bind(View view) {
        int i10 = R.id.avatar_view;
        ImageView imageView = (ImageView) b.a(view, R.id.avatar_view);
        if (imageView != null) {
            i10 = R.id.participant_name;
            TextView textView = (TextView) b.a(view, R.id.participant_name);
            if (textView != null) {
                i10 = R.id.status_view;
                TextView textView2 = (TextView) b.a(view, R.id.status_view);
                if (textView2 != null) {
                    return new QuestParticipantBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuestParticipantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QuestParticipantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.quest_participant, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
