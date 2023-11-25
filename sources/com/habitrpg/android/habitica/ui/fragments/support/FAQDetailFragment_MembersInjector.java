package com.habitrpg.android.habitica.ui.fragments.support;

import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class FAQDetailFragment_MembersInjector implements qa.a<FAQDetailFragment> {
    private final cc.a<FAQRepository> faqRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public FAQDetailFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<FAQRepository> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.faqRepositoryProvider = aVar4;
    }

    public static qa.a<FAQDetailFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<FAQRepository> aVar4) {
        return new FAQDetailFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectFaqRepository(FAQDetailFragment fAQDetailFragment, FAQRepository fAQRepository) {
        fAQDetailFragment.faqRepository = fAQRepository;
    }

    public void injectMembers(FAQDetailFragment fAQDetailFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(fAQDetailFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(fAQDetailFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(fAQDetailFragment, this.soundManagerProvider.get());
        injectFaqRepository(fAQDetailFragment, this.faqRepositoryProvider.get());
    }
}
