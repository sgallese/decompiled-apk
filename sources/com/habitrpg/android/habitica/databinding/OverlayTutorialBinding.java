package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class OverlayTutorialBinding implements a {
    public final RelativeLayout background;
    private final RelativeLayout rootView;
    public final SpeechBubbleView speechBubbleView;

    private OverlayTutorialBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, SpeechBubbleView speechBubbleView) {
        this.rootView = relativeLayout;
        this.background = relativeLayout2;
        this.speechBubbleView = speechBubbleView;
    }

    public static OverlayTutorialBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        SpeechBubbleView speechBubbleView = (SpeechBubbleView) b.a(view, R.id.speech_bubble_view);
        if (speechBubbleView != null) {
            return new OverlayTutorialBinding(relativeLayout, relativeLayout, speechBubbleView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.speech_bubble_view)));
    }

    public static OverlayTutorialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayTutorialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.overlay_tutorial, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
