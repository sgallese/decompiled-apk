package com.habitrpg.android.habitica.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import e4.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: BaseFragment.kt */
/* loaded from: classes4.dex */
public abstract class BaseFragment<VB extends e4.a> extends Fragment {
    public static final int $stable = 8;
    private boolean isModal;
    public TutorialRepository tutorialRepository;
    private String tutorialStepIdentifier;
    private boolean tutorialCanBeDeferred = true;
    private List<String> tutorialTexts = new ArrayList();
    private boolean shouldInitializeComponent = true;

    private final void showTutorialIfNeeded() {
        String str = this.tutorialStepIdentifier;
        if (str != null) {
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new BaseFragment$showTutorialIfNeeded$1$1(this, str, null), 1, null);
        }
    }

    public boolean addToBackStack() {
        return true;
    }

    public abstract VB createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract VB getBinding();

    public String getDisplayedClassName() {
        return getClass().getSimpleName();
    }

    public final boolean getShouldInitializeComponent() {
        return this.shouldInitializeComponent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getTutorialCanBeDeferred() {
        return this.tutorialCanBeDeferred;
    }

    public final TutorialRepository getTutorialRepository() {
        TutorialRepository tutorialRepository = this.tutorialRepository;
        if (tutorialRepository != null) {
            return tutorialRepository;
        }
        qc.q.z("tutorialRepository");
        return null;
    }

    public final String getTutorialStepIdentifier() {
        return this.tutorialStepIdentifier;
    }

    public final List<String> getTutorialTexts() {
        return this.tutorialTexts;
    }

    public final boolean isModal() {
        return this.isModal;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setBinding(createBinding(layoutInflater, viewGroup));
        VB binding = getBinding();
        if (binding != null) {
            return binding.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        try {
            getTutorialRepository().close();
        } catch (UninitializedPropertyAccessException unused) {
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        setBinding(null);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        showTutorialIfNeeded();
    }

    public abstract void setBinding(VB vb2);

    public final void setModal(boolean z10) {
        this.isModal = z10;
    }

    public final void setShouldInitializeComponent(boolean z10) {
        this.shouldInitializeComponent = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setTutorialCanBeDeferred(boolean z10) {
        this.tutorialCanBeDeferred = z10;
    }

    public final void setTutorialRepository(TutorialRepository tutorialRepository) {
        qc.q.i(tutorialRepository, "<set-?>");
        this.tutorialRepository = tutorialRepository;
    }

    public final void setTutorialStepIdentifier(String str) {
        this.tutorialStepIdentifier = str;
    }

    public final void setTutorialTexts(List<String> list) {
        qc.q.i(list, "<set-?>");
        this.tutorialTexts = list;
    }
}
