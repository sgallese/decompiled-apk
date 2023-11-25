package com.habitrpg.android.habitica.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.OverlayTutorialBinding;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import ec.b0;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: TutorialView.kt */
/* loaded from: classes4.dex */
public final class TutorialView extends FrameLayout {
    public static final int $stable = 8;
    private final OverlayTutorialBinding binding;
    private int currentTextIndex;
    private final OnTutorialReaction onReaction;
    private final TutorialStep step;
    private List<String> tutorialTexts;

    /* compiled from: TutorialView.kt */
    /* loaded from: classes4.dex */
    public interface OnTutorialReaction {
        void onTutorialCompleted(TutorialStep tutorialStep);

        void onTutorialDeferred(TutorialStep tutorialStep);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialView(Context context, TutorialStep tutorialStep, OnTutorialReaction onTutorialReaction) {
        super(context);
        List<String> i10;
        q.i(context, "context");
        q.i(tutorialStep, "step");
        q.i(onTutorialReaction, "onReaction");
        this.step = tutorialStep;
        this.onReaction = onTutorialReaction;
        OverlayTutorialBinding inflate = OverlayTutorialBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        i10 = t.i();
        this.tutorialTexts = i10;
        inflate.speechBubbleView.setConfirmationButtonVisibility(8);
        inflate.speechBubbleView.setShowNextListener(new SpeechBubbleView.ShowNextListener() { // from class: com.habitrpg.android.habitica.ui.TutorialView.1
            @Override // com.habitrpg.android.habitica.ui.SpeechBubbleView.ShowNextListener
            public void showNextStep() {
                TutorialView.this.displayNextTutorialText();
            }
        });
        inflate.speechBubbleView.getBinding$Habitica_2311256681_prodRelease().completeButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialView._init_$lambda$0(TutorialView.this, view);
            }
        });
        inflate.speechBubbleView.getBinding$Habitica_2311256681_prodRelease().dismissButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialView._init_$lambda$1(TutorialView.this, view);
            }
        });
        inflate.background.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialView._init_$lambda$2(TutorialView.this, view);
            }
        });
        if (tutorialStep.getLinkFAQ()) {
            inflate.speechBubbleView.getBinding$Habitica_2311256681_prodRelease().dismissButton.setText(R.string.visit_faq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TutorialView tutorialView, View view) {
        q.i(tutorialView, "this$0");
        tutorialView.completeButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TutorialView tutorialView, View view) {
        q.i(tutorialView, "this$0");
        tutorialView.dismissButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(TutorialView tutorialView, View view) {
        q.i(tutorialView, "this$0");
        tutorialView.backgroundClicked();
    }

    private final void backgroundClicked() {
        SpeechBubbleView speechBubbleView = this.binding.speechBubbleView;
        q.h(speechBubbleView, "speechBubbleView");
        speechBubbleView.onClick(speechBubbleView);
    }

    private final void completeButtonClicked() {
        this.onReaction.onTutorialCompleted(this.step);
        post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                TutorialView.completeButtonClicked$lambda$3(TutorialView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void completeButtonClicked$lambda$3(TutorialView tutorialView) {
        ViewGroup viewGroup;
        q.i(tutorialView, "this$0");
        ViewParent parent = tutorialView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(tutorialView);
        }
    }

    private final void dismissButtonClicked() {
        post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                TutorialView.dismissButtonClicked$lambda$4(TutorialView.this);
            }
        });
        if (this.step.getLinkFAQ()) {
            this.onReaction.onTutorialCompleted(this.step);
            MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.FAQOverviewFragment, null, 2, null);
            return;
        }
        this.onReaction.onTutorialDeferred(this.step);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissButtonClicked$lambda$4(TutorialView tutorialView) {
        ViewGroup viewGroup;
        q.i(tutorialView, "this$0");
        ViewParent parent = tutorialView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(tutorialView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayNextTutorialText() {
        int i10 = this.currentTextIndex + 1;
        this.currentTextIndex = i10;
        if (i10 < this.tutorialTexts.size()) {
            this.binding.speechBubbleView.animateText(this.tutorialTexts.get(this.currentTextIndex));
            if (isDisplayingLastStep()) {
                this.binding.speechBubbleView.setConfirmationButtonVisibility(0);
                this.binding.speechBubbleView.setHasMoreContent(false);
                return;
            }
            this.binding.speechBubbleView.setHasMoreContent(true);
            return;
        }
        this.onReaction.onTutorialCompleted(this.step);
    }

    private final boolean isDisplayingLastStep() {
        if (this.currentTextIndex == this.tutorialTexts.size() - 1) {
            return true;
        }
        return false;
    }

    public final TutorialStep getStep() {
        return this.step;
    }

    public final void setCanBeDeferred(boolean z10) {
        int i10;
        Button button = this.binding.speechBubbleView.getBinding$Habitica_2311256681_prodRelease().dismissButton;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        button.setVisibility(i10);
    }

    public final void setTutorialText(String str) {
        q.i(str, "text");
        this.binding.speechBubbleView.animateText(str);
        this.binding.speechBubbleView.setConfirmationButtonVisibility(0);
    }

    public final void setTutorialTexts(List<String> list) {
        Object a02;
        q.i(list, "texts");
        if (list.size() == 1) {
            a02 = b0.a0(list);
            setTutorialText((String) a02);
            return;
        }
        this.tutorialTexts = list;
        this.currentTextIndex = -1;
        displayNextTutorialText();
    }
}
