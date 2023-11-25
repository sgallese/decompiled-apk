package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.TutorialRepository;
import e4.a;

/* loaded from: classes4.dex */
public final class BaseDialogFragment_MembersInjector<VB extends e4.a> implements qa.a<BaseDialogFragment<VB>> {
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;

    public BaseDialogFragment_MembersInjector(cc.a<TutorialRepository> aVar) {
        this.tutorialRepositoryProvider = aVar;
    }

    public static <VB extends e4.a> qa.a<BaseDialogFragment<VB>> create(cc.a<TutorialRepository> aVar) {
        return new BaseDialogFragment_MembersInjector(aVar);
    }

    public static <VB extends e4.a> void injectTutorialRepository(BaseDialogFragment<VB> baseDialogFragment, TutorialRepository tutorialRepository) {
        baseDialogFragment.tutorialRepository = tutorialRepository;
    }

    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        injectMembers((BaseDialogFragment) ((BaseDialogFragment) obj));
    }

    public void injectMembers(BaseDialogFragment<VB> baseDialogFragment) {
        injectTutorialRepository(baseDialogFragment, this.tutorialRepositoryProvider.get());
    }
}
