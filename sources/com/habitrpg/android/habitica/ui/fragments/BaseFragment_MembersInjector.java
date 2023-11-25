package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.TutorialRepository;
import e4.a;

/* loaded from: classes4.dex */
public final class BaseFragment_MembersInjector<VB extends e4.a> implements qa.a<BaseFragment<VB>> {
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;

    public BaseFragment_MembersInjector(cc.a<TutorialRepository> aVar) {
        this.tutorialRepositoryProvider = aVar;
    }

    public static <VB extends e4.a> qa.a<BaseFragment<VB>> create(cc.a<TutorialRepository> aVar) {
        return new BaseFragment_MembersInjector(aVar);
    }

    public static <VB extends e4.a> void injectTutorialRepository(BaseFragment<VB> baseFragment, TutorialRepository tutorialRepository) {
        baseFragment.tutorialRepository = tutorialRepository;
    }

    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        injectMembers((BaseFragment) ((BaseFragment) obj));
    }

    public void injectMembers(BaseFragment<VB> baseFragment) {
        injectTutorialRepository(baseFragment, this.tutorialRepositoryProvider.get());
    }
}
